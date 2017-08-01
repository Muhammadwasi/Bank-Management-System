
import javax.swing.JOptionPane;

public class BillPayment {

    String consumerNo, billId, billName, accNo;
    double amount;
    Account na;

    public BillPayment(String billName) {
        na = new Account();
        this.billName = billName;
        accNo = getAccNo(this.billName);
    }

    public String getAccNo(String billName) {
        if (billName == "IBA") {
            accNo = "100001";
        } else if (billName == "SSGC") {
            accNo = "100002";
        } else {
            accNo = "100003";
        }
        return accNo;
    }

    public void depositBill(double amount, String consumerId, String billMonSem) {
        try {
            na.mang.rs = na.mang.stmt.executeQuery("Select Amount from AccountsInfo where AccountNo=" + accNo);

            na.mang.rs.first();

            double total = na.mang.rs.getDouble("Amount") + amount;
            if (total > (9.999999999E9)) {
                JOptionPane.showMessageDialog(null, "Deposit Amount exceeds limit !!");
            } else {
                String sql = "UPDATE AccountsInfo "
                        + "SET Amount=" + total + " WHERE AccountNo=" + accNo;
                na.mang.prestmt = na.mang.conn.prepareStatement(sql);
                na.mang.prestmt.executeUpdate();

                na.mang.prestmt = na.mang.conn.prepareStatement("insert into "
                        + billName + "(BillID,ConsumerNo,BillMonthSem,Amount,CurrentDate,CurrentTime)"
                        + " values(?,?,?,?,?,?)");
                billId = na.getId("BillID", billName);
                na.mang.prestmt.setString(1, billId);
                na.mang.prestmt.setString(2, consumerId);
                na.mang.prestmt.setString(3, billMonSem);
                na.mang.prestmt.setDouble(4, amount);
                na.mang.prestmt.setString(5, na.mang.getDate());
                na.mang.prestmt.setString(6, na.mang.getTime());
                na.mang.prestmt.execute();
                JOptionPane.showMessageDialog(null, amount + " rupees are deposited by user having ID '" + consumerId + "'");
            }
        } catch (Exception e) {
            System.out.println("depositBill exception  " + e);
        }
    }
}
