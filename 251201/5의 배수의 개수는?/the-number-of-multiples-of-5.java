import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int SIZE = 4;
    private static final int DIVISOR = 5;

    private static int countDivisibleNumbers() throws IOException {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < SIZE; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < SIZE; j++) {
                    int number = Integer.parseInt(st.nextToken());
                    if (number % DIVISOR == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        int result = countDivisibleNumbers();
        System.out.println(result);
    }
}