package abstractClass;

public class Registration extends Hospital{

    public Registration(String location) {
        super(location);
            }



    @Override
    public void register() {
        System.out.println("if patients is new please register");

    }
    public void service(){
        System.out.println("medical treatment provided");

    }

    @Override
    public void billing() {
        System.out.println("bill for the patient");
    }
}
