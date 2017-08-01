
public class AllReports {
    Account na = new Account();
    public void depositReport() {
        DepositReport dr = new DepositReport();
        try {
            String day = na.mang.getDate().substring(8);

            na.mang.rs = na.mang.stmt.executeQuery("Select * from Deposit where DepositDate like '%-%-"+day+"'");
            int i = 0;
            while (na.mang.rs.next()) {
                dr.jTable1.getModel().setValueAt(na.mang.rs.getString("DepositID"), i, 0);
                dr.jTable1.getModel().setValueAt(na.mang.rs.getString("AccountNo"), i, 1);
                dr.jTable1.getModel().setValueAt(na.mang.rs.getString("Person_Name"), i, 2);
                dr.jTable1.getModel().setValueAt(na.mang.rs.getDouble("DepositAmount"), i, 3);
                dr.jTable1.getModel().setValueAt(na.mang.rs.getString("DepositDate"), i, 4);
                dr.jTable1.getModel().setValueAt(na.mang.rs.getString("DepositTime"), i, 5);

                i++;
            }
        } catch (Exception e) {
            System.out.println("exception table" + e);
        }
        dr.show();
    }

    public void withdrawReport() {
        WithdrawReport wr = new WithdrawReport();
        try {
                        String day = na.mang.getDate().substring(8);
            na.mang.rs = na.mang.stmt.executeQuery("Select * from Withdraw where WithdrawDate like '%-%-"+day+"'");
            int i = 0;
            while (na.mang.rs.next()) {
                wr.jTable1.getModel().setValueAt(na.mang.rs.getString("WithdrawID"), i, 0);
                wr.jTable1.getModel().setValueAt(na.mang.rs.getString("AccountNo"), i, 1);
                wr.jTable1.getModel().setValueAt(na.mang.rs.getString("Person_Name"), i, 2);
                wr.jTable1.getModel().setValueAt(na.mang.rs.getDouble("WithdrawAmount"), i, 3);
                wr.jTable1.getModel().setValueAt(na.mang.rs.getString("WithdrawDate"), i, 4);
                wr.jTable1.getModel().setValueAt(na.mang.rs.getString("WithdrawTime"), i, 5);
                i++;
            }
        } catch (Exception e) {
            System.out.println("exception table" + e);
        }
        wr.show();
    }

    public void transferReport() {
        TransferReport tr = new TransferReport();
        try {
                        String day = na.mang.getDate().substring(8);
            na.mang.rs = na.mang.stmt.executeQuery("Select * from TransferMoney where TransDate like '%-%-"+day+"'");
            int i = 0;
            while (na.mang.rs.next()) {
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("TransID"), i, 0);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("FromAccountNo"), i, 1);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("ToAccountNo"), i, 2);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("Person_Name"), i, 3);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getDouble("Amount"), i, 4);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("TransDate"), i, 5);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("TransTime"), i, 6);
                i++;
            }
        } catch (Exception e) {
            System.out.println("exception table" + e);
        }
        tr.show();
    }

    public void IBAFeesReport() {
        IBAFeesReport tr = new IBAFeesReport();
        try {
                        String day = na.mang.getDate().substring(8);
            na.mang.rs = na.mang.stmt.executeQuery("Select * from IBA where CurrentDate like '%-%-"+day+"'");
            int i = 0;
            while (na.mang.rs.next()) {
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("BillID"), i, 0);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("ConsumerNo"), i, 1);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("BillMonthSem"), i, 2);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getDouble("Amount"), i, 3);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("CurrentDate"), i, 4);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("CurrentTime"), i, 5);
                i++;
            }
        } catch (Exception e) {
            System.out.println("exception table" + e);
        }
        tr.show();
    }

    public void KElectricReport() {
        KElectricReport tr = new KElectricReport();
        try {
                        String day = na.mang.getDate().substring(8);
            na.mang.rs = na.mang.stmt.executeQuery("Select * from KElectric where CurrentDate like '%-%-"+day+"'");
            int i = 0;
            while (na.mang.rs.next()) {
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("BillID"), i, 0);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("ConsumerNo"), i, 1);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("BillMonthSem"), i, 2);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getDouble("Amount"), i, 3);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("CurrentDate"), i, 4);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("CurrentTime"), i, 5);
                i++;
            }
        } catch (Exception e) {
            System.out.println("exception table" + e);
        }
        tr.show();
    }

    public void SSGCReport() {
        SSGCReport tr = new SSGCReport();
        try {
            String day = na.mang.getDate().substring(8);
            System.out.println(day);
            na.mang.rs = na.mang.stmt.executeQuery("Select * from SSGC where CurrentDate like '%-%-"+day+"'");
            int i = 0;
            while (na.mang.rs.next()) {
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("BillID"), i, 0);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("ConsumerNo"), i, 1);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("BillMonthSem"), i, 2);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getDouble("Amount"), i, 3);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("CurrentDate"), i, 4);
                tr.jTable1.getModel().setValueAt(na.mang.rs.getString("CurrentTime"), i, 5);
                i++;
            }
        } catch (Exception e) {
            System.out.println("exception table" + e);
        }
        tr.show();
    }
}
