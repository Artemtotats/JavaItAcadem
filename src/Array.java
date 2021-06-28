import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] strings = new String[7];
        strings[0] = "Воскресенье";
        strings[1] = "Понедельник";
        strings[2] = "Вторник";
        strings[3] = "Среда";
        strings[4] = "Четверг";
        strings[5] = "Пятница";
        strings[6] = "Суббота";
        System.out.println(strings[6]);

        int numbers[] = {1, 2, 6, 8, 5, 9, 11};
        int sum = 0;
        for (int number : numbers) {
            sum = (sum + number);
        }
        System.out.print((sum = sum / numbers.length) + " " + "среднеарифметическое масива");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < sum) {
                System.out.println(numbers[i]);
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длинну массива");
        int size = scanner.nextInt();

        int array[] = new int[size];
        System.out.println("заполните массив");
        for (int i = 0; i < size - 1; i++) {
            array[i] = scanner.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("заполните значение в массив");
        for (int j = 0; j == size + 1; j++) {
            array[j] = scanner.nextInt();
            System.out.println(array[j]);


        }

        int mas[][] = {{4, 5, 9, 6}, {6, 8, 9, 4}};
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > 0 && mas[i][j] > max) {
                    if (mas[i][j] > max) {
                        max = mas[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
        }
        System.out.println("max:" + max + "\nindexi: i=" + x + " j=" + y);

    }

}
