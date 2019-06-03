package Example01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example01 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("test.txt");
        int b=0;
        while((b=in.read())!=-1){

            System.out.println(b);
        }
        in.close();
    }
}
