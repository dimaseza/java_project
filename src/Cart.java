
public class Cart {
    private String date;
    private Product[] prodList;
    private int numOfProd;
    
    public Cart(String date, int maxProd) {
        this.date = date;
        this.prodList = new Product[maxProd];
    }
    
    public void addProduct(Product prod) {
        this.prodList[numOfProd] = prod;
        numOfProd++;
    }
    
    public void display() {
        for(int i = 0; i < numOfProd; i++){
            System.out.println("Product " + (i + 1));
            System.out.println("Name : " + prodList[i].getName());
            System.out.println("Price : " + prodList[i].getPrice());
            System.out.println("Quantity : " + prodList[i].getQuantity());
            System.out.println("Total Price : " + prodList[i].getPrice() * prodList[i].getQuantity());
            System.out.println();
        }
    }
}
