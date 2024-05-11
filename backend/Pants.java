package backend;

public class Pants extends Products {
    int numSize;
    public Pants(){
        super(material, color, size, numItems, price);
    }
    public Pants(String material,String color,int numSize,
                   int numItems, double price){
        super( material, color, numItems,  price);
        this.numSize=numSize;
        this.addToArray();

    }

    public int getNumSize() {
        return numSize;
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
        String s="Pant| " + this.getColor()+ "| " + this.getNumSize();
        return s;
    }
}
