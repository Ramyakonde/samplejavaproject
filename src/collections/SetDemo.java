package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static  void main(String[] args) {
        Set<String> s = new HashSet<>();
        Set<Integer> i = new HashSet<>();
        Set<Object> o = new HashSet<>();
        s.add("sita");
        s.add("sita");
        s.add("ram");
        s.add("ram");
        s.add("deepu");
        System.out.println("Set of string elements "+s);
        System.out.println("position" +s.remove("ram"));

        i.add(1);
        i.add(5);
        i.add(1);
        i.add(2);
        i.add(2);
        System.out.println("set of integer elements "+i);

        o.add("raju");
        o.add(78);
        o.add(1);
        System.out.println("set of Object elements " +o);
        for (String s1 :s){
            System.out.println(s1);
        }
        for (Integer in :i){
            System.out.println(in);
        }
        for (Object ob :o){
            System.out.println(ob);
        }









    }
}
