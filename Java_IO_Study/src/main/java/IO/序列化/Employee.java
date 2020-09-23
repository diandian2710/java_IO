package IO.序列化;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int age;
    public void addCheck(){
        System.out.println("Address check:" + name + "___" + address);
    }
}
