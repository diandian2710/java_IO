package IO.File类.demo01;

import org.junit.Test;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        /*文件路径名*/
        String pathname = "E:\\CodePlace\\Java\\idea\\狂神说Java\\JavaSE\\a.txt";
        File file = new File(pathname);
        System.out.println(file);

        /*父路径+子路径*/
        String parent = "E:\\CodePlace\\Java\\idea\\狂神说Java\\JavaSE";
        String child = "a.txt";
        File file1 = new File(parent,child);
        System.out.println(file1);

        /*父级对象和子路径*/
        File parentDir = new File("E:\\CodePlace\\Java\\idea\\狂神说Java\\JavaSE");
        child = "a.txt";
        File file2 = new File(parentDir,child);
        System.out.println(file2);

        File file3 = new File("E:\\CodePlace\\Java\\idea\\狂神说Java\\JavaSE\\基础语法\\src\\IO\\File类\\demo01\\a.txt");
        //绝对路径名
        System.out.println(file3.getAbsolutePath());
        //将file3转换为路径名字字符
        System.out.println(file3.getPath());
        //文件名
        System.out.println(file3.getName());
        //长度
        System.out.println(file3.length());


    }
}
