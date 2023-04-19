package serialization;
import java.io.IOException;

public class DeserializationTest {
    public static void main(String[] args) {
        String fileName = "Empolyee.ser";
        Employee empNew = null;
        try{
            empNew = (Employee)SerializationUtil.deserialize(fileName);
        }catch(ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        System.out.println("empNew object " +empNew);
    }
}
