package ExceptionHandle;

public class Test {
    public static void main(String[] args) {
        Method1 ex = new Method1();
       try {
           ex.method1();
       } catch(Exception e){
            System.out.println("these is a Exception in Method1 " +e);
        }finally {
           System.out.println("this is final block" );
       }
    }
}
