import java.io.*;

public class Example04 {
    public static void main(String[] args) throws IOException {
        FileInputStream in =new FileInputStream("src.txt");
        InputStreamReader isr=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(isr);
        FileOutputStream out =new FileOutputStream("des.txt");
        OutputStreamWriter osw =new OutputStreamWriter(out);
        BufferedWriter bw =new BufferedWriter(osw);
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
        }
        br.close();
        bw.close();

    }
}
