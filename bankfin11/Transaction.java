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
import java.util.ArrayList;
import java.util.Scanner;
public class Transaction extends Account{
    
    
    //account(s) affected, amount of money, date, and if they are successful
    
    
    
     Holder holderobj= new Holder();  //For using the Holder here
       Account accobj= new Account(); 
       
        Account to =new Account();
       
      
      int amount=0;
       
      
     Scanner in =new Scanner(System.in);
      ArrayList trans_history=new ArrayList();
  
  public void testtransaction(){
      balance =5000;
       for(int i=0;i<5;i++){
           
            System.out.println("\n"+"please choose the transaction you want to make"
               +"\n" + "1.deposite"+"\n"+"2.withdrawl"+"\n"+"3.transfare");
  
           switch (in.nextInt()) {
            case 1:
                //deposite
           
    accobj.getAcc_num();
      System.out.println("please enter the amount of monery you want to deposite");
               double amount = in.nextDouble();
                 
    accobj.getAcc_num();
    balance= balance+amount;
      System.out.println("Balance before deposite is : " +(balance-amount));
       System.out.println("Balance after deposite is : " + balance);
          
       trans_history.add("\n \n "+"the transaction succeed "
                +"\n"+ " account number : "+1560
                +"\n"+ "date : 1.12.2021"
                +"\n"+"transaction type : deposite"        
                +"\n"+ "amount of money : "+ amount );
                break;
            case 2:
                //withdrawl
             
  
                System.out.println("please enter the amount of monery you want to withdrawl");
               amount = in.nextInt();
                
                if(balance>=amount){
                    
                    balance = balance - amount;
                    
                      System.out.println("Balance before withdrawl is : " + (balance+amount) );
                      System.out.println("Balance after withdrawl is : " + balance);
                      
                  trans_history.add("the transaction succeed "
                +"\n"+ " account number :1560 "
                +"\n"+ "date : 1.12.2021"
                +"\n"+"transaction type : withdrawl"        
                +"\n"+ "amount of money : "+ amount );
                  
                }else{
                    
                    System.out.println("the balance: "+balance+"is less than the money your trying to withdraw which is: " + amount);
                    
                     
                  trans_history.add("\n \n "+"the transaction failed "
                +"\n"+ " account number :1560" 
                +"\n"+ "date : 1.12.2021"
                 +"\n"+"transaction type : withdrawl"       
                +"\n"+ "amount of money : "+ amount );
                break;
                
              
           
                  
     }
          break;        
                   case 3:
                
                //transfare
                          
                 
                           
                         System.out.println("your current balance is "+balance);
               
               System.out.println("\n"+"enter the account number you want to transfare to");
                switch (in.nextInt()) {
                    case 1556://acc:1
                        to.balance=5000;
                        System.out.println("ok please enter the amount of money you want to transfare to");
                        amount=in.nextInt();
                        if(balance>=amount){
                        balance= (balance - amount);
                        to.balance=  (to.balance+  amount);
                        System.out.println("the balance of your account after the transfare is: "+balance);
                           
                          trans_history.add("\n \n "+"the transaction succeed "
                                       +"\n"+ " account number :1560 "
                                        +"\n"+ "date : 1.12.2021"
                                        +"\n"+"transaction type : transfare" 
                                        +"\n"+"account number that you transfare to : " + 1556      
                                        +"\n"+ "amount of money : "+ amount );
                       
                        }else{
                            System.out.println("your current balance is less than the amount of money you trying to transfare ");
                            
                            trans_history.add("\n \n "+"the transaction failed "
                                       +"\n"+ " account number :1560 "
                                        +"\n"+ "date : 1.12.2021"
                                        +"\n"+"transaction type : transfare" 
                                        +"\n"+ "amount of money : "+ amount );
                           
                        }
                        break;
                    case 1532://acc:2
                        to.balance=6000;
                        System.out.println("ok please enter the amount of money you want to transfare to");
                        amount=in.nextInt();
                        if(balance>=amount){
                        
                        balance= (balance - amount);
                        to.balance=  (to.balance+  amount);
                        System.out.println("the balance of your account after the transfare is: "+balance);
                        
                        
                          trans_history.add("\n \n "+"the transaction succeed "
                                       +"\n"+ " account number :1560 "
                                        +"\n"+ "date : 1.12.2021"
                                        +"\n"+"transaction type : transfare" 
                                        +"\n"+"account nomber that you transfare to : " + 1532      
                                        +"\n"+ "amount of money : "+ amount );
                    
                  }else{
                            System.out.println("your current balance is less than the amount of money you trying to transfare ");
                            
                              
                            trans_history.add("\n \n "+"the transaction failed "
                                       +"\n"+ " account number :1560 "
                                        +"\n"+ "date : 1.12.2021"
                                        +"\n"+"transaction type : transfare" 
                                        +"\n"+ "amount of money : "+ amount );
                            
}
break;
  default:
                System.out.println("please enter the account that you want to transfare to corectly ");
                break;
}
               
          break;
       default:
                System.out.println("please choose your transaction number corectly");
                break;          

}
       
}

}
}









