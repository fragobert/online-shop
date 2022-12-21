import Benutzer.Kaufer;
import Benutzer.Verkaufer;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private String name;


    public Shop(String name) {
        this.name = name;
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("1. Login\n");
        System.out.println("2. Neuen Benutzer Anlegen\n");
        switch (input) {
            case 1: login();
                break;
            case 2:
                break;
        }
    }

    private boolean login() {

        return false;
    }

    private void createUser(){
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("1. Kaufer anlegen");
        System.out.println("2. Verkaufer anlegen");
        input = scanner.nextLine();

        switch(String.valueOf(input )){
            case 1: ;
        }


    }


}
