import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReadExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Sample.txt", true);
            String data = "\nHello to everyone";
            fos.write(data.getBytes());
            fos.close();
            FileInputStream fis = new FileInputStream("Sample.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}