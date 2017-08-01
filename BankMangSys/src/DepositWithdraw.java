
import javax.swing.JOptionPane;

public class DepositWithdraw {

    public String depositId, withdrawId, transId, fromAccNo, toAccNo, name;
    public double amount;
    Account na = new Account();

    public DepositWithdraw() { //simple constructor

    }

    public DepositWithdraw(String fromAccNo, String toAccNo, String name) { //tranfer money
        this.fromAccNo = fromAccNo;
        this.toAccNo = toAccNo;
        this.name = name;
    }

    public DepositWithdraw(String fromAccNo, String name) {//deposit and withdraw
        this.fromAccNo = fromAccNo;
        this.name = name;
    }

    public void deposit(double amount) {
        try {
            na.mang.rs = na.mang.stmt.executeQuery("Select Amount from AccountsInfo where AccountNo=" + fromAccNo);
            if (na.mang.rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Dear User! The Account Number doesnot exist");
            } else {
                na.mang.rs.first();
                double total = na.mang.rs.getDouble("Amount") + amount;
                if (total > (9.999999999E9)) {
                    JOptionPane.showMessageDialog(null, "Deposit Amount exceeds limit !!");
                } else {
                    String sql = "UPDATE AccountsInfo "
                            + "SET Amount=" + total + " WHERE AccountNo=" + fromAccNo;
                    na.mang.prestmt = na.mang.conn.prepareStatement(sql);
                    na.mang.prestmt.executeUpdate();

                    na.mang.prestmt = na.mang.conn.prepareStatement("insert into "
                            + "Deposit(DepositID,AccountNo,Person_Name,DepositAmount,DepositDate,DepositTime)"
                            + " values(?,?,?,?,?,?)");
                    depositId = na.getId("DepositID", "Deposit");
                    na.mang.prestmt.setString(1, depositId);
                    na.mang.prestmt.setString(2, fromAccNo);
                    na.mang.prestmt.setString(3, name);
                    na.mang.prestmt.setDouble(4, amount);
                    na.mang.prestmt.setString(5, na.mang.getDate());
                    na.mang.prestmt.setString(6, na.mang.getTime());
                    na.mang.prestmt.execute();
                    try {
                        Receipt rec = new Receipt();
                        rec.Name.setText(name);
                        rec.Id.setText(depositId);
                        rec.AccNo.setText(fromAccNo);
                        rec.WithdrawDeposit.setText("Deposited Amount");
                        rec.CBalance.setText(String.valueOf(total));
                        rec.Amount.setText(String.valueOf(amount));
                        rec.show();
                    } catch (Exception e) {
                        System.out.println("Deposit Receipt Exceotion" + e);
                    }
                    JOptionPane.showMessageDialog(null, amount + " rupees deposited in account '" + fromAccNo + "'");
                }
            }
        } catch (Exception e) {
            System.out.println("deposit exception  " + e);
        }
    }

    public void withdraw(double amount) {
        try {
            na.mang.rs = na.mang.stmt.executeQuery("Select Amount from AccountsInfo where AccountNo=" + fromAccNo);
            if (na.mang.rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Dear User! The Account Number doesnot exist");
            } else {
                na.mang.rs.first();
                double total = na.mang.rs.getDouble("Amount") - amount;
                if (total < (1.000E3)) {
                    JOptionPane.showMessageDialog(null, "Withdraw amount falls below limit !!");
                } else {
                    String sql = "UPDATE AccountsInfo "
                            + "SET Amount=" + total + " WHERE AccountNo=" + fromAccNo;
                    na.mang.prestmt = na.mang.conn.prepareStatement(sql);
                    na.mang.prestmt.executeUpdate();
                    na.mang.prestmt = na.mang.conn.prepareStatement("insert into "
                            + "Withdraw(WithdrawID,AccountNo,Person_Name,WithdrawAmount,WithdrawDate,WithdrawTime)"
                            + " values(?,?,?,?,?,?)");
                    withdrawId = na.getId("WithdrawID", "Withdraw");
                    na.mang.prestmt.setString(1, withdrawId);
                    na.mang.prestmt.setString(2, fromAccNo);
                    na.mang.prestmt.setString(3, name);
                    na.mang.prestmt.setDouble(4, amount);
                    na.mang.prestmt.setString(5, na.mang.getDate());
                    na.mang.prestmt.setString(6, na.mang.getTime());
                    na.mang.prestmt.execute();
                    try {
                        Receipt rec = new Receipt();
                        rec.Name.setText(name);
                        rec.Id.setText(withdrawId);
                        rec.WithdrawDeposit.setText("Withdrawn Amount");
                        rec.AccNo.setText(fromAccNo);
                        rec.CBalance.setText(String.valueOf(total));
                        rec.Amount.setText(String.valueOf(amount));
                        rec.show();
                    } catch (Exception e) {
                        System.out.println("Withdraw Receipt Exceotion" + e);
                    }
                    JOptionPane.showMessageDialog(null, amount + " rupees withdrawn from account '" + fromAccNo + "'");
                }
            }
        } catch (Exception e) {
            System.out.println("withdraw exception " + e);
        }
    }

    public void transferMoney(double amount) {
        try {//try 1 (withdraw try)
            System.out.println("setting auto save false");
            na.mang.conn.setAutoCommit(false);
            na.mang.rs = na.mang.stmt.executeQuery("Select Amount from AccountsInfo where AccountNo=" + fromAccNo);
            System.out.println("Hurrah");
            if (na.mang.rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Dear User! From Account Number doesnot exist");
            } else {
                na.mang.rs.first();
                double total = na.mang.rs.getDouble("Amount") - amount;
                System.out.println("transfer by acc " + total);
                if (total < (1.000E3)) {
                    JOptionPane.showMessageDialog(null, "Withdraw amount falls below limit !!");
                } else {
                    String sql = "UPDATE AccountsInfo "
                            + "SET Amount=" + total + " WHERE AccountNo=" + fromAccNo;
                    na.mang.prestmt = na.mang.conn.prepareStatement(sql);
                    na.mang.prestmt.executeUpdate();

                    try { //try 2(deposit try)
                        na.mang.rs = na.mang.stmt.executeQuery("Select Amount from AccountsInfo where AccountNo=" + toAccNo);
                        if (na.mang.rs.next() == false) {
                            JOptionPane.showMessageDialog(null, "Dear User! To Account Number doesnot exist");
                            na.mang.conn.rollback();
                            System.out.println("Roll backing data");
                        } else {
                            na.mang.rs.first();
                            double total2 = na.mang.rs.getDouble("Amount") + amount;
                            System.out.println("transfer to acc " + total2);
                            if (total2 > (9.999999999E9)) {
                                JOptionPane.showMessageDialog(null, "Deposit Amount exceeds limit !!");
                            } else {
                                String sql2 = "UPDATE AccountsInfo "
                                        + "SET Amount=" + total2 + " WHERE AccountNo=" + toAccNo;
                                na.mang.prestmt = na.mang.conn.prepareStatement(sql2);
                                na.mang.prestmt.executeUpdate();
                                System.out.println("Now committing data ");
                                na.mang.prestmt = na.mang.conn.prepareStatement("insert into "
                                        + "TransferMoney(TransID,FromAccountNo,ToAccountNo,Person_Name,Amount,TransDate,TransTime)"
                                        + " values(?,?,?,?,?,?,?)");
                                transId = na.getId("TransID", "TransferMoney");
                                na.mang.prestmt.setString(1, transId);
                                na.mang.prestmt.setString(2, fromAccNo);
                                na.mang.prestmt.setString(3, toAccNo);
                                na.mang.prestmt.setString(4, name);
                                na.mang.prestmt.setDouble(5, amount);
                                na.mang.prestmt.setString(6, na.mang.getDate());
                                na.mang.prestmt.setString(7, na.mang.getTime());
                                na.mang.prestmt.execute();
                                na.mang.conn.commit();// apply/commit the changes
                                try {//try 3(Receipt try)
                                    Receipt rec = new Receipt();
                                    rec.Name.setText(name);
                                    rec.Id.setText(transId);
                                    rec.WithdrawDeposit.setText("Transferred Money");
                                    rec.AccNo.setText(fromAccNo);
                                    rec.Transferto.setText("Transfer to(Account No.)");
                                    rec.Transferby.setText("Transfer by(Account No.)");
                                    rec.toAccNo.setText(toAccNo);
                                    rec.CBalance.setText(String.valueOf(total));//display current balance of transferby
                                    rec.Amount.setText(String.valueOf(amount));//tra
                                    rec.show();
                                } catch (Exception e) { //catch 3(receipt catch)
                                    System.out.println("transfer Receipt Exceotion" + e);
                                }
                            }
                        }
                        //store in database table TransferMoney
                    } catch (Exception e) { //catch 2(deposit catch)
                        System.out.println("deposit exception from transferMoney  " + e);
                        na.mang.conn.rollback();
                        System.out.println("Roll backing data");
                    }
                }//end of second else
            }//end of first else
        } catch (Exception e) { //catch 1(withdraw catch)
            System.out.println("withdraw exception from transferMoney " + e);
        }
        try {
            na.mang.conn.setAutoCommit(true);
        } catch (Exception e) {
            System.out.println("setting auto commit true exception" + e);

        }
    }

}
