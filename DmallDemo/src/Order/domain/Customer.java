package Order.domain;

public class Customer {
    private final int Id;
    private final String name;

    public Customer(int id, String name) {
        this.Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
