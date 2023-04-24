package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("jack",1,20000);
        Employee e2 = new Employee("sack",2,3000);
        Employee e3 = new Employee("alex",3,5000);
        Employee e4 = new Employee("sam",5,6000);
        Map<String,Employee> hm = new HashMap<>();
        hm.put("jack",e1);
        hm.put("sack",e2);
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key :keys) {
            System.out.println(key);
            Employee obj = hm.get(key);
            obj.display();
        }
        hm.remove("sam");
        System.out.println(hm);
        hm.remove("alex", e3);
        System.out.println(hm);

    }
}
