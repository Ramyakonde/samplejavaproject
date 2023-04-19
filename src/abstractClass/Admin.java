package abstractClass;

public class Admin {
    public static void main(String[] args) {
        Registration r1=new Registration("hyderabad");
        String name[]={"ramya", "roja", "ram"};

        for(int i=0;i< name.length;i++){
        if( name[i]=="ramya")
        {
            System.out.println("user already registered");
        }
        }

            System.out.println("not a avalid user");

        r1.register();
        r1.service();
        r1.billing();
    }
}
