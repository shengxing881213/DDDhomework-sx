package Order.domain;

public class Product {
    private final String name;
    private final Price price;
    private final int Id;

    public Product(String name, Price price, int id) {
        this.name = name;
        this.price = price;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public int getId() {
        return Id;
    }
}
