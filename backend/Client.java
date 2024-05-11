package backend;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author KAREEM
 */
public class Client implements Comparable<Client> {
 
    private long PhoneNumber;
    private static int StaticID =0;
    private int ID;
    private String UserName;
    private String Address;
    private String Password;
    private String Email;
    private static ArrayList<Client> Clients = new ArrayList<>()  ;

    public static ArrayList<Client> getClients() {
        return Clients;
    }

    public Client(String PhoneNumber, String UserName, String Address, String Password, String Email){
    
        setPhoneNumber(PhoneNumber);
       
        setUserName(UserName);  
      
        setAddress(Address) ;
      
        setPassword(Password);
      
        setEmail(Email);
       

       
       ID=StaticID;
        
        StaticID++;
       
       
           
       Clients.add(this);
     }

   public void setUserName(String UserName) {
       if(!isThisAvailable(UserName)){
          throw new IllegalArgumentException("Please enter another valid User Name");
                  }
       this.UserName=UserName;
   }
  
   public void setAddress(String Address){
       if (Address.isBlank()){
            throw new IllegalArgumentException("Please enter a valid Address");
       }
       this.Address=Address;
   }
      
   public void setPassword(String Password){
      if(Password.length()<=4){
           throw new IllegalArgumentException("Password is too short") ;  
      }
           this.Password=Password;
   }
       
   public void setEmail(String Email){

       if(!isThisAvailable(Email)){
           throw new IllegalArgumentException("Please enter another valid E-mail");
       }
       this.Email=Email;;

       /* if (Email.isBlank()){
                throw new IllegalArgumentException("Please enter a valid Email");
       }
       this.Email=Email;*/
   }

    public void setPhoneNumber(String PhoneNumber){
      try {
            this.PhoneNumber = Long.parseLong(PhoneNumber);
        } catch (NumberFormatException e) {
             throw new NumberFormatException("Please enter valid a Phone Number");
        }
   } 
   
   
     public String getUserName(){
       return UserName;
   }
     public String getAddress(){
       return Address;
   }
       public String getPassword(){
       return Password;
   }
         public String getEmail(){
       
             return Email;
   }

    public long  getPhoneNumber(){
       return PhoneNumber;
   }
   public static int getNumOfClients(){
        return StaticID;
   }
   public int getID(){
       return ID;
   }
   
private static boolean isThisAvailable(String UserName){
     
    if (UserName.isBlank()){
         return false;
     }
    
    for (Client client :Clients){
     if  ( client.UserName.equals(UserName)){
         return false;
     }
    }  
        return true;
}


    @Override
    public int compareTo(Client o) {
        if(this.getID()==o.getID()) return 0;

        else if(this.getID()> o.getID()) return 1;

        else return -1;

    }
}

       
       
      


