package Coba_2;

public class Test {

    public static void main(String[] args) {
        int i;

        Product prod1 = new Product("ABX01", 75000, 3);
        Product prod2 = new Product("ABX10", 6000, 30);
        Product prod3 = new Product("ABX03", 25000, 4);

        Customer cust1 = new Customer("Alex");
        cust1.createCart("20-10-2019", 3);
        cust1.getCart().addProduct(prod1);
        cust1.getCart().addProduct(prod2);
        cust1.getCart().addProduct(prod3);
        
        cust1.showCart();
        
        
        Customer cust2 = new Customer("Sussy");
        
        Product prod4 = new Product("ABX04", 17000, 9);
        Product prod5 = new Product("ABX07", 7000, 12);
        Product prod6 = new Product("ABX05", 15000, 4);
        
        cust2.createCart("21-12-2019", 3);
        
        cust2.getCart().addProduct(prod4);
        cust2.getCart().addProduct(prod5);
        cust2.getCart().addProduct(prod6);
        
        cust2.showCart();
    }
}
