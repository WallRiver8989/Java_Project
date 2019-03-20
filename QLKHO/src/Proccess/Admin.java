/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import Database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hai
 */
public class Admin {
     public Connect cn= new Connect();   
    
    //Truy van tat ca du lieu trong Table LoaiSP         
    public ResultSet ShowAllAdmin() throws SQLException{               
        cn.connectSQL();            
        String sql = "SELECT * FROM ADMIN";                    
        return cn.LoadData(sql);         
    }  
    
    //Truy van cac dong du lieu trong Table LoaiSP theo Maloai         
    public ResultSet ShowAdmin(String id) throws SQLException{               
        String sql = "SELECT * FROM ADMIN where ID='" + id +"'";                    
        return cn.LoadData(sql);         
    }  
    
    //Theo moi 1 dong du lieu vao table LoaiSP         
    public void InsertData(String n, String account, String pw, String mail, String tel) throws SQLException{               
        String sql = "INSERT INTO ADMIN values(N'" + n +"',N'" + account +"',N'" + pw +"',N'" + mail +"','"+tel+"')";             
        cn.UpdateData(sql);         
    }   
    
    //Dieu chinh 1 dong du lieu vao table LoaiSP        
    public void EditData(String id, String n, String account, String pw, String mail, String tel) throws SQLException{               
        String sql = "Update ADMIN set Name=N'" + n + "', Account=N'"+account+"', PasswordAdmin=N'"+pw+"', Email=N'"+mail+"', Tel=N'"+tel+"' where ID='" + id +"'";                    
        cn.UpdateData(sql);         
    }    
    
    //Xoa 1 dong du lieu vao table LoaiSP        
    public void DeleteData(String id) throws SQLException{               
        String sql = "Delete from ADMIN where ID='" + id +"'";                    
        cn.UpdateData(sql);         
    }
}
