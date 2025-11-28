import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int sum = 0;

            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) sum += j;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
        sc.close();
    }
}
