import java.io.*;

public class Example03 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("src.txt");
        BufferedReader br =new BufferedReader(reader);
        FileWriter writer=new FileWriter("des.txt");
        BufferedWriter bw =new BufferedWriter(writer);
        String str;
        while ((str=br.readLine())!=null){
            bw.write(str);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
