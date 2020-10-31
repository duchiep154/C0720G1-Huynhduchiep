package controllers;

import exception.EmailException;

import java.io.IOException;

public class maintest {
    public static void main(String[] args) {
        MainController mainController=new MainController();
        try {
            MainController.displayMainMenu();
        } catch (IOException | EmailException e) {
            e.printStackTrace();
        }
    }
}
