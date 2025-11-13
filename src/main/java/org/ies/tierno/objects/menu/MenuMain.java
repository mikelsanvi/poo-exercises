package org.ies.tierno.objects.menu;

import java.util.Scanner;

public class MenuMain {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MyMenuOptions option;
        do {
            MyMenuOptions.printMenu();
            option = MyMenuOptions.fromOpt(scanner.nextInt());
            scanner.nextLine();
            if (option == MyMenuOptions.Sum) {

            }

        } while (option != MyMenuOptions.Exit);
    }
}
