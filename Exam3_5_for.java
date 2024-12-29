import java.util.Scanner;

public class Exam3_5_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;
        System.out.print("Суммируемые числа: ");
        for (int i = 1; count < n; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nСумма: " + sum);
        scanner.close();
    }
}
