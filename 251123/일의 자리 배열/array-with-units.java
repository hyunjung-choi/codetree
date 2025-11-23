import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());

        for (int i = 2; i < 10; i++) {
            int sum = numbers.get(i - 2) + numbers.get(i - 1);
            numbers.add(sum % 10);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}