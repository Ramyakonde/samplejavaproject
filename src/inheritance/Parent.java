package inheritance;

public class Parent {
    String lastName;
    String fatherName;
    String loction;

     Parent() {
         lastName = "sharma";
          loction = "hyderabad";
          fatherName = "Rama";
    }
void parentDetails(){
     System.out.println("father name " +  fatherName+  lastName);
     System.out.println("loction " +loction);

}
}
