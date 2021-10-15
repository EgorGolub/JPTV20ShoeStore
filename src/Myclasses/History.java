/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myclasses;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Customer customer;
    private Shoes shoes;
    private Date givenDate;
    private Date returnedDate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }
    
    @Override
    public String toString(){
        return "History{"
              + "customer=" + customer 
                + ", shoes=" + shoes 
                + ", givenDate=" + givenDate 
                + ", returnedDate=" + returnedDate 
                + '}';  
    }
 
}
