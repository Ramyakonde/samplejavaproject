package inheritance;



public class Child extends Parent {
    String name;
    int age;
    String gender;

    public Child(String name, int age, String gender ) {
        this.name = name;
        this.age = age;
        this.gender=gender;
    }

    void familyDetails(Child c){
       // System.out.println("child last name" +c.lastName);
        System.out.println("child  name  "  +c.name  +c.lastName);
        System.out.println("child age "  +c.age);
        System.out.println("child gender "  +c.gender);
    }



}
