package basicjava;

public class Continue {

        public static void main(String[] args) {
            for(int i = 1; i<=10; i++) {
                if(i==5) continue;//;  // after continue, the statements inside the loop are not executed.
                System.out.println(i);
            }
        }
    }


