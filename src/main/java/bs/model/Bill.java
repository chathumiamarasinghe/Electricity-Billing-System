/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.bs.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Bill {
    private int bill_id;
    private int customer_id;
    private int starting_meter_reading;
    private int ending_meter_reading;
    private Date start_date;
    private Date end_date;
    private int units_consumed;
    private double total_cost;
    
    public Bill(int bill_id, int customer_id, int starting_meter_reading, int ending_meter_reading, 
                Date start_date, Date end_date, int units_consumed, double total_cost){
    
        this.bill_id=bill_id;
        this.customer_id=customer_id;
        this.starting_meter_reading=starting_meter_reading;
        this.ending_meter_reading=ending_meter_reading;
        this.start_date=start_date;
        this.end_date=end_date;
        this.units_consumed=units_consumed;
        this.total_cost=total_cost;
    }

    public Bill() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }
    
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getstarting_meter_reading() {
        return starting_meter_reading;
    }

    public void setstarting_meter_reading(int starting_meter_reading) {
        this.starting_meter_reading = starting_meter_reading;
    }

    public int getending_meter_reading() {
        return ending_meter_reading;
    }

    public void setending_meter_reading(int ending_meter_reading) {
        this.ending_meter_reading = ending_meter_reading;
    }

    public Date getstart_date() {
        return start_date;
    }

    public void setstart_date(Date start_date) {
        this.start_date = start_date;
    }

    

    public Date getend_date() {
        return end_date;
    }

    public void setend_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getunits_consumed() {
        return units_consumed;
    }

    public void setunits_consumed(int units_consumed) {
        this.units_consumed = units_consumed;
    }

    public double gettotal_cost() {
        return total_cost;
    }

    public void settotal_cost(double total_cost) {
        this.total_cost = total_cost;
    }

  
    
    @Override
    public String toString() {
        return "Bill{" +
            "billId=" + bill_id +
            ", customerId=" + customer_id +
            ", startingMeterReading=" + starting_meter_reading +
            ", endingMeterReading=" + ending_meter_reading +
            ", startDate=" + start_date +
            ", endDate=" + end_date +
            ", unitsConsumed=" + units_consumed +
            ", totalCost=" + total_cost +
            '}';
    }
}
