package IO.属性集;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProDemo02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("ccc.txt");
        properties.load(fileReader);
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"_____"+properties.getProperty(string));
        }
    }
}
