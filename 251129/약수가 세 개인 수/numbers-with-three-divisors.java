import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        int answer = 0;

        int sqrtStart = (int) Math.ceil(Math.sqrt(start));
        int sqrtEnd = (int) Math.floor(Math.sqrt(end));

        for (int i = sqrtStart; i <= sqrtEnd; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }

        System.out.println(answer);
        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }
}