import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        while (n != 0) {
            sb.append(n).append("\n");
            n = sc.nextInt();
        }

        System.out.print(sb);
    }
}