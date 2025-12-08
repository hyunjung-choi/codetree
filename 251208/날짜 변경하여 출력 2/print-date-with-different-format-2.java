import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] date = br.readLine().split("-");
            System.out.printf("%s.%s.%s", date[2], date[0], date[1]);
        }
    }
}