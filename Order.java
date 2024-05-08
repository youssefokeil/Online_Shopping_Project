/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshopping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAREEM
 */
 import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int TotalOrderscount;
    private List<Products> ShoppingCartProducts;
    private List<Integer> ShoppingCartQuantities;
    private Client client;
   private static ArrayList<Order>TotalOrders = new ArrayList<>();
    private int OrderID;
    public Order(Client client) {
      ShoppingCartProducts = new ArrayList<>();
      ShoppingCartQuantities = new ArrayList<>();
      this.client = client;
      TotalOrders.add(this);
      TotalOrderscount++;
      OrderID= TotalOrderscount;
    }

    public Order(Client client,List<Products> products, List<Integer> quantities) {
       this(client);
       ShoppingCartProducts.addAll(products);
       ShoppingCartQuantities.addAll(quantities);
        
    }
// Method to get the client who ordered

    public Client getclient(){
        return client;
    }
// Method to get OrderID

    public int getOrderID(){
        return OrderID;
    }
    // Method to add a product to the order with a specified quantity
    public void addProduct(Products product, int quantity) {
         ShoppingCartProducts.add(product);
         ShoppingCartQuantities.add(quantity);
      
    }

    // Method to remove a product from the order
    public void removeProduct(Products product) {
        int index =  ShoppingCartProducts.indexOf(product);
        if (index != -1) {
             ShoppingCartProducts.remove(index);
             ShoppingCartQuantities.remove(index);
        }
    }

    // Method to get the quantity of a product in the order
    public int getProductQuantity(Products product) {
        int index =  ShoppingCartProducts.indexOf(product);
        return index != -1 ?  ShoppingCartQuantities.get(index) : 0;
    }

    // Method to update the quantity of a product in the order
    public void updateProductQuantity(Products product, int quantity) {
        int index =  ShoppingCartProducts.indexOf(product);
        if (index != -1) {
             ShoppingCartQuantities.set(index, quantity);
        }
    }

    // Method to calculate the total price of the order
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i <  ShoppingCartProducts.size(); i++) {
            Products product =  ShoppingCartProducts.get(i);
            int quantity =  ShoppingCartQuantities.get(i);
            totalPrice +=  product.getPrice() * quantity;
        }
        return totalPrice;
    }

    // Method to check if the order is empty
    public boolean isEmpty() {
        return  ShoppingCartProducts.isEmpty();
    }
// Method to get the number of products in the order
    public int getProductCount() {
        return ShoppingCartProducts.size();
    }
    // Method to get the total products quantity in the order
    public int getTotalProductsQuantites() {
           int TotalQuantity = 0;
        for (int i = 0; i < ShoppingCartQuantities.size(); i++) {
             TotalQuantity +=  ShoppingCartQuantities.get(i);
         }
        return  TotalQuantity;
    }
   

    // Method to clear all products from the order
    public void CancelOrder() {    
        ShoppingCartProducts.clear();
       ShoppingCartQuantities.clear();
    }
    public static ArrayList<Order> getTotalOrders(){
    return TotalOrders;
    }
    }
