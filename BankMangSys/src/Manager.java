
import java.sql.*;
import javax.swing.JOptionPane;

public class Manager {

    public String MangID, MangPass, MangName;
    public Connection conn;
    public Statement stmt;
    public PreparedStatement prestmt;
    public ResultSet rs;
    public java.util.Date javaDate;
    
    public Manager() {
        connect();
    }

    // method for creating link with access
    public Connection connect() {
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://A:\\BankMangSys.accdb");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        } catch (Exception e) {
            System.out.println("connect exception " + e);
        }
        return conn;
    }
    public void closeConn(){
        try{
            if(!(conn == null)){
               conn.close();
            }
        }catch(Exception e){
            System.out.println("close exception "+e);
        }
    }
    public boolean checkID(String id) {
        boolean checkID = false;
        try {
            String sql = "SELECT * FROM ManagersInfo WHERE MangId =?";
            prestmt = connect().prepareStatement(sql);
            prestmt.setString(1, id);
            rs = prestmt.executeQuery();
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "User Id is invalid");
                checkID = false;
            } else {
                checkID = true;
            }
        } catch (Exception e) {
            System.out.println("Manager CheckID exception==" + e);
        }

        return checkID;
    }

    public String getDate() {
        javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        //Get and display SQL DATE
        java.sql.Date sqlDate = new java.sql.Date(javaTime);
        return sqlDate.toString();
    }

    public String getTime() {
        javaDate = new java.util.Date();
        long javaTime = javaDate.getTime();
        //Get and display SQL TIME
        java.sql.Time sqlTime = new java.sql.Time(javaTime);
        return sqlTime.toString();
    }

    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.show();
    }

}
