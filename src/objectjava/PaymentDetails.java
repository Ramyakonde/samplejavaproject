package objectjava;

public class PaymentDetails {
    String type;
    int cardNum;

    public void setType(String type) {
        this.type = type;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public void paymentDisplay()
    {

        System.out.println("payment details" + type);
        System.out.println("payment details" + cardNum);


    }
}
