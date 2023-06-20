import com.codeclan.homework.Book;
import com.codeclan.homework.Library;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;


    @Before
    public void before(){

        book = new Book("1984", "George Orwell", "Dystopian");
//        com.codeclan.homework.Book book2 = new com.codeclan.homework.Book("The Old Man And The Sea", "Ernest Hemingway", "Fiction");
//        com.codeclan.homework.Book book3 = new com.codeclan.homework.Book("To Kill A Mockingbird", "Harper Lee", "Classic");
//        com.codeclan.homework.Book book4 = new com.codeclan.homework.Book("The Exorcist", "William Blatty", "Horror");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Dystopian", book.getGenre());
    }
}

