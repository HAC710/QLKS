
package DAL;

import DTO.Customer;
import java.util.ArrayList;
import javax.swing.JTable;


public class DAL_QLCustomer {
    public static  Customer GetCustomer(JTable t){
        String sql = "Select * from Customer";
        int id = Integer.parseInt((String) DB_Helper.GetRecords(sql, t).getValueAt(0, 0));
        String name = (String) DB_Helper.GetRecords(sql, t).getValueAt(0, 1);
        int age = Integer.parseInt((String) DB_Helper.GetRecords(sql, t).getValueAt(0, 2));
        String adress = (String) DB_Helper.GetRecords(sql, t).getValueAt(0, 3);
        int phone = Integer.parseInt((String) DB_Helper.GetRecords(sql, t).getValueAt(0, 4));
        boolean type = Boolean.parseBoolean((String) DB_Helper.GetRecords(sql, t).getValueAt(0, 5));
        boolean gender = Boolean.parseBoolean((String) DB_Helper.GetRecords(sql, t).getValueAt(0, 6));
        return new Customer(id,name,age,adress,phone,type,gender);
    }
    
}
