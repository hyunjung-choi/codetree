import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] phone = br.readLine().split("-");
            System.out.printf("%s-%s-%s", phone[0], phone[2], phone[1]);
        }
    }
}