import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Metods {

    static void name() {
        Scanner input = new Scanner(System.in);

        System.out.println("вводите именя пользователя с клавиатуры");
        String name = input.nextLine();
        System.out.println("именя пользователя: " + " " + name);
    }

    static void whole() {
        Scanner input = new Scanner(System.in);
        System.out.println("вводите целое число с клавиатуры ");
        int whole = input.nextInt();
    }

    static void fraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("вводите дробное число с клавиатуры ");
        double fraction = input.nextDouble();
    }

    static void pow() {
        Scanner pow = new Scanner(System.in);
        System.out.println("введите число для возведения его в квадрат ");
        int value = pow.nextInt();
        System.out.println("квадрат числа равен" + " " + value * value);

    }

    static void mean() {
        Scanner mean = new Scanner(System.in);
        System.out.println("введите два числа для для  подсчета среднеарифметического ");
        double a = mean.nextInt();
        double b = mean.nextInt();
        System.out.println("среднеарифметическое двух чисел авно" + " " + (a + b) / 2);

    }

    static void meanThree() {
        Scanner meanThree = new Scanner(System.in);
        System.out.println("введите три числа для для  подсчета среднеарифметического ");
        double a = meanThree.nextInt();
        double b = meanThree.nextInt();
        double c = meanThree.nextInt();
        System.out.println("среднеарифметическое трех чисел равно" + " " + (a + b + c) / 3);
    }

    static void random() {
        Random random = new Random();
        System.out.println("рандомное число равняется :" + " " + Math.random());
    }

    static void evan() {
        System.out.println("введите число для провеки ");
        Scanner evan = new Scanner(System.in);
        int a = evan.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }

    static void dayOffTheWeek() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                System.out.println("день недели :" + " " + dayOfWeek + " "+"Воскресение");
                break;
            case 2:
                System.out.println("день недели :" + " " + dayOfWeek + " "+"Понедельник");
                break;
            case 3:
                System.out.println("день недели :" + " " + dayOfWeek + " "+"Вторник");
                break;
            case 4:
                System.out.println("день недели :" + " " + dayOfWeek +" "+ "Среда");
                break;
            case 5:
                System.out.println("день недели :" + " " + dayOfWeek +" "+ "Четверг");
                break;
            case 6:
                System.out.println("день недели :" + " " + dayOfWeek +" "+ "Пятница");
                break;
            case 7:
                System.out.println("день недели :" + " " + dayOfWeek + " "+"Субота");
                break;


        }
    }
}
