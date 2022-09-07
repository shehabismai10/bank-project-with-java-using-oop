/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfin11;

/**
 *
 * @author shehab ismail
 */
public class Account {
     private int acc_num;
    private String hold_name;
    double balance;

   

    @Override
    public String toString() {
        return "account{" + "acc_num=" + acc_num + ", hold_name=" + hold_name + ", balance=" + balance + '}';
    }
    
    

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public String getHold_name() {
        return hold_name;
    }

    public void setHold_name(String hold_name) {
        this.hold_name = hold_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
