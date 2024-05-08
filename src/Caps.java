public class Caps extends Products implements Graphical {
    private boolean isGraphical;
    public Caps(){
        super();
    }
    public Caps(String material,String color,
                   int numItems, double price){
        super( material, color, numItems,  price);
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
    public void makeGraphical(){
        this.isGraphical=true;
        this.setPrice(this.getPrice()+ADDED_FEE/2);
        /// UI TO PUT NEW IMAGE /////

    }
    @Override
    public String toString(){
        String s="Cap| "+this.getMaterial()+ "| " + this.getColor();
        return s;
    }
}
