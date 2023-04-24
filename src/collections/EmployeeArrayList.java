package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeArrayList {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee emp1 =new Employee("Sai",1,10000);
       Employee emp2 = new Employee("Ram",2,15000);
       Employee emp3 = new Employee("Anu",3,80000);
       Employee emp4 = new Employee("Jake",4,12000);

       list.add(0,emp1);
       list.add(1,emp2);
       list.add(2,emp3);
       list.add(3,emp4);
        Collections.sort(list);
        System.out.println(list);
        list.set(1,emp4);
        for (Employee obj : list) {
            obj.display();
        }

        for (Employee obj2 : list) {
            obj2.display();
        }
       for (Employee emp :list){
           emp.display();
       }

        Employee obj3 = list.get(1);
        System.out.println("getting index 1 values");
        obj3.display();

        Employee obj4 = list.get(2);
        System.out.println("index 2 empolyee");
        obj4.display();




    }
}
