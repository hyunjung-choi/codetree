import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(1, 'a');

        sb.setCharAt(str.length() - 2, 'a');

        System.out.println(sb);
    }
}