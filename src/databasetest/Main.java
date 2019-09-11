/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author George
*/

public class Main{
        private static Connection con;
        private static Statement stm;
        private static  ResultSet rset=null;
        private static  String sqlA="SELECT * FROM Students ";
        private static  String sqlB="SELECT * FROM Lessons";
    public static void main(String[] args){
        
        Conenctor connector=new Conenctor();
        
        con=connector.start();
        try {
            stm=con.createStatement();
            rset = stm.executeQuery(sqlA);
            rset = stm.executeQuery(sqlB);
            while(rset.next()){
            System.out.println("ID:"+rset.getString("id")+" Name:"+rset.getString("FirstName")+" Last Name:"+rset.getString("LastName"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
