package polymorphism;


public class Polymorphism {

    public static void main(String[] args){
        Calculator c=new Calculator();
        c.addition(10,20);
        c.addition(10,20,30);
        c.addition(10.5,20.7);
        c.addition(10.7,8);
        c.addition(50,11.8);
    }
}
