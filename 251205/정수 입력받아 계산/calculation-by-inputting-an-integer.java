import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.println(Integer.parseInt(br.readLine()) * 2 + 3);
        } catch (NumberFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}