public class Products implements Comparable<Integer>{
    private static int staticID;
    private String[] availableMaterials;
    private String[] availableColors;
    private String productCode, color, material, printStatement;
    private int gender, numItems;
    private int size;
    private double price;
    private boolean isAvailable;
    public Products(){
        staticID+=1;
    }
    public Products(String material,String color,int gender,
                    int numItems, double price, int size){
        this.price=price;
        this.setNumItems(numItems);
        this.color=color;
        this.gender=gender;
        this.isAvailable=(numItems>0);
        this.material=material;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
    public boolean isMaterialNew(String newMaterial){
        for(String material: availableMaterials){
            if(newMaterial==material){
                return false;
            }
        }
        return true;
    }
    public boolean isColorNew(String newColor){
        for(String color: availableColors){
            if(newColor==color){
                return false;
            }
        }
        return true;
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
        String s="Product is of "+material+"material and "+
                "of"+color+"color"+
                "\nNumber of items available: "+numItems+
                String.format("\nPrice of one item is %.2f EGP ",price);
        System.out.println(s);
    }
    @Override
    public String toString(){
        String s=this.material+ "-" + this.color +"-"+ this.size;
        return s;
    }
    @Override
    public boolean equals(Object otherProduct) {
        if (this.toString() == otherProduct.toString()) {
            return true;
        }
        return false;
    }

}
