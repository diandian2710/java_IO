package IO.属性集;

import java.util.Properties;
import java.util.Set;

public class ProDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("filename", "ac.txt");
        properties.setProperty("length","1024");
        properties.setProperty("location", "~/Documents/My_tutorial/java_IO/Jva_IO_Study");
        System.out.println(properties);

        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"-----"+properties.getProperty(string));
        }

    }
}
