package IO.字节流;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException, IOException {
        File file= new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        //FileOutputStream fos = new FileOutputStream(file,true); //true追加写，默认false:清空后在写
        fos.write(97);
        fos.write(98);
        fos.write(99);

        byte[] b = "学习Java IO流".getBytes();
        fos.write(b);


        byte[] c = "abcde".getBytes();
        fos.write(c,2,2);
        fos.write("\n".getBytes());
        byte[] words = {97,98,99,100,101};
        for (int i = 0; i <words.length ; i++) {
            fos.write(words[i]);
            fos.write("\n".getBytes());
        }

        fos.close();
    }
    @Test
    public void test() throws IOException {
        File file1 = new File("test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        byte[] b = "学习Java IO流".getBytes();
        fileOutputStream.write(b);
        byte[] c = "abcde".getBytes();
        fileOutputStream.write(c,2,2);
        fileOutputStream.write("\n".getBytes());

        byte[] words = {97,98,99,100,101};
        for (int i = 0; i <words.length ; i++) {
            fileOutputStream.write(words[i]);
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();
    }
}
