package Order.domain;

public enum PaymentMethod {
    Alipay(0),
    Wechat(1),
    VISA(2),
    CASH(3);

    private int type;
    private PaymentMethod(int t){
        this.type = t ;
    }
}
