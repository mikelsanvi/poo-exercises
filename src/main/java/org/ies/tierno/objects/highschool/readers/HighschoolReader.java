package org.ies.tierno.objects.highschool.readers;

import org.ies.tierno.objects.highschool.model.Highschool;
import org.ies.tierno.objects.highschool.model.Student;

import java.util.Scanner;

public class HighschoolReader {
    private final Scanner scanner;
    private final StudentReader studentReader;

    public HighschoolReader(Scanner scanner, StudentReader studentReader) {
        this.scanner = scanner;
        this.studentReader = studentReader;
    }

    public Highschool read() {
        System.out.println("Introduce los datos del instituto");

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        int numStudents;
        do {
            System.out.println("¿Cuántos estudiantes hay en el instituto?");
            numStudents = scanner.nextInt();
            scanner.nextLine();
        } while(numStudents < 1);

        Student[] students = new Student[numStudents];

        for (int i = 0; i < students.length; i++) {
            students[i] = studentReader.read();
        }

        return new Highschool(name, students);
    }
}
