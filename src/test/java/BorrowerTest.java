import com.codeclan.homework.Book;
import com.codeclan.homework.Borrower;
import com.codeclan.homework.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;


    @Before
    public void before(){
        borrower = new Borrower("Steve");
//        book = new Book();
        ArrayList<Book> booksToGoIntoCollection = new ArrayList<>();
        booksToGoIntoCollection.add(book);
        booksToGoIntoCollection.add(book);
        booksToGoIntoCollection.add(book);
        booksToGoIntoCollection.add(book);
        library = new Library(booksToGoIntoCollection);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Steve", borrower.getName());
    }
    @Test
    public void steveCanTakeBookFromLibrary(){
        borrower.takeBookFromLib(library);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void steveCanBringBookBackToLib(){
        borrower.takeBookFromLib(library);
        borrower.replaceBook(borrower);
        assertEquals(0, borrower.collectionCount());
    }
}
