import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int SIZE = 4;

    private static int calculateLowerTriangleSum() throws IOException {
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < SIZE; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < SIZE; j++) {
                    int number = Integer.parseInt(st.nextToken());
                    if (j <= i) {
                        sum += number;
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        int result = calculateLowerTriangleSum();
        System.out.println(result);
    }
}