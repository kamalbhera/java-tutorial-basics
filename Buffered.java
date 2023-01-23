import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {
    public static void main(String [] args) throws IOException, IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("my-file.txt"));
        bw.write(100);
        bw.write("ay");
        bw.write(" wednesday");
        bw.newLine();
        bw.write("hello");
        bw.flush();
        bw.close();
    }
}
