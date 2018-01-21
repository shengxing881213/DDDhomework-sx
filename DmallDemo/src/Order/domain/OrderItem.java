package Order.domain;

public class OrderItem {
    private final Product product;
    private final int amnt;
    private static int maxamnt = 200;

    public OrderItem(Product product, int amnt) {
        this.product = product;
        if (amnt <= maxamnt){
            this.amnt = amnt;
        }
        else{
            this.amnt = maxamnt;
            System.out.println("the number of products exceed the maxamnt:"+maxamnt);
        }
    }

    public Product getProduct() {
        return product;
    }

    public int getAmnt() {
        return amnt;
    }
}
