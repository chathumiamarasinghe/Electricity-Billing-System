
package main.java.bs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import main.java.bs.interfaces.IBillDAO;
import main.java.bs.model.Bill;
import main.java.bs.utility.DBConnection;


public class BillDAO implements IBillDAO {
    
    private static final String INSERT_Bill = "INSERT INTO electricitybill(customer_id, starting_meter_reading, ending_meter_reading, "
                                            + "start_date, end_date, units_consumed, total_cost)"
                                            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
    @Override
    public boolean insertBill(Bill Bill) {
        
      System.out.println(INSERT_Bill);
      boolean rowInserted = false;
      
      try{
          
          Connection con = DBConnection.getConnection();
          PreparedStatement stmt = con.prepareStatement(INSERT_Bill);
          
          stmt.setInt(1, Bill.getBill_id()); 
          stmt.setInt(2,Bill.getCustomer_id());
          stmt.setInt(3, Bill.getstarting_meter_reading());
          stmt.setInt(4, Bill.getending_meter_reading());
          stmt.setObject(5, Bill.getstart_date());
          stmt.setObject(6, Bill.getend_date());
          stmt.setDouble(7, Bill.getunits_consumed());
          stmt.setDouble(8, Bill.gettotal_cost());
          
          
          stmt.executeUpdate();
          
          
          rowInserted = true;
          
      }catch(Exception e){
          e.printStackTrace();
      }
        
      return rowInserted;
    

    }
}