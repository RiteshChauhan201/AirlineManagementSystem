/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AMS;
import java.sql.*;
/**
 *
 * @author balgurjotsingh
 */
public class ConnectionClass {
    Connection con;
    Statement stm;
    
    ConnectionClass(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","Garry9466909999");
            stm=con.createStatement();
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new ConnectionClass();
    }
    
}
