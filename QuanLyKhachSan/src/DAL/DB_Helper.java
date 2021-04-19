
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DB_Helper {
    
    private DB_Helper() {}
    
    public static DefaultTableModel GetRecords(String sql, JTable t){
        DefaultTableModel s = (DefaultTableModel)t.getModel();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
            String url = "jdbc:ucanaccess://C:\\Users\\PHONG VU\\Documents\\Database\\QLKS.accdb";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String id = String.valueOf(rs.getInt("idCustomer"));
                String name = rs.getString("nameCustomer");
                String age = String.valueOf(rs.getInt("ageCustomer"));
                String adress = rs.getString("addressCustomer");
                String phone = String.valueOf(rs.getInt("phoneNumber"));
                String type = String.valueOf(rs.getBoolean("idTypeCustomer"));
                String gender = String.valueOf(rs.getBoolean("genderCustomer"));
                String[] Data = {id,name,age,adress,phone,type,gender};
                s.addRow(Data);
            }
        } catch (Exception e) {
            System.out.println("error occured"+e);
        }
        return s;
    }
}
