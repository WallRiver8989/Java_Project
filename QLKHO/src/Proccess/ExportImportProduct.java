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
 * @author Astronaut
 */
public class ExportImportProduct {
    public Connect cn= new Connect();   
     
    //All Product  
    public ResultSet ShowAllProduct() throws SQLException{               
        cn.connectSQL();            
        String sql = "SELECT * FROM PRODUCT";                    
        return cn.LoadData(sql);         
    }  
     
    //Get Info Product
    public ResultSet GetInfoProduct(String id) throws SQLException{               
        cn.connectSQL();            
        String sql = "SELECT * FROM PRODUCT WHERE ID ="+id;                    
        return cn.LoadData(sql);         
    }  
    
    //Export
    public void ExportData(String id,int quantity) throws SQLException{               
        String sql = "UPDATE PRODUCT SET Quantity="+quantity+"WHERE ID ="+id;
        cn.UpdateData(sql);         
    } 
    
    //Search
    public ResultSet SearchDataByID(String id) throws SQLException{
        String sql = "SELECT * FROM PRODUCT WHERE ID LIKE'%"+id+"%'";
        return cn.LoadData(sql);
    }
}
