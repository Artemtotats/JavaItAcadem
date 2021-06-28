import java.util.Scanner;

public class Main {
    private static Object Solution;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Вабери метод 1-10, (0-вызод из программы)");
            switch (scanner.nextInt()) {
                case 1:
                    Methods.mean();

                    break;
                case 2:
                    Methods.evan();

                    break;
                case 3:
                    Methods.dayOffTheWeek();
                    break;
                case 4:
                    Methods.random(7, 79);
                    break;
                case 5:
                    Methods.sum(2);
                    break;
                case 6:
                    Methods.whole();
                    break;
                case 7:
                    Methods.fraction();
                    break;
                case 8:
                    Methods.pow();
                    break;
                case 9:
                    Methods.meanThree();
                    break;
                case 10:
                    Methods.name();
                    break;
                default:
                    System.out.println("Неверный ввод");
                case 0:
                    System.out.println("выход из программы");
                    return;

            }
        }
    }
}