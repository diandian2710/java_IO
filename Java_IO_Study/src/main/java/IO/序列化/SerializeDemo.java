package IO.序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "xihengwang";
        e.address = "sydney";
        e.age = 20;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            fileOut.close();
            out.close();
            System.out.println("Serialized data is save");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
