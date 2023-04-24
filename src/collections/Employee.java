package collections;

public class Employee  implements Comparable{
    String name;
    int id;
    float salary;

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

public void display(){
    System.out.println("Empolyee name "+name);
   // System.out.println("Empolyee id" +id);
   // System.out.println("Empolyee salary " +salary);
}

    @Override
    public int compareTo(Object o) {
        Employee em = (Employee) o;
                int namediff = name.compareToIgnoreCase(em.name);
        return namediff;
    }
}

