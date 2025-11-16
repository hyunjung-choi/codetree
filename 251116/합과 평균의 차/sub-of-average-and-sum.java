import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
        int average = sum / 3;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(sum - average);
    }
}