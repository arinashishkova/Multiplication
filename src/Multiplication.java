import java.util.Random;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            System.out.println("Сколько будет " + num1 + " * " + num2 + "? Введите ответ: ");
            int answer = scanner.nextInt();

            if (answer == num1 * num2) {
                System.out.println("\u001B[32mПравильно!\u001B[0m");
                correctAnswers++;
            } else {
                System.out.println("\u001B[31mОшибка!\u001B[0m");
            }
        }

        if (correctAnswers == 5) {
            System.out.println("Молодец!");
        } else if (correctAnswers >= 3) {
            System.out.println("Надо бы еще поучить.");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения.");
        }
    }
}