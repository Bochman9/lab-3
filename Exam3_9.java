
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exam3_9 {
    public static void main(String[] args) {
        // Определение размера массива
        int size = 10; // Вы можете изменить размер массива
        int[] array = new int[size];

        // Заполняем массив случайными целыми числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // случайные числа от 0 до 99
        }

        // Выводим массив в консоль
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        // Находим минимальное значение в массиве
        int minValue = array[0];
        ArrayList<Integer> minIndices = new ArrayList<>();

        // Поиск минимального значения и его индексов
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndices.clear(); // очищаем список индексов, если найдено новое минимальное значение
                minIndices.add(i);
            } else if (array[i] == minValue) {
                minIndices.add(i); // добавляем индекс, если значение равно минимальному
            }
        }

        // Выводим значение минимального элемента и его индексы
        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы элементов с минимальным значением: ");
        for (int index : minIndices) {
            System.out.print(index + " "); // выводим индексы через пробел
        }
    }
}
