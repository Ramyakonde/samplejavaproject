package pacakages;

public class Add implements numbers{
    @Override
    public void addition(int a,int b) {
        System.out.println("adding number" +(a+b));
    }

   @Override
    public void subtraction(int a,int b) {
        System.out.println("subtraction number" +(a-b));


    }

    @Override
    public void multiplication(int a,int b) {
        System.out.println("multiplication of number" +(a*b));

    }

    @Override
    public void division(int a,int b) {
        System.out.println("division of number" +(a/b));

    }
}
