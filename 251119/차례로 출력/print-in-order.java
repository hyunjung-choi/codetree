import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(5, 17).forEach(i -> System.out.print(i + " "));
    }
}