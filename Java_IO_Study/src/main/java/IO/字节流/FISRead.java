package IO.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FISRead {
    public static void main(String[] args) throws IOException, IOException {
        File file = new File("b.txt");
        FileInputStream fis = new FileInputStream(file);

        int len;
        byte[] c = new byte[3];
        while((len = fis.read(c))!=-1){
            System.out.println(len);
//            System.out.println(new String(c));
            System.out.println(new String(c,0,len));
        }
        fis.close();
    }
}
