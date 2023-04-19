package interfaces;

public class Walmart implements groceries, shoppingList {
    @Override
    public void vegitables() {
        System.out.println("these are vegitables avalable");
    }

    @Override
    public void fruits() {
        System.out.println("these are fruits avalable");

    }

    @Override
    public void clothing() {
        System.out.println("these are clothes");
    }

    @Override
    public void accessories() {
        System.out.println("these are accessories");


    }

    @Override
    public void shoes() {
        System.out.println(" gr shoes");
    }


}
