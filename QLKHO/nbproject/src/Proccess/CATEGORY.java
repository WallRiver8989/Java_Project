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
 * @author Hai
 */
public class CATEGORY {
    public Connect cn= new Connect();   
    
    //Truy van tat ca du lieu trong Table LoaiSP         
    public ResultSet ShowLoaiSP() throws SQLException{               
        cn.connectSQL();            
        String sql = "SELECT * FROM CATEGORY";                    
        return cn.LoadData(sql);         
    }  
    
    //Truy van cac dong du lieu trong Table LoaiSP theo Maloai         
    public ResultSet ShowLoaiSP(String ml) throws SQLException{               
        String sql = "SELECT * FROM CATEGORY where ID='" + ml +"'";                    
        return cn.LoadData(sql);         
    }  
    
    //Theo moi 1 dong du lieu vao table LoaiSP         
    public void InsertData(String tl) throws SQLException{               
        String sql = "INSERT INTO CATEGORY values(N'" + tl +"')";             
        cn.UpdateData(sql);         
    }   
    
    //Dieu chinh 1 dong du lieu vao table LoaiSP        
    public void EditData(String ml, String tl) throws SQLException{               
        String sql = "Update CATEGORY set NAME=N'" + tl + "' where ID='" + ml +"'";                    
        cn.UpdateData(sql);         
    }    
    
    //Xoa 1 dong du lieu vao table LoaiSP        
    public void DeleteData(String ml) throws SQLException{               
        String sql = "Delete from CATEGORY where ID='" + ml +"'";                    
        cn.UpdateData(sql);         
    }
}
