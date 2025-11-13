package org.ies.tierno.objects.library;

import org.ies.tierno.objects.library.model.Library;
import org.ies.tierno.objects.library.readers.AuthorReader;
import org.ies.tierno.objects.library.readers.BookReader;
import org.ies.tierno.objects.library.readers.LibraryReader;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var authorReader = new AuthorReader(scanner);
        var bookReader = new BookReader(scanner, authorReader);
        var libraryReader = new LibraryReader(scanner, bookReader);

        Library library = libraryReader.read();

        if (library.hasBook(1001)) {
            var book = library.findBook(1001);
            System.out.println(book);
        } else {
            System.out.println("No se ha encontrado el libro 1001");
        }

        if (library.hasAuthor("001X")) {
            int authorBooks = library.countBooks("001X");
            System.out.println("El autor 001X tiene " + authorBooks + " libros");
        } else {
            System.out.println("No se ha encontrado al autor");
        }
    }
}
