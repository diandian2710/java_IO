package IO.字节流;

import java.io.*;

public class PictureCopy {
    public static void main(String[] args) throws IOException {
        File file = new File("image.jpg");
        File file1 = new File("testcopy.jpg");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        int b;

        while((b=fileInputStream.read())!=-1){
            System.out.println(b);
            fileOutputStream.write(b);
        }
        fileOutputStream.close();
        fileInputStream.close();

    }
}
