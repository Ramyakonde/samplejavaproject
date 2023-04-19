package FileIo;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String toString(){
        return "Employee{"+
                "name"+name+
                "id"+id+
            "salary" +salary+"}";

    }
}
