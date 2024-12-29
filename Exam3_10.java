import java.util.Random;
import java.util.Arrays;

public class Exam3_10 {
    public static void main(String[] args) {
        // Определяем размер массива
        int size = 10; // Вы можете изменить размер массива
        int[] array = new int[size];

        // Заполняем массив случайными целыми числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // случайные числа от 0 до 99
        }

        // Выводим исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортируем массив в порядке возрастания
        Arrays.sort(array);

        // Реверсируем массив для получения порядка убывания
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив (по убыванию): " + Arrays.toString(array));
    }
}
