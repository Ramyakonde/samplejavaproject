package ExceptionHandle;

public class ExceptionHandling {
    public static void main(String[] args) {

        ExceptionHandling ex = new ExceptionHandling();
        int a =40;
        int j = 0;

        try {
            int x = a / j;
        }
        catch(ArithmeticException x)
        {
            System.out.println("exception occurred");

        }
        finally {
            System.out.println("final block executed");
        }

        }
    }

