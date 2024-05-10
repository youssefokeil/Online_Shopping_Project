package backend;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Products implements Comparable<Integer>{
    public static ArrayList<Products> productsArray;
    private static int staticID;
    private String printStatement;
    private String color;
    private int numItems;
    private String size;
    private double price;
    private boolean isAvailable;
    public Products(){
        staticID+=1;
    }
    public Products(String color,
                    int numItems, double price){
        this();
        this.price=price;
        this.setNumItems(numItems);
        this.color=color;
        this.isAvailable=(numItems>0);
        this.size=size;

    }
    public Products(String color,String size,int numItems, double price){
        // update id using empty constructor
        this(color,numItems,price);
        this.size=size;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
        if(numItems>0){
            this.isAvailable=true;
        }
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void buy(int numOfItemsInOrder){
        if(isAvailable){
            if(numOfItemsInOrder<=this.numItems){
                this.numItems-=numOfItemsInOrder;
                this.printStatement="Thank you for buying from us";
            }else{
                this.printStatement=String.format("Number of items ordered exceeds the number of items we have, " +
                        "please specify a number less than %d.",this.numItems);
            }
        }else{
            this.printStatement="Unfortunately, the item ordered isn't available right now.";
        }
        System.out.println(this.printStatement);
    }
    public void addItems(int numOfItemsToAdd){
        this.numItems+=numOfItemsToAdd;
        this.isAvailable=this.numItems>0;
    }
    @Override
    public int compareTo(Integer otherPrice){
        if(this.price>otherPrice){
            return 1;
        } else if (this.price==otherPrice) {
            return 0;
        } else {
            return -1;
        }
    }
    public void displayInfo(){
        String s="Product is of "+color+"color"+
                "\nNumber of items available: "+numItems+
                String.format("\nPrice of one item is %.2f EGP ",price);
        System.out.println(s);
    }

    public abstract void addToArray();
    public abstract String toString();
    @Override
    public boolean equals(Object otherProduct) {
        if (Objects.equals(this.toString(), otherProduct.toString())){
            ///using late binding it will be bound to each class to string method
            return true;
        }
        return false;
    }

}
