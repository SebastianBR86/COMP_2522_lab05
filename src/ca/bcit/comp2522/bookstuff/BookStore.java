package ca.bcit.comp2522.bookstuff;

import java.util.List;

/**
 *
 * @author Sebastian Roby
 * @author Ziad
 *
 * @version 1.0
 */
public class BookStore
{
    private final String    name;

    private final List<Book> books;


    public BookStore(final String name, List<Book> books)
    {
        this.name = name;
        this.books = books;
    }
    public static void main(final String[] args)
    {
        final BookStore b1;
//        final ArrayList<Book> books;
//
//        books = new ArrayList<Book>();
//        b1 = new BookStore("Goot", books);

    }
    private static void validateName(String name)
    {
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Invalid Name");
        }
    }
}
