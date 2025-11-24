import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        String word1 = st.nextToken();
        String word2 = st.nextToken();

        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 == len2) {
            System.out.println("same");
        } else {
            String longer = len1 > len2 ? word1 : word2;
            int maxLen = Math.max(len1, len2);
            System.out.println(longer + " " + maxLen);
        }
    }
}