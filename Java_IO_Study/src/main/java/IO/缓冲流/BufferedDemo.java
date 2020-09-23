package IO.缓冲流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//使用字节流
public class BufferedDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try( FileInputStream fileInputStream = new FileInputStream("diamonds.csv");
             FileOutputStream fileOutputStream = new FileOutputStream("diamonds副本.csv");
       ){
            int b;
            while((b=fileInputStream.read())!=-1){
                fileOutputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time: "+(end-start)+" ms");
    }
}


