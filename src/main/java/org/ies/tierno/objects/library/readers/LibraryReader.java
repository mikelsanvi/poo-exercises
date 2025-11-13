package org.ies.tierno.objects.library.readers;

import org.ies.tierno.objects.library.model.Book;
import org.ies.tierno.objects.library.model.Library;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Library read() {
        System.out.println("Introduce los datos de la biblioteca");
        System.out.println("Nombre:");
        String name = scanner.nextLine();

        int numBooks;
        do {
            System.out.println("¿Cuántos libros tiene?");
            numBooks = scanner.nextInt();
            scanner.nextLine();
        } while (numBooks < 1);

        Book[] books = new Book[numBooks];

        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();

        }

        return new Library(
                name,
                books
        );
    }
}
