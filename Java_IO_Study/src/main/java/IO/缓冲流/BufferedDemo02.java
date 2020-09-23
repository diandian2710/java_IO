package IO.缓冲流;

import java.io.*;

public class BufferedDemo02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("diamonds.csv"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dimonds副本.csv"));
        ){int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end-start)+" ms");
    }
}
