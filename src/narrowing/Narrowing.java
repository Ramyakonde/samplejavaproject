package narrowing;

public class Narrowing {
    public static void main(String[] args){
        SuperClass o;
        o = new SubClass();
        SubClass t = (SubClass) o;
        t.show1();
        t.show2();
    }
}
