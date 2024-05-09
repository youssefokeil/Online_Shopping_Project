/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshopping;
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
    private ArrayList<Order> ClientOrders;
    public Client(String PhoneNumber, String UserName,String Address,String Password,String Email,String Name){
    
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
// Method to set username
   public void setUserName(String UserName) {
       if(!isUserNameAvailable(UserName)){
          throw new IllegalArgumentException("Please enter a valid User Name");
                  }
       this.UserName=UserName;
   }
  // Method to set address
   public void setAddress(String Address){
       if (Address.isBlank()){
            throw new IllegalArgumentException("Please enter a valid Address");
       }
       this.Address=Address;
   }
      // Method to set password
   public void setPassword(String Password){
      if(Password.length()<=4){
           throw new IllegalArgumentException("Password is too short") ;  
      }
           this.Password=Password;
   }
       // Method to set Email
   public void setEmail(String Email){
       if (Email.isBlank()){
                throw new IllegalArgumentException("Please enter a valid Email");
       }
       this.Email=Email;
   }
           // Method to set phonenumber
             public void setPhoneNumber(String PhoneNumber){
      try {
            this.PhoneNumber = Long.parseLong(PhoneNumber);
        } catch (NumberFormatException e) {
             throw new NumberFormatException("Please enter valid a Phone Number");
        }
   } 
   // Method to get username

   
     public String getUserName(){
       return UserName;
   }
// Method to get address

     public String getAddress(){
       return Address;
   }
// Method to get password

       public String getPassword(){
       return Password;
   }
// Method to get Email

         public String getEmail(){
       
             return Email;
   }  
// Method to get phonenumber
  
     public long  getPhoneNumber(){
       return PhoneNumber;
   } 
// Method to get number of clients

public static int getNumOfClients(){
       return StaticID;
   }
// Method to get ID

   public int getID(){
       return ID;
   }
       // Method to check if the username is valid
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
// // Method to get client's orders
public  ArrayList<Order> GetOrders(){
    Orders.clear();
    ArrayList<Order> InnerList = Order.getTotalOrders();
    for(Order order : InnerList){
        if(order.getclient().getUserName()==this.UserName){
           Orders.add(order);
        }
            
        }
  return Orders;
}
// Method to get client's number of orders
public int NumberOfOrdersForClient(){
  GetOrders();
    return Orders.size();
}
}