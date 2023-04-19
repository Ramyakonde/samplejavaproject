package ExceptionHandle;

public class NegativeNumberThrow extends Exception{
    int x;
    public NegativeNumberThrow(int i){
        this.x = i;
    }
    public String toString(){
        System.out.println("given number is negative");
        return "given number is negative";
    }
}
