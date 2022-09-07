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
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Testbank  {

    
    public static void main(String[] args) {
        try {
           
            Create_newacc create =new Create_newacc();
            Transaction testf =new Transaction();
        
            
            create.create_acc();
           testf.testtransaction();
            
        FileWriter Writer = new FileWriter("C:\\Users\\shehab ismail\\Desktop//newfil555e.txt"); //we made this to write all the information in text file
        
        Writer.write("All Accounts :"+"\n \n"+"1."+create.accounts.get(0)+"\n"+"2."+create.accounts.get(1)+"\n"+"3."+create.accounts.get(2)+"\n");
         Writer.write("\n \n"+"All Transactin :"+"\n"+"\n"+testf.trans_history.get(0)+"\n"+testf.trans_history.get(1)+"\n"+testf.trans_history.get(2)+"\n"+testf.trans_history.get(3)+"\n"+testf.trans_history.get(4));
        Writer.close();
        
         
        } catch (IOException ex) {
            Logger.getLogger(Testbank.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
       
         
           }
               
       



        
      
        
        
    
    
    
    

       
       
