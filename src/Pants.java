public class Pants extends Products {

    public Pants(){
        super();
    }
    public Pants(String material,String color,String size,
                   int numItems, double price){
        super( material, color, size, numItems,  price);
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
        String s="Pant| "+this.getMaterial()+ "| " + this.getColor()+ "| " + this.getSize();
        return s;
    }
}
