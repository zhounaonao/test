package Example01;

import java.io.*;

public class e4 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("des.txt"));
        int len;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
