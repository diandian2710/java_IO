package IO.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException, IOException {
        File file = new File("Java_IO_Study/test.txt");
        FileInputStream fis = new FileInputStream(file);
        int b;
        while((b = fis.read())!=-1){
            System.out.println((char)b);    ;
        }
        fis.close();
    }
}
