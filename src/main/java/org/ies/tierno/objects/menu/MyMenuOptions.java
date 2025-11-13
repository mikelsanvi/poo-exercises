package org.ies.tierno.objects.menu;

public enum     MyMenuOptions {
    Sum("Sumar"),
    Substract("Restar"),
    Multiply("Multiplicar"),
    Division("Dividir"),
    Exit("Salir");

    private final String description;

    MyMenuOptions(String description) {
        this.description = description;
    }

    public static MyMenuOptions fromOpt(int opt) {
        int idx = opt - 1;
        if (idx < 0 || idx >= MyMenuOptions.values().length) {
            return null;
        } else {
            return MyMenuOptions.values()[idx];
        }
    }


    public static void printMenu() {
        System.out.println("Elige una opción:");
        MyMenuOptions[] options = MyMenuOptions.values();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i].description);
        }
    }
}