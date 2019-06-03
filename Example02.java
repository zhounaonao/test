package Example01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("test.txt",true);
        String str="你好";
        byte[] b=str.getBytes();
        for (int i=0;i<b.length;i++){
            out.write(b[i]);
        }
        out.close();
    }
}
