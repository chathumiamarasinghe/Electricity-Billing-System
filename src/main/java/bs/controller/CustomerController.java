
package main.java.bs.controller;

import main.java.bs.dao.CustomerDAO;
import main.java.bs.interfaces.ICustomerDAO;
import main.java.bs.model.Customer;


public class CustomerController {
    
 private final ICustomerDAO customerDAO;
    
    public CustomerController(){
        
        this.customerDAO = new CustomerDAO();
    }   
    public void addCustomer(String fname, String lname, String email, String password){
        Customer customer = new Customer();
        customer.setFirst_name(fname);
        customer.setLast_name(lname);
        customer.setEmail(email);
        customer.setPassword(password);
        customerDAO.insertCustomer(customer);
    }
}
