package ExceptionHandle;

public class Demo {
    public static void main(String[] args) {
        int a = 9;
        if(a<0){
            try{
                throw new NegativeNumberThrow(a);
            }catch(NegativeNumberThrow e){
                e.printStackTrace();
            }
        }else{
            System.out.println("positive number");
        }
    }
}
