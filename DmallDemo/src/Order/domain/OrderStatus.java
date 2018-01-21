package Order.domain;

public enum OrderStatus {
    Ini(0),//初始状态
    Paied(1),//已支付
    Deliveried(2),//运送中
    Finished(3);//已完成

    private int type;
    private OrderStatus(int t){
        this.type = t ;
    }
}
