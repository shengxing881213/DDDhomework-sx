package Order.domain;

public class CargoReceiver {
    private final String name;
    private Address address;
    private final int telnumber;

    public CargoReceiver(String name, Address address, int telnumber) {
        this.name = name;
        this.address = address;
        this.telnumber = telnumber;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getTelnumber() {
        return telnumber;
    }
}
