public class TShirts extends Products implements Graphical{
    private boolean isGraphical;
    public TShirts(){
        super();
    }
    public TShirts(String material,String color,String size,
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
    public void makeGraphical(){
        this.isGraphical=true;
        this.setPrice(this.getPrice()+ADDED_FEE);
        /// UI TO PUT NEW IMAGE /////

    }
    @Override
    public String toString(){
        String s="T-shirt| "+this.getMaterial()+ "| " + this.getColor()+ "| " + this.getSize();
        return s;
    }

}
