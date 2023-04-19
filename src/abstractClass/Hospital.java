package abstractClass;

public  abstract class Hospital {
    String location;

    public Hospital(String location) {
        this.location = location;
        System.out.println("hospital location is" +location);
    }

    public Hospital() {
        System.out.println("the name of hospital is apollo");
    }


    public  abstract void register();
    public abstract void service();
    public abstract void billing();

}
