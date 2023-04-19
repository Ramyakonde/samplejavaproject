package inheritance;

public class Inheritance {
    public static void main(String[] args){

        Child c=new Child("akhil", 23,"female");
        c.familyDetails(c);  //subclass method
        c.parentDetails();   //super class method
    }
}
