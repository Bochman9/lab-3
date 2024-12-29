import java.util.Scanner;
public class Exam3_3_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();

        int a = 1, b = 1; // Первые два числа Фибоначчи
        int count = 1; // Счетчик для количества чисел

        System.out.print("Последовательность Фибоначчи: ");

        while (count <= n) {
            System.out.print(a + " ");
            int next = a + b; // Сумма двух предыдущих чисел
            a = b; // Сдвиг в последовательности
            b = next;
            count++; // Увеличиваем счетчик
        }

        scanner.close();
    }
}

