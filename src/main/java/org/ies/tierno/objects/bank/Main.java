package org.ies.tierno.objects.bank;

import org.ies.tierno.objects.bank.model.Bank;
import org.ies.tierno.objects.bank.readers.AccountReader;
import org.ies.tierno.objects.bank.readers.BankReader;
import org.ies.tierno.objects.bank.readers.CustomerReader;
import org.ies.tierno.objects.highschool.model.Highschool;
import org.ies.tierno.objects.highschool.readers.HighschoolReader;
import org.ies.tierno.objects.highschool.readers.StudentReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var customerReaer = new CustomerReader(scanner);
        var accountReader = new AccountReader(scanner, customerReaer);
        var bankReader = new BankReader(scanner, accountReader);

        Bank bank = bankReader.read();

        System.out.println(bank);
    }
}
