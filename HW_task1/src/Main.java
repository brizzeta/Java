import java.util.Scanner;

public class Main {
    private static void main(String[] args) {
        System.out.print("Тип: int\n");
        System.out.print("Розмір: " + Integer.BYTES + " байт\n");
        System.out.print("Мінімальне значення: " + Integer.MIN_VALUE + "\n");
        System.out.print("Максимальне значення: " + Integer.MAX_VALUE + "\n\n");

        System.out.print("Тип: double\n");
        System.out.print("Розмір: " + Double.BYTES + " байт\n");
        System.out.print("Мінімальне значення: " + Double.MIN_VALUE + "\n");
        System.out.print("Максимальне значення: " + Double.MAX_VALUE + "\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число (int): ");
        if (scanner.hasNextInt()) {  // Перевіряємо, чи введене число є дійсним int
            int intValue = scanner.nextInt();  // Зчитуємо число
            System.out.print("Введене значення (int): " + intValue + "\n\n");
        } else {
            System.out.print("Некоректне введення для типу int.\n\n");
            scanner.next();  // Очищаємо введення
        }

        System.out.print("Введіть число з плаваючою комою (double): ");
        if (scanner.hasNextDouble()) {
            double doubleValue = scanner.nextDouble();
            System.out.print("Введене значення (double): " + doubleValue + "\n");
        } else {
            System.out.print("Некоректне введення для типу double.\n");
        }
    }
}