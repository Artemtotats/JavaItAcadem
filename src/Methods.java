import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Methods {


    public static String name() {
        Scanner input = new Scanner(System.in);

        System.out.println("вводите именя пользователя с клавиатуры");
        String name = input.nextLine();
        System.out.println("именя пользователя: " + " " + name);
        return name;
    }

    static int whole() {
        Scanner input = new Scanner(System.in);
        System.out.println("вводите целое число с клавиатуры ");
        int whole = input.nextInt();
        return whole;
    }

    static double fraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("вводите дробное число с клавиатуры ");
        return input.nextDouble();
    }

    static int pow() {
        Scanner pow = new Scanner(System.in);
        System.out.println("введите число для возведения его в квадрат ");
        int value = pow.nextInt();
        System.out.println("квадрат числа равен" + " " + value * value);
        return value;
    }

    static double mean() {
        Scanner mean = new Scanner(System.in);
        System.out.println("введите два числа для для  подсчета среднеарифметического ");
        double a = mean.nextInt();
        double b = mean.nextInt();
        double mean1 = (a + b) / 2;
        System.out.println("среднеарифметическое двух чисел авно" + " " + mean1);
        return mean1;
    }

    static double meanThree() {
        Scanner meanThree = new Scanner(System.in);
        System.out.println("введите три числа для для  подсчета среднеарифметического ");
        double a = meanThree.nextInt();

        double b = meanThree.nextInt();
        double c = meanThree.nextInt();
        double meanThrees = (a + b + c) / 3;
        System.out.println("среднеарифметическое трех чисел равно" + " " + meanThrees);
        return meanThrees;
    }

    static int random(int min, int max) {
        Random random = new Random();
        int randoms = (random.nextInt((max - min) + 1));
        System.out.println("рандомное число равняется :" + " " + randoms);
        return randoms;
    }

    public static String evan() {
        System.out.println("введите число для провеки ");
        Scanner evan = new Scanner(System.in);
        int a = evan.nextInt();
        String evanOrNotEvan = a % 2 == 0 ? "Число четное" : "Число не четное";
        System.out.println(evanOrNotEvan);
        return evanOrNotEvan;
    }

    static int dayOffTheWeek() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Воскресение");
                break;
            case 2:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Понедельник");
                break;
            case 3:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Вторник");
                break;
            case 4:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Среда");
                break;
            case 5:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Четверг");
                break;
            case 6:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Пятница");
                break;
            case 7:
                System.out.println("день недели :" + " " + dayOfWeek + " " + "Субота");
                break;


        }
        return dayOfWeek;
    }

    public static int sum(int n) {
        int sum = 0;
        if (n <= 1) {
            System.out.println("Введенное значение должно быть больше 0");
        }
        for (int i = 0; i <= n; i++) sum = sum + i;
        System.out.println("Сумма чисел равна:" + " " + sum);
        return sum;
    }


    public static void compareString(String srt) {
        System.out.println(srt);
        System.out.println(srt.endsWith("!!!"));
        System.out.println(srt.startsWith("I like"));
        System.out.println(srt.contains("java"));
        System.out.println(("IndexOf = ") + srt.indexOf("java"));
        System.out.println(srt.replace('a', 'o'));
        System.out.println(srt.toUpperCase());
        System.out.println(srt.toLowerCase());
        System.out.println(srt.substring(7));

    }

    public static int commaString(String srt) {
        int n = 0;
        char symbol;
        for (int i = 0; i < srt.length(); i++) {
            symbol = srt.charAt(i);
            if (symbol == ',') {
                n++;
            }
        }
        System.out.println("Есть " + n + " запятых");
        return n;
    }

    public static void mergerLetters(String sentence) {
        sentence = sentence.replaceAll("[!.,:;-]", "");

        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (String word : words) {
            newSentence.append(word.charAt(word.length() - 1));
        }

        System.out.println(newSentence);
    }
}

