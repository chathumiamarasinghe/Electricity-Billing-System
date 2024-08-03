
package main.java.bs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import main.java.bs.interfaces.ICustomerDAO;
import main.java.bs.model.Customer;
import main.java.bs.utility.DBConnection;


public class CustomerDAO implements ICustomerDAO {
    
    private static final String INSERT_CUSTOMER = "INSERT INTO customer(first_name, last_name, email, "
                                            + "password)"
                                            + "VALUES(?, ?, ?, ?);";
    
    @Override
    public boolean insertCustomer(Customer customer) {
        
      System.out.println(INSERT_CUSTOMER);
      boolean rowInserted = false;
      
      try{
          
          Connection con = DBConnection.getConnection();
          PreparedStatement stmt = con.prepareStatement(INSERT_CUSTOMER);
          
          stmt.setString(1, customer.getFirst_name()); 
          stmt.setString(2,customer.getLast_name());
          stmt.setString(3, customer.getEmail());
          stmt.setString(4, customer.getPassword());
          
          stmt.executeUpdate();
          
          
          rowInserted = true;
          
      }catch(Exception e){
          e.printStackTrace();
      }
        
      return rowInserted;
    }
}
