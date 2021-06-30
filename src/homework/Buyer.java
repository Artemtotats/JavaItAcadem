package homework;

public class Buyer {
    private static int YEAR = 2021;
    private String surName;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private int idCard;
    private int idBank;

    public Buyer(String surName, String name, String patronymic, int yearOfBirth, int idCard, int idBank) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.idCard = idCard;
        this.idBank = idBank;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public static int getYEAR() {
        return YEAR;
    }

    public static void setYEAR(int YEAR) {
        Buyer.YEAR = YEAR;
    }

    public void buyerInfo() {
        System.out.println("Имя: " + name + " " + "Фамилия: " + surName + " Возраст: " + (YEAR - yearOfBirth) +
                " отчество: " + " " + patronymic + " " + " номер карты: " + " " + idCard + " " + " номер счета: " + idBank);

    }
}
