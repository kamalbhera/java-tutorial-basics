import java.io.File;
import java.io.IOException;

public class fileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("aba.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
    }
}
