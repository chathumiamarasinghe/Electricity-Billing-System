
package main.java.bs.model;

import java.time.LocalDateTime;


public class Customer {
    
    private static String customer_id;
    private static String first_name;
    private static String last_name;
    private static String email;
    private static String password;
    private static boolean is_active;
    private static LocalDateTime registration_date;
    
    public Customer(String customer_id,String first_name,String last_name,String email,String password,boolean is_active,LocalDateTime registration_date){
    
        this.customer_id=customer_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.password=password;
        this.is_active=is_active;
        this.registration_date=registration_date;
    }
    
    public static String getCustomer_id() {
        return customer_id;
    }

    public static void setCustomer_id(String customer_id) {
        Customer.customer_id = customer_id;
    }

    public static String getFirst_name() {
        return first_name;
    }

    public static void setFirst_name(String first_name) {
        Customer.first_name = first_name;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static void setLast_name(String last_name) {
        Customer.last_name = last_name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Customer.email = email;
    }

    

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Customer.password = password;
    }

    public static boolean isIs_active() {
        return is_active;
    }

    public static void setIs_active(boolean is_active) {
        Customer.is_active = is_active;
    }

    public static LocalDateTime getRegistration_date() {
        return registration_date;
    }

    public static void setRegistration_date(LocalDateTime registration_date) {
        Customer.registration_date = registration_date;
    }

    public Customer() {
     }
    
    public String toString() {
        return "Customer{" +
            "customerId=" + customer_id +
            ", firstName='" + first_name + '\'' +
            ", lastName='" + last_name + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", isActive=" + is_active +
            ", registrationDate=" + registration_date +

            '}';
    
    
}
}