import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printFiveNumbers();

        System.out.println("Max: " + returnMax(1, 2));

        printList();

        var book = new Book("Java 101", 100);
        System.out.println("Book title: " + book.title());

        divisionByZero();
    }

    private static void divisionByZero() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }

    private static void printList() {
        var list = new ArrayList<>(List.of("red", "green", "blue"));
        list.add("yellow");
        list.forEach(System.out::println);
    }

    private static int returnMax(int a, int b) {
        return Math.max(a, b);
    }

    private static void printFiveNumbers() {
        for (int i = 1; i <= 5; ++i)
            System.out.println(i);
    }

    public record Book(String title, int pages) {
    }
}