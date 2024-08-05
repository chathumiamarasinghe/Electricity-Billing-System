/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.bs.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import main.java.bs.dao.BillDAO;
import main.java.bs.interfaces.IBillDAO;
import main.java.bs.model.Bill;
/**
 *
 * @author LENOVO
 */
public class BillController {
    
    private final IBillDAO BillDAO;
    
    public BillController(){
        
        this.BillDAO = new BillDAO();
    }   
    public void insertBill(int starting_meter_reading, int ending_meter_reading, LocalDateTime start_date, LocalDateTime end_date, 
            int units_consumed)
    {
        
        Bill bill = new Bill();
       // bill.setCustomer_id(customer_id);
        bill.setstarting_meter_reading(starting_meter_reading);
        bill.setending_meter_reading(ending_meter_reading);
        bill.setstart_date(start_date);
        bill.setend_date(end_date);
        bill.setunits_consumed(ending_meter_reading-starting_meter_reading);
       // bill.settotal_cost(total_cost);

        BillDAO.insertBill(bill);
    }
    

    }   

