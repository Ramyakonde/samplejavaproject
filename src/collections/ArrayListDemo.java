package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<Object> al = new ArrayList<>();
        List<String> st = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        st.add("hyd");
        st.add("delhi");
        st.add("mumbai");

        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        al.add(678);
        al.add("employee");
        al.add(6.85);
        //size of array
        System.out.println("size of String arraylist" + st.size());
        System.out.println("size of Integer Arraylist " + in.size());
        System.out.println("size os arraylist al" + al.size());
        st.remove(1);//remove method

        //get method
        System.out.println(st.get(1));

        //set method
        al.set(1, 89);
        //loop iteration to get data
        for (Integer integer : in) {
            System.out.println(integer);
        }
        //while loop to get data
        for (Object o : al) {
            System.out.println(o);
        }

        System.out.println("contents of Arraylist al " + al);





    }
}
