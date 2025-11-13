package org.ies.tierno.objects.highschool;

import org.ies.tierno.objects.highschool.model.Highschool;
import org.ies.tierno.objects.highschool.model.Student;
import org.ies.tierno.objects.highschool.readers.HighschoolReader;
import org.ies.tierno.objects.highschool.readers.StudentReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentReader studentReader = new StudentReader(scanner);
        HighschoolReader highschoolReader = new HighschoolReader(scanner, studentReader);

        Highschool highschool = highschoolReader.read();

        System.out.println(highschool);
    }
}
