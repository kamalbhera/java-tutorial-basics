import java.io.File;

public class CountFileInDirectory {
    public static void main(String[] args) {
        int count =0;
        // For Windows
        //  File f = new File("C:\\Users");
        //Mac
        File f = new File("/Library");
        String[] s= f.list();
        for (String S:s) {
            count++;
            System.out.println(S);
        }
        System.out.println("count files in a directory" + count);
    }
}
