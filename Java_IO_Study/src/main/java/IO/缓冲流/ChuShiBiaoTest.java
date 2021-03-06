package IO.缓冲流;

import java.io.*;
import java.util.HashMap;

public class ChuShiBiaoTest {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> lineMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("出师表.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("出师表排序.txt"));
        String line = null;
        while((line = br.readLine()) != null){
            String[] split = line.split("\\.");
            lineMap.put(split[0], split[1]);
        }
        br.close();
        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
            String value = lineMap.get(key);
            bw.write(key+" . "+value+"\n");
        }
        bw.close();

    }
}
