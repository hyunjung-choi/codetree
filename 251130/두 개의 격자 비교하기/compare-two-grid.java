import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = readArray(br, n, m);
        int[][] b = readArray(br, n, m);

        printDifference(a, b, n, m);
    }

    private static int[][] readArray(BufferedReader br, int n, int m) throws IOException {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return array;
    }

    private static void printDifference(int[][] a, int[][] b, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((a[i][j] == b[i][j] ? 0 : 1) + " ");
            }
            System.out.println();
        }
    }
}
