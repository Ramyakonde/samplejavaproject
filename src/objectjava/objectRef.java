package objectjava;

public class objectRef {
    public objectRef() {
        System.out.println("inside default constructor");
    }

    String name;
    String gender;
    int age;
    int salary;
    void display(objectRef b1){
        b1.name="bhanu";
        b1.gender="male";
        b1.age=36;
        b1.salary=150000;
        System.out.println("emp details"+name);
        System.out.println("emp details" + age);
        System.out.println("emp details"+salary);


    }
}
