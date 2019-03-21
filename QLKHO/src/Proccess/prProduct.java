/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proccess;
import java.sql.*;
import Database.Connect;
import java.lang.String;
/**
 *
 * @author giang
 */
public class prProduct {
    public Connect cn = new Connect();
    
    
    //Truy vấn tất cả sản phẩm
    public ResultSet ShowProduct() throws SQLException
    {
        cn.connectSQL();
        String sql = "SELECT * FROM PRODUCT";
        return cn.LoadData(sql);
    }
    
    //Truy van cac dong du lieu trong Table LoaiSP theo Maloai         
    public ResultSet ShowProduct(String id) throws SQLException{               
    String sql = "SELECT * FROM PRODUCT where id='" + id +"'";                    
    return cn.LoadData(sql);         }
    
    
     //Xoa 1 dong du lieu vao table LoaiSP         
    public void DeleteData(String name) throws SQLException{               
    String sql = "Delete from Product where name='" + name +"'";                    
    cn.UpdateData(sql);         
    }
    
     //Theo moi 1 dong du lieu vao table LoaiSP         
    public void InsertData( String name , String cate ,String branch , String quantity , String description) throws SQLException{               
        String sql = "INSERT INTO PRODUCT values(N'" + name +"',N'"+ cate +"',N'" + branch +"',N'" + quantity +"',N'"+ description +"')";             
        cn.UpdateData(sql);         
    }  
                                
    //Dieu chinh 1 dong du lieu vao table LoaiSP    
    public void EditData(String id, String name , String cate ,String branch , String quantity , String description) throws SQLException{  
       String sql = "Update PRODUCT set Name=N'" + name + "', IDCate='"+cate+"', IDBranch=N'"+branch+"', Quantity=N'"+quantity+"', DescriptionProduct=N'"+description+"' where ID=" + id +"";                   
       
       cn.UpdateData(sql);             
    }
    
     public ResultSet ShowSPTheoloai(String ml) {
         String sql = "SELECT MaSP,TenSP,Dongia,Tenloai  FROM Sanpham S, LoaiSP L  where L.Maloai=S.Maloai and L.Maloai='" + ml +"'";
         return cn.LoadData(sql);         
     } 
    
    
}
