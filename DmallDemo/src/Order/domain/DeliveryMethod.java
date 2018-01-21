package Order.domain;

public enum DeliveryMethod {
    EMS(0),
    SF(1),
    UPS(2);

    private int type;
    private DeliveryMethod(int t){
        this.type = t ;
    }
}
