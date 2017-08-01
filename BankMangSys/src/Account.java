
public class Account {

    public String name, fathername, address, gender,
            branchname, contactno, cnicno, acctype, accNo;
    public int branchcode, openbalance, age, month;
    public final int minamount = 1000;
    public double interestrate, balance;
    public Manager mang;

    public Account() {
        mang = new Manager();

    }

    public double interestrate(String acctype) {
        if (acctype.equals("Savings")) {
            interestrate = 0.001;
        } else if (acctype.equals("Current")) {
            interestrate = 0;
        } else {
            interestrate = 0.002;
        }
        return interestrate;
    }

    public void applyinterest() {
        try {
            mang.rs = mang.stmt.executeQuery("select * from AccountsInfo");
            int i = 1;
            while (mang.rs.absolute(i++)) {
                int balance1, revenue, balance2;
                balance1 = mang.rs.getInt("Amount");
                month = mang.rs.getInt("Duration");
                acctype = mang.rs.getString("AccountType");
                accNo = mang.rs.getString("AccountNo");
                balance2 = (int) (balance1 + (balance1 * interestrate(acctype) * month));
                mang.stmt.executeUpdate("update AccountsInfo set Amount= " + balance2 + " where AccountNo=" + accNo);
                mang.rs = mang.stmt.executeQuery("select Revenue from BankRevenue");
                mang.rs.absolute(1);
                revenue = mang.rs.getInt("Revenue");
                revenue = (int) (revenue - (balance1 * interestrate(acctype) * month));
                mang.stmt.executeUpdate("update BankRevenue set Revenue= " + revenue);
                mang.rs = mang.stmt.executeQuery("select * from AccountsInfo");
            }

        } catch (Exception e) {
            System.out.println("Apply Interest " + e);
            mang.closeConn();
        }
    }

    public void applyService() {
        try {
            mang.rs = mang.stmt.executeQuery("select * from AccountsInfo");
            int i = 1;
            while (mang.rs.absolute(i++)) {
                int balance1, revenue, balance2;
                boolean isApplied = false;
                balance1 = mang.rs.getInt("Amount");
                month = mang.rs.getInt("Duration");
                acctype = mang.rs.getString("AccountType");
                accNo = mang.rs.getString("AccountNo");
                if (acctype.equals("Current") && balance1 > 15000) {//do nothing
                    balance2 = balance1;
                } else if (acctype.equals("Savings") && balance1 > 10000 && balance < 1000000) {//do nothing
                    balance2 = balance1;
                } else {
                    balance2 = (int) (balance1 - (0.02 * balance1));
                    isApplied = true;
                }
                mang.stmt.executeUpdate("update AccountsInfo set Amount= " + balance1 + " where AccountNo=" + accNo);
//                }
                if (isApplied) {
                    mang.rs = mang.stmt.executeQuery("select Revenue from BankRevenue");
                    mang.rs.absolute(1);
                    revenue = mang.rs.getInt("Revenue");
                    revenue = (int) (revenue + (0.02 * balance1));
                    mang.stmt.executeUpdate("update BankRevenue set Revenue= " + revenue);
                }
                mang.rs = mang.stmt.executeQuery("select * from AccountsInfo");
            }

        } catch (Exception e) {
            System.out.println("Apply Interest " + e);
                        mang.closeConn();

        }
    }

    public void addData() {
        try {
            mang.prestmt = mang.conn.prepareStatement("insert into AccountsInfo("
                    + "AccountNo,Person_Name,FatherName,Address,ContactNo,"
                    + "CNICNo,Gender,BranchName,Age,BranchCode,Amount,AccountType,AccDate,AccTime,Duration) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            accNo = getId("AccountNo", "AccountsInfo");
            mang.prestmt.setString(1, accNo);
            mang.prestmt.setString(2, name);
            mang.prestmt.setString(3, fathername);
            mang.prestmt.setString(4, address);
            mang.prestmt.setString(5, contactno);
            mang.prestmt.setString(6, cnicno);
            mang.prestmt.setString(7, gender);
            mang.prestmt.setInt(9, age);
            mang.prestmt.setString(8, branchname);
            mang.prestmt.setInt(10, branchcode);
            mang.prestmt.setDouble(11, balance);
            mang.prestmt.setString(12, acctype);
            mang.prestmt.setString(13, mang.getDate());
            mang.prestmt.setString(14, mang.getTime());
            mang.prestmt.setInt(15, month);
            mang.prestmt.execute();

        } catch (Exception e) {
            System.out.println(e);
                        mang.closeConn();

        }
    }

    public String getId(String colName, String tableName) { //general method for getting unique accNo,depositId,trasferId,withdrawId
        try {
            mang.rs = mang.stmt.executeQuery("Select " + colName + " from " + tableName);
            mang.rs.last();
            System.out.println(mang.rs.getString(1));
            if (mang.rs.getString(1).equals("") || mang.rs.getString(1) == null) {
                accNo = "100001";
            } else {
                int i = Integer.parseInt(mang.rs.getString(1)) + 1;
                accNo = String.valueOf(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("accNo" + accNo);
        return accNo;
    }
}
