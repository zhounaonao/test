import java.io.FileWriter;
import java.io.IOException;

public class Example02 {
    public static void main(String[] args) throws IOException {
        FileWriter writer= new FileWriter("writer.txt");
        String str="你好，传智播客";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
