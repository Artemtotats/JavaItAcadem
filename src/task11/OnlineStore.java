package task11;

import java.io.IOException;

public class OnlineStore {
    private String login;
    private String password;

    private String inputLogin;
    private String inputPassword;

    public OnlineStore(String login, String password) {
        if (login.equals("\\D&\\d")) {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println(" пароль должен содержать хотя ьа одну цифру и буквы латинского алфавита");
            }
            this.login = login;
        }
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInputLogin() {
        return inputLogin;
    }

    public void setInputLogin(String inputLogin) {
        this.inputLogin = inputLogin;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }


    public void Authentication(String inputLogin, String inputPassword) {
        if (!inputLogin.equals(getLogin())||!inputPassword.equals(getPassword())) {
            try {

                throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.err.println("Неверный логин или пороль");
            }


        }

    }
}
