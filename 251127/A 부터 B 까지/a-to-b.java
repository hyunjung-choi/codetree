import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt(), b = sc.nextInt();

        while (a <= b) {
            sb.append(a).append(" ");
            if (a % 2 == 0) a += 3;
            else a *= 2;
        }

        System.out.print(sb);
    }
}