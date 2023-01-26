import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("aba.txt");
        fileWriter.write(100);
        fileWriter.write("Java Tutorial by kamal");
        fileWriter.flush();
        fileWriter.close();
    }
}
