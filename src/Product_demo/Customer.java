package Product_demo;

public class Customer {
    private String name;
    private Cart cart;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public Cart getCart() {
        return cart;
    }
    
    public void createCart(String date, int maxProd) {
        cart = new Cart(date, maxProd);
    }
    
    public void showCart() {
        System.out.println("Data Transaksi : ");
        cart.display();
    }
}
