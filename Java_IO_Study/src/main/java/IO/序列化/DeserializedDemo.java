package IO.序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
             employee = (Employee) in.readObject();
             in.close();
             fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found");
            e.printStackTrace();
            return;
        }
        System.out.println("Name: " + employee.name);  // zhangsan
        System.out.println("Address: " + employee.address); // beiqinglu
        System.out.println("age: " + employee.age); // 0
    }
}
