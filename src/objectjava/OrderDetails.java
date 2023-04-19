package objectjava;

public class OrderDetails {
    String orderName;
    int orderNum;

    public OrderDetails(String orderName, int orderNum) {
        this.orderName = orderName;
        this.orderNum = orderNum;
    }

    public void orderDisplay() {
        System.out.println("order details " + orderName);
        System.out.println("order details " + orderNum);
    }

}
