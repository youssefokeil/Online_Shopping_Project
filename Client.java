/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author KAREEM
 */
public class Client {     
 
    private long PhoneNumber;
    private static int StaticID =0;
    private int ID;
    private String UserName;
    private String Address;
    private String Password;
    private String Email;
    private String Name;
    private static ArrayList<Client> Clients = new ArrayList<>()  ;
  
    
    public Client(String PhoneNumber, String UserName,String Address,String Password,String Email,String Name) throws IllegalArgumentException,NumberFormatException{
    
        setPhoneNumber(PhoneNumber);
       
        setUserName(UserName);  
      
        setAddress(Address) ;
      
        setPassword(Password);
      
        setEmail(Email);
       
        setName(Name); 
       
       ID=StaticID;
        
        StaticID++;
       
       
           
       Clients.add(this);
     }

   public void setUserName(String UserName) throws IllegalArgumentException{
       if(!isUserNameAvailable(UserName)){
          throw new IllegalArgumentException("Please enter a valid User Name");
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
       if (Email.isBlank()){
                throw new IllegalArgumentException("Please enter a valid Email");
       }
       this.Email=Email;
   }
           
         public void setName(String Name){
               if (!IsNameCorrect(Name)){
          throw new IllegalArgumentException("Please enter a valid name");
               }
      this.Name=Name;
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
           public String getName(){
       return Name;
   }
    public long  getPhoneNumber(){
       return PhoneNumber;
   } public static int getNumOfClients(){
       return StaticID;
   }
   public int getID(){
       return ID;
   }
   
private static boolean isUserNameAvailable(String UserName){
     
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

private static boolean IsNameCorrect(String Name){
   if( Name.isBlank()){
       return false;
   }
   else if (!Name.matches("[(a-zA-Z)]")){
       return false;
              
   }
   else{ 
       return true ;
               }
   }
   
}  
       
       
      


