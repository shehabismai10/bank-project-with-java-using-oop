/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfin11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shehab ismail
 */
public class Create_newacc extends Transaction {
      
        Transaction transobj =new Transaction();
       ArrayList accounts =new ArrayList();
        ArrayList account_h =new ArrayList();
      ArrayList account2 =new ArrayList();
      ArrayList account3 =new ArrayList();
    
   Withdrawl wd =new Withdrawl();
     Deposite dep =new Deposite();
     
     
     public void create_acc (){
         
         
    
      
      accobj.setAcc_num(1560);
      accobj.setBalance(5000);
         account2.add(0,"name: ahmed amin");
        account2.add(1,"age: 50");
         account2.add(2,"country :egypt");
         account2.add(3,"civil ID:"+1556);//civil id
         account2.add(4,"Accnumber:"+1550);//acc num
        account2.add(5,"balance:"+5000);//balance

         
         
          account3.add(0,"name: amir mohamed");
        account3.add(1,"age: 50");
         account3.add(2,"country :sudan");
         account3.add(3,"civil ID:"+1567);//civil id
         account3.add(4,"Accnumber:"+1532);//acc num
        account3.add(5,"balance:"+6000);//balance
      
      
      
 
       System.out.println("please enter your name"); //For calling and using the Holder's FUCNTIONS HEREs        
       holderobj.setName(in.nextLine());
          
     
       
       
        System.out.println("enter your age");
        holderobj.setAge(in.next());
        
        
        
        
        
       System.out.println("enter your country");
        holderobj.setCountry(in.next());
        
        
        
        
        
        
        
       System.out.println("enter your civil id");
      holderobj.setCivil_id(in.nextInt());
     
        
      
      
         
         
       account_h.add(0,"name: "+ holderobj.getName());
       account_h.add(1,"Age: "+ holderobj.getAge());
              account_h.add(2,"Country: "+ holderobj.getCountry());

       account_h.add(3,"civil ID:"+ holderobj.getCivil_id());
       accobj.setHold_name(holderobj.getName());
       accobj.setAcc_num(1560);
       account_h.add(4, "Accnumber:"+accobj.getAcc_num());
       accobj.setBalance(5000);
       account_h.add(5, "balance:"+accobj.getBalance());

        
            accounts.add(0,account_h);
            accounts.add(1,account2);
           accounts.add(2,account3);
           
           
      
      
      
 
           
   

}
    
}
