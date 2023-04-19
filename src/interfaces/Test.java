package interfaces;

public class Test {
    public static void main(String[] args) {
        groceries gr= new Walmart();
        gr.fruits();
        gr.vegitables();
        gr.shoes();
       shoppingList sl=new Walmart();
       sl.accessories();
        sl.clothing();
        sl.shoes();
    }
}

