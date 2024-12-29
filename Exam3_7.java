public class Exam3_7 {
    public static void main(String[] args) {

        int n = 10;                                         //Кол-во элементов
        char[] charArray = new char[n];
        char b = 'a';
        for (int i = 0; i < charArray.length; i++){         //Цикл от буквы 'a'
            charArray[i] = b;
            b+=2;
            System.out.print(charArray[i] + "\t");
        }
        System.out.println();
        for (int i = charArray.length - 1 ; i >= 0; i--){       // цикл в обратную сторону от буквы 's'
            System.out.print(charArray[i] + "\t");
        }
    }
}

