package collections;



import java.util.LinkedList;
import java.util.List;



public class LinkedListDemo {
    public static void main(String[] args) {
       List<String> st = new LinkedList<>();
       List<Integer> in = new LinkedList<>();
       List<Object> ob = new LinkedList<>();
       st.add("Ramya");
       st.add("Sita");
       st.add("Sri");
       in.add(200);
       in.add(700);
       in.add(600);
       ob.add("books");
       ob.add(8000);
       ob.add(78.96);
        for (String s : st) {
            System.out.println(s);
        }
        for (Integer integer : in) {
            System.out.println(integer);
        }
        for(Object b :ob){
            System.out.println(b);

        }




    }
}
