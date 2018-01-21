package Order.domain;

public class Price {
    private double amnt;
    private final String currency;

    public Price(double amnt, String currency) {
        this.amnt = amnt;
        this.currency = currency;
    }

    public double getAmnt() {
        return amnt;
    }

    public String getCurrency() {
        return currency;
    }
}
