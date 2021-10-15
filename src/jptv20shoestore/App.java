/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20shoestore;

import Myclasses.Customer;
import Myclasses.Firm;
import Myclasses.History;
import Myclasses.Shoes;
import java.util.Calendar;
import java.util.GregorianCalendar;





/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Customer customer1 = new Customer();
        customer1.setFirstname("Vlad");
        customer1.setLastname("Ivanom");
        customer1.setPhone("4561234");
        
        Customer customer2 = new Customer();
        customer2.setFirstname("Inna");
        customer2.setLastname("Good");
        customer2.setPhone("45678912");
        
        Shoes shoes1 = new Shoes();
        shoes1.setShoesName("Vans");
        shoes1.setPublishedYear(1966);
        Firm firm1 = new Firm();
        firm1.setFirstname("Ivan");
        firm1.setLastname("Vasiljev");
        firm1.setBirthYear(1974);
        Firm[] firms = new Firm[1];
        firms[0] = firm1;
        shoes1.setFirm(firms);
        
        Shoes shoes2 = new Shoes();
        shoes2.setShoesName("Nike");
        shoes2.setPublishedYear(1964);
        Firm firm2 = new Firm();
        firm2.setFirstname("Nikita");
        firm2.setLastname("Kirov");
        firm2.setBirthYear(1971);
        Firm[] firms2 = new Firm[1];
        firms2[0] = firm2;
        shoes2.setFirm(firms2);
        
        History history1 = new History();
        history1.setShoes(shoes1);
        history1.setCustomer(customer1);
        Calendar c = new GregorianCalendar();
        history1.setGivenDate(c.getTime());
        System.out.println("history1 = "+history1.toString());
        
        History history2 = new History();
        history2.setShoes(shoes2);
        history2.setCustomer(customer2);
        c = new GregorianCalendar();
        history2.setGivenDate(c.getTime());
        System.out.println("history2 = "+history2.toString());
        c=new GregorianCalendar();
        history1.setReturnedDate(c.getTime());
        System.out.println("---------------------");
        System.out.println("history1 = "+history1.toString());
     } 
        
}
