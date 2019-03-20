
package Proccess;
import java.sql.*;
import Database.Connect;
/**
 *
 * @author Admin
 */
public class Staff {
    public Connect cn = new Connect();
    
    //Select * Table staff
    public ResultSet ShowAllStaff() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * FROM STAFF";
        return cn.LoadData(sql);
    }
    
    //Querry Branch By ID
    public ResultSet ShowStaff(String ml) throws SQLException{
        String sql = "SELECT * FROM STAFF WHERE ID =" + ml + "";
        return cn.LoadData(sql);
    }
    
    //Add Data staff
    public void InsertData(String name,String tel,String address,String email) throws SQLException{
        String sql = "INSERT INTO STAFF VALUES(N'"+name+"','"+tel+"',N'"+address+"','"+email+"')";
        cn.UpdateData(sql);
    }
    
    //Edit Data staff
    public void EditData(String id,String name,String tel,String address,String email) throws SQLException{
        String sql = "UPDATE STAFF SET Name=N'"+name+"',Tel='"+tel+"',AddressStaff=N'"+address+"',Email='"+email+"' WHERE ID="+id;
        cn.UpdateData(sql);
    }
    
    //Del Data staff
    public void DelData(String id) throws SQLException{
        String sql = "DELETE FROM STAFF WHERE ID="+id;
        cn.UpdateData(sql);
    }
}
