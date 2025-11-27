import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        while (true) {
            if (num < 25) {
                sb.append("Higher").append("\n");
            } else if (num > 25) {
                sb.append("Lower").append("\n");
            } else {
                sb.append("Good");
                break;
            }
            num = sc.nextInt();
        }

        System.out.print(sb);
    }
}