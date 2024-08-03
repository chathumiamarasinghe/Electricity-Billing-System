
package main.java.bs.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
  private static String url="jdbc:mysql://localhost:3306/EnergyWise?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
  private static String user="root";
  private static String password="";
  
  private static Connection con = null;
  
  public static Connection getConnection(){
            
            try{
                
                //Load the jdbc Driver class dynamicaaly
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //The Java DriverManager class's getConnection() method attempts to establish a connection to a database using the given database URL
                con = (Connection) DriverManager.getConnection(url, user, password);
                
            }catch(ClassNotFoundException | SQLException e){
                
                System.out.println("Database connectivity failed.");
                
            }
            
            return con;
        }
  
  
}
