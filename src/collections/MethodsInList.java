package collections;
import java.util.*;

public class MethodsInList {
    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>();
        //List<String> s = new LinkedList<>();
        List<Integer> i2 = new ArrayList<>();
        List<Object> obj = new ArrayList<>();
        obj.add("star");
        obj.add("sun");
        obj.add("sun");
        obj.add("sun");
        obj.add(9);
        obj.add(9);
        System.out.println(obj);
        System.out.println(obj.remove("sun"));//first occurrence of sun will be removed
        System.out.println(obj.remove(3));
        System.out.println(obj);
        i1.add(10);
        i1.add(20);
        i1.add(30);
        i2.add(1000);
        i2.add(3000);
        i2.add(5000);
        i2.add(7000);
        i2.add(5000);
        i2.add(2000);
        System.out.println(i1);
        System.out.println(i2);
                              //Methods in list//
        i1.add(0,0);    //void add(int index,E element);
        System.out.println(i1.add(200)); //boolean add(element);
        System.out.println(i2.equals(300)); //boolean equals(Object o);
        System.out.println("hash code of i1  " +i1.hashCode());
        System.out.println("get index 2 element of list i2 "+i2.get(2)); //get(index x);
        System.out.println("is list i1 empty " +i1.isEmpty());
        System.out.println("last index of 5000  "+i2.lastIndexOf(5000));
        System.out.println(i2.toArray());
        System.out.println(i2.contains(9));
        System.out.println(i2.indexOf(1000));
        System.out.println(i2.remove(1));
        List<Integer> i3 = i2.subList(1,3);
        System.out.println(i3);
         System.out.println(i2.addAll(i1));
        System.out.println("list i1 is added to i2 "+i2);
        System.out.println("check i2 contains i1"+i2.containsAll(i1));
        //System.out.println(i1.addAll(i2 extends Integer> i1));
        //Object[] toArray()
        //<T> T[] toArray(T[] a)
        //System.out.println("sorting" +i2.sort(Comparator comp));
       // void replaceAll(UnaryOperator<E> operator)
        //void retainAll(Collection<?> c)
        //void sort(Comparator<? super E> c)
        System.out.println( i2.spliterator());




    }

}
