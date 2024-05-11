package backend;

public class Sneakers extends Products {
    public Sneakers(){
        super( color, size, numItems, price);
    }
    public Sneakers(String color,String size,
                 int numItems, double price){
        super(  color, size, numItems,  price);
        this.addToArray();
    }

    @Override
    public void addToArray(){

        for(Products product: productsArray){
            if(this.equals(product)){
                product.addItems(this.getNumItems());
                return; // to exit method entirely , works as a flag
            }
        }
        productsArray.add(this);
    }

    @Override
    public String toString(){
        String s="Sneaker| "+this.getMaterial()+ "| " + this.getColor()+ "| " + this.getSize();
        return s;
    }
}
