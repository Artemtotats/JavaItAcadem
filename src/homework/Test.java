package homework;

public class Test {
    public static void main(String[] args) {
        Children children1 = new Children("Tom", "Smit", 12);
        children1.childrenInfo();
        Children children2 = new Children("Sam", "Konor", 13);
        children2.childrenInfo();
        Buyer buyer1 = new Buyer("Hot", "Bob", "Gym", 1973, 12341, 231089);
        buyer1.buyerInfo();
        Buyer buyer2 = new Buyer("Dem", "Bill", "Solmon", 1979, 12398, 231478);
        buyer2.buyerInfo();
        Buyer buyer3 = new Buyer("Rom", "Kill", "Bolmon", 1969, 123987, 231048);
        buyer3.buyerInfo();
        Buyer buyer4 = new Buyer("Lom", "Vill", "Volmon", 1993, 123917, 2310678);
        buyer4.buyerInfo();
        Buyer[] buyers = new Buyer[4];
        buyers[0] = buyer1;
        buyers[1] = buyer2;
        buyers[2] = buyer3;
        buyers[3] = buyer4;
        for (int i = 0; i < buyers.length; i++) {
            if (buyers[i].getIdCard() % 10 == 1) {
                System.out.println(buyers[i].getIdCard()+" "+buyers[i].getName());

            }
        }
    }
}