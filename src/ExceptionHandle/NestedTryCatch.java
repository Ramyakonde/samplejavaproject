package ExceptionHandle;

public class NestedTryCatch {

    public static void main(String[] args) {


        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[10]);
            try {
                int x = arr[2] / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println(" try-block1");
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" main try-block");
        }
    }
}




