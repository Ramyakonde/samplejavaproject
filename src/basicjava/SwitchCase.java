package basicjava;

public class SwitchCase {

    public static void main(String[] args) {
        char color = 'r';
        switch (color) {
            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'y':
                System.out.println("yellow");
                break;
            default:
                System.out.println("Black and white");
        }
    }
}




