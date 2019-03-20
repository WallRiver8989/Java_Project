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
public class Branch {
    public Connect cn = new Connect();
    
    //Select * Table Branch
    public ResultSet ShowAllBranch() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * FROM BRANCH";
        return cn.LoadData(sql);
    }
    
    //Querry Branch By ID
    public ResultSet ShowBranch(String ml) throws SQLException{
        String sql = "SELECT * FROM BRANCH WHERE ID =" + ml + "";
        return cn.LoadData(sql);
    }
    
    //Add Data Branch
    public void InsertData(String name,String tel,String address) throws SQLException{
        String sql = "INSERT INTO BRANCH VALUES(N'"+name+"','"+tel+"',N'"+address+"')";
        cn.UpdateData(sql);
    }
    
    //Edit Data Branch
    public void EditData(String id,String name,String tel,String address) throws SQLException{
        String sql = "UPDATE BRANCH SET Name=N'"+name+"',Tel='"+tel+"',AddressBranch=N'"+address+"' WHERE ID="+id;
        cn.UpdateData(sql);
    }
    
    //Del Data Branch
    public void DelData(String id) throws SQLException{
        String sql = "DELETE FROM BRANCH WHERE ID="+id;
        cn.UpdateData(sql);
    }
}
