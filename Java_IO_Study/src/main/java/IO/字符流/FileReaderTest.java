package IO.字符流;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException, IOException {
        File file = new File("a.txt");
        FileReader fr = new FileReader(file);

        int b;
        while((b = fr.read())!= -1){
            System.out.print((char)b);
        }
        fr.close();
        fr = new FileReader(file);
        int len;
        char[] cbuf  = new char[2];
        while((len = fr.read(cbuf)) != -1){
            System.out.println(new String(cbuf,0,len));
        }
        fr.close();
    }
}
