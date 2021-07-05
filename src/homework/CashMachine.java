package homework;

public class CashMachine {
    private int coins20 = 0;
    private int coins50 = 0;
    private int coins100 = 0;

    public CashMachine(int coins20, int coins50, int coins100) {
        this.coins20 = coins20;
        this.coins50 = coins50;
        this.coins100 = coins100;
    }

    public int getCoins20() {
        return coins20;
    }

    public void setCoins20(int coins20) {
        this.coins20 = coins20;
    }

    public int getCoins50() {
        return coins50;
    }

    public void setCoins50(int coins50) {
        this.coins50 = coins50;
    }

    public int getCoins100() {
        return coins100;
    }

    public void setCoins100(int coins100) {
        this.coins100 = coins100;
    }

    public static void addMoney(int coins20, int coins50, int coins100, int addcoins20, int addcoins50, int addcoins100) {
        coins20 += addcoins20;
        coins50 += addcoins50;
        coins100 += addcoins100;
        int allAddCons = addcoins20 * 20 + addcoins50 * 50 + addcoins100 * 100;
        int allCoins = coins20 * 20 + coins50 * 50 + coins100 * 100;
        System.out.println("Добовление наличных :" + allCoins + " Кол-во купюр:"+allAddCons);

    }

    public static boolean takeAwayMoney(int sum, int coins20, int coins50, int coins100) {
        if (sum > coins20 * 20 + coins50 * 50 + coins100 * 100) {
            sum -= coins20 * 20 + coins50 * 50 + coins100 * 100;
            System.out.println("Снятие наличных :"+sum +  coins20 +  coins50  +coins100);
            return true;
        } else return false;

    }
}
