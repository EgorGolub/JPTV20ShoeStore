/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myclasses;

/**
 *
 * @author pupil
 */
public class Shoes {
    private String shoesName;
    private int publishedYear;
    private Firm[] firm;

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Firm[] getFirm() {
        return firm;
    }

    public void setFirm(Firm[] firm) {
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "Shoes{" + "shoesName=" + shoesName + ", publishedYear=" + publishedYear + ", firm=" + firm + '}';
    }

    
   
    
}
