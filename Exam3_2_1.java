import java.util.Scanner;
public class Exam3_2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine();
        int dayNumber = 0; // Инициализация переменной для порядкового номера дня

        // Определение порядкового номера дня с помощью вложенных условий
        if (dayName.equalsIgnoreCase("понедельник")) {
            dayNumber = 1;
        } else if (dayName.equalsIgnoreCase("вторник")) {
            dayNumber = 2;
        } else if (dayName.equalsIgnoreCase("среда")) {
            dayNumber = 3;
        } else if (dayName.equalsIgnoreCase("четверг")) {
            dayNumber = 4;
        } else if (dayName.equalsIgnoreCase("пятница")) {
            dayNumber = 5;
        } else if (dayName.equalsIgnoreCase("суббота")) {
            dayNumber = 6;
        } else if (dayName.equalsIgnoreCase("воскресенье")) {
            dayNumber = 7;
        } else {
            System.out.println("Такого дня нет.");
            scanner.close();
            return; // Завершить выполнение программы
        }

        // Вывод порядкового номера дня
        System.out.println("Порядковый номер дня недели '" + dayName + "': " + dayNumber);
        scanner.close();
    }
}

