/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;
import java.sql.*;
import Database.Connect;

/**
 *
 * @author Astronaut
 */
public class Contact {
    public Connect cn = new Connect();
    
    //Querry
    public ResultSet ShowContact() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * FROM CONTACT WHERE ID =" + 1;
        return cn.LoadData(sql);  
    }
    
    //
    public void EditData(String name, String tel, String email, String address) throws SQLException{               
        String sql = "Update CONTACT set NameGroup=N'" + name + "', Tel='"+tel+"', Email=N'"+email+"', AddressGroup=N'"+address+"' where ID=" + 1;                    
        cn.UpdateData(sql);         
    } 
}
