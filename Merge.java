import java.io.FileInputStream;
import java.io.IOException;
public class Merge {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("Sample.txt");
            FileInputStream fis2 = new FileInputStream("Sample2.txt");
            int i;
            while ((i = fis1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println(); 
            while ((i = fis2.read()) != -1) {
                System.out.print((char) i);
            }
            fis1.close();
            fis2.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}