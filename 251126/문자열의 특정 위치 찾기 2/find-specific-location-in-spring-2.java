import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = {"apple", "banana", "grape", "blueberry", "orange"};

        char ch = sc.next().charAt(0);

        int count = 0;

        for (String str : strings) {
            if (str.charAt(2) == ch) {
                System.out.println(str);
                count++;
            } else if (str.charAt(3) == ch) {
                System.out.println(str);
                count++;
            }
        }

        System.out.println(count);
    }
}