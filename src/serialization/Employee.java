package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
          return "Employee{" +
                  "name="+name+"," +
                  "id="+id+"," +
                  "salary="+salary+"}";
    }


}
