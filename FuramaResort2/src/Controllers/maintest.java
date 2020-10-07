package Controllers;

import java.io.IOException;

public class maintest {
    public static void main(String[] args) {
        MainController mainController=new MainController();
        try {
            MainController.displayMainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
