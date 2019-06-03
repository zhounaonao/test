package Example01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example03 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream(".\\sk63\\nn1\\Wildlife.wmv");
        FileOutputStream out=new FileOutputStream(".\\sk63\\nn2\\Wildlife.wmv");
        int len;
        long beginttime=System.currentTimeMillis();
        while((len=in.read())!=-1){
            out.write(len);
        }
        long endtime=System.currentTimeMillis();
        System.out.println("时间"+(endtime-beginttime));
        in.close();
        out.close();
    }
}
