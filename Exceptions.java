import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {
    public void reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
    }

    public void reader2() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("An error has occured");
        }
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("An error has occured");
        }
    }

    public static String reader3(String path) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }

    }
}
