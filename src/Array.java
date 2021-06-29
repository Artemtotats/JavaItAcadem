import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static String[] daysOfWeek(String[] strings) {
        strings[0] = "Воскресенье";
        strings[1] = "Понедельник";
        strings[2] = "Вторник";
        strings[3] = "Среда";
        strings[4] = "Четверг";
        strings[5] = "Пятница";
        strings[6] = "Суббота";
        System.out.println(strings[6]);
        return strings;
    }

    public static int[] minMiddlingArithmetic(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = (sum + number);
        }
        System.out.print((sum = sum / numbers.length) + " " + "среднеарифметическое масива");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < sum) {
                System.out.println(numbers[i] + " элементы массива  меньше ср.ариф");
            }
        }
        return numbers;
    }

    public static int[] insertNumber(int[] array, int index, int value) {
        for (int i = array.length; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        return array;
    }

    public static int[] masA(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.println(mas[i]);
            }
        }
        return mas;
    }


    public static int[][] maxNumber(int[][] mas) {
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
        return mas;
    }
}

