import java.util.Scanner;

public class Exam3_5_while {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
    int n = scanner.nextInt();
    int count = 0;
    int sum = 0;
    int i = 1;
        System.out.print("Суммируемые числа: ");
       while (count<n){

           if (i % 5 == 2 || i % 3 == 1) {
               sum += i;
               System.out.print(i + " ");
               count++;
           }
           i++;
       }
        System.out.println("\nСумма: " + sum);
        scanner.close();
}
}

