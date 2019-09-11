/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

import java.sql.*;
import java.sql.*;

/**
 *
 * @author George
 */
public class Conenctor {
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://www.db4free.net:3306/barkaniza?useSSL=false";
    private String user="doug2006";
    private String pass="barkaniza";
    private Connection con=null;
    
    public Connection start(){
        try{
           /* Driver driver= new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);*/
           Class.forName(driver);
           try{
               con=DriverManager.getConnection(url,user,pass);
           }catch (SQLException ex){
               System.out.println("Failed to create the database connection.");
           }           
        }catch (ClassNotFoundException ex){
             System.out.println("Driver not found."); 
        }       
        
        return con;
    }
    
    
}
