import java.util.Scanner;
public class Exam3_4_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int second = scanner.nextInt();

        int min = Math.min(first, second); // Наименьшее из двух чисел
        int max = Math.max(first, second); // Наибольшее из двух чисел

        System.out.print("Все целые числа от " + min + " до " + max + ": ");
    do {
        System.out.print (min + " ");
        min++;
    }
    while (min<=max);
        scanner.close();
    }
}
