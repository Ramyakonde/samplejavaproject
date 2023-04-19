package objectjava;

public class MethodNoParReturn {
    int a;
    int b;
    public MethodNoParReturn() {
        a = 56;
        b = 78;

    }
    public void sum() {
        int sum = a+b;
        System.out.println("sum of two numbers" + sum);
    }
}
