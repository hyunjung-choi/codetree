import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.println("Your score is " + Integer.parseInt(br.readLine()) + " point.");
        } catch (NumberFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
