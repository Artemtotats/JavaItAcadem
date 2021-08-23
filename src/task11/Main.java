package task11;

public class Main {
    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore(" ", "12345");
        onlineStore.Registration();
        onlineStore.Authentication("sam", "12345");
    }

}

