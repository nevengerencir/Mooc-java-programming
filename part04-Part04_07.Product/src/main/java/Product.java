public class Product {
    private double price;
    private double quantity;
    private String name;
public Product(String name, double quantity, double price){
    this.name = name;
    this.quantity= quantity;
    this.price = price;
}
    public void printProduct(){
        System.out.println(this.name+", " + "price " + this.price + ", " + this.quantity + " pcs" );
    }
}
