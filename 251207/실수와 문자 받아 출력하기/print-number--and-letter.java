import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String c = br.readLine();
            double a = Double.parseDouble(br.readLine());
            double b = Double.parseDouble(br.readLine());
            System.out.printf("%s\n%.2f\n%.2f\n", c, a, b);
        }
    }
}