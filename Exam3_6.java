import java.util.Scanner;

public class Exam3_6 {
    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()) {

            int n = Integer.parseInt(scanner.next());
            if (n <= 0){
                System.out.println("Не может быть такое число");
                System.exit(0);
            }
            int[] arrDigits = new int[n];

            int k = 0;                                  // индекс числа, которое равно i % 5 == 2
            double valSquare = 2;
            double p = (double) n;                      // длина массива в двойном сокращении
            double limitDigit = Math.pow(p, valSquare);  // длина массива
            int digit = (int) limitDigit + 5;            // предел значений массива

            for (int i = 0; i <= digit; i++) {
                if (i % 5 == 2) {
                    arrDigits[k] = i;
                    k++;
                    if (k >= n) {
                        break;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arrDigits[j] + "\t");
            }
        } else {
            System.out.println("Это не число");
        }
    }
}
