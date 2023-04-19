package FileIo;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ArraySe {
    public static void main(String[] args) {
        List<Employee> ls = new ArrayList<>();
        Employee e1 = new Employee("sita", 1, 234);
        Employee e2 = new Employee("ram", 9, 345);
        ls.add(e1);
        ls.add(e2);
        String fileName = "Employee.txt";
        try {
            Util.serialize((Employee) e1, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Employee output = null;

            try {
                output = (Employee) Util.deserialize(fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            System.out.println(output);


    }

    }


