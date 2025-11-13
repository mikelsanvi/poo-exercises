package org.ies.tierno.objects.library.readers;

import org.ies.tierno.objects.library.model.Author;
import org.ies.tierno.objects.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AuthorReader authorReader;

    public BookReader(Scanner scanner, AuthorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read() {
        System.out.println("Introduce los datos del libro");
        System.out.println("ISBN:");
        long isbn = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Título:");
        String title = scanner.nextLine();

        System.out.println("Año:");
        int year = scanner.nextInt();
        scanner.nextLine();

        int numAuthors;
        do {
            System.out.println("¿Cuántos autores tiene el libro?");
            numAuthors = scanner.nextInt();
            scanner.nextLine();
        } while (numAuthors < 1);

        Author[] authors = new Author[numAuthors];

        for (int i = 0; i < authors.length; i++) {
            authors[i] = authorReader.read();
        }

        return new Book(
                isbn,
                title,
                year,
                authors
        );
    }
}
