package ExceptionHandle;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("main method starts....................");
        ExceptionDemo obj = new ExceptionDemo();
        try{
            int a = Integer.parseInt(args[0]);
            obj.calculate(a);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e1){
            e1.printStackTrace();
        } finally{
            System.out.println("Inside FFinally Block");
        }
        System.out.println("main method ends");
    }
    private void calculate(int a) {
        int x = 36 / a;
        System.out.println(x);
    }

}

