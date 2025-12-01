import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static void printVerticalZigZag() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print(i + 1);
                    } else {
                        System.out.print(n - i);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        printVerticalZigZag();
    }
}
