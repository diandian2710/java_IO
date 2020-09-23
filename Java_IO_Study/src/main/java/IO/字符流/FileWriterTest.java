package IO.字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException, IOException {
        File file = new File("d.txt");
        FileWriter fw = new FileWriter(file);

        /*
        写入单个字符
         */
        fw.write(97);
        fw.write('b');
        fw.write('c');
        fw.write(30000);
        //fw.flush();   //刷新缓冲区数据到文件
        fw.close();  //不刷新也不不关闭的话，数据只能保存在缓冲区，并未写入文件

        /*
        写入字符数组
         */
        fw = new FileWriter(file,true);
        char[] wbuf = "Java程序员".toCharArray();
        fw.write(wbuf);
        fw.write('学');
        fw.write(wbuf,0,4);
        fw.close();
    }
}
