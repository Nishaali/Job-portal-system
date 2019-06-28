/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
/**
 *
 * @author harshsree
 */
public class Jobportal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Connection conn=null;
        try
        {
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName="Harshsree";
            String serverPort="1521";
            String sid="XE";
            String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username="system";
            String password="sreenidhi1";
            conn=DriverManager.getConnection(url,username,password);
            System.out.println("Successfully connected to database");
        }
        
        catch(ClassNotFoundException e)
        {
            System.out.println("couldnot find database server"+e.getMessage());
        }
        catch(SQLException e)
        {
            System.out.println("could not connect to database"+e.getMessage());
        }
  
       catch(Exception e)
       {
           e.printStackTrace();
       }
        new Loginpage().setVisible(true);
     }
 }