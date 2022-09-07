/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfin11;

import java.util.ArrayList;

/**
 *
 * @author shehab ismail
 */
public class Holder  {
    private String name,age,country;
   private int civil_id  ;
     ArrayList trans_type=new ArrayList();

    public Holder() {
    }

    public Holder(String name, String age, String country, int civil_id) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.civil_id = civil_id;
    }

public String getName(){

return this.name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    //sTRING AGE IS FOR REQUIRING AN INPUT IN THE FUNCTUIN
    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCivil_id() {
        return civil_id;
    }

    public void setCivil_id(int civil_id) {
        this.civil_id = civil_id;
    }
    
}
