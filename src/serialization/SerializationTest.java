package serialization;

import javax.imageio.IIOException;
import java.io.IOException;

public class SerializationTest {
    public static void main(String[] args) throws IOException {
        String fileName= "Employee.ser";
        Employee emp = new Employee();
        emp.setName("Ramya");
        emp.setId(28);
        emp.setSalary(5000);
        try{
            SerializationUtil.serialize(emp, fileName);
        }catch(IIOException e){
            e.printStackTrace();

        }
        Employee empNew = null;
        try{
            empNew = (Employee)SerializationUtil.deserialize(fileName);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("emp object" +emp);
        System.out.println("empnew object " +empNew);

    }
}
