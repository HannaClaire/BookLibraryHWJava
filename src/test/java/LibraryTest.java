import com.codeclan.homework.Book;
import com.codeclan.homework.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;

//    private com.codeclan.homework.Book book;

    @Before
    public void before(){
        Book book1 = new Book("1984", "George Orwell", "Dystopian");
        Book book2 = new Book("The Old Man And The Sea", "Ernest Hemingway", "Fiction");
        Book book3 = new Book("To Kill A Mockingbird", "Harper Lee", "Classic");
        Book book4 = new Book("The Exorcist", "William Blatty", "Horror");
        ArrayList<Book> bookLibrary = new ArrayList<>();
        bookLibrary.add(book1);
        bookLibrary.add(book2);
        bookLibrary.add(book3);
        bookLibrary.add(book4);
        library = new Library(bookLibrary);
    }

    @Test
    public void canCountBooks(){
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(new Book("Guide to not giving a flipflop", "Mark Manson", "Self-Help"));
        assertEquals(5, library.bookCount());
    }


    //not sure if test below accounts for if the max-capacity is exceeded, it seems to still add book despite being more than 5?
    @Test
    public void canCheckStockCount(){
        library.checkStockLevel();
//        library.addBook(new Book("Guide to not giving a flipflop", "Mark Manson", "Self-Help"));
        assertEquals(5, library.bookCount());
    }
}
