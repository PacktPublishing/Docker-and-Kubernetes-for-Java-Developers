package pl.finsys.example.controller;

import pl.finsys.example.domain.Book;
import pl.finsys.example.service.BookService;
import pl.finsys.example.util.UserUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookControllerTest {

    @Mock
    private BookService bookService;

    private BookController bookController;

    @Before
    public void setUp() throws Exception {
        bookController = new BookController(bookService);
    }

    @Test
    public void shouldCreateUser() throws Exception {
        final Book savedBook = stubServiceToReturnStoredBook();
        final Book book = UserUtil.createBook();
        Book returnedBook = bookController.saveBook(book);
        // verify book was passed to BookService
        verify(bookService, times(1)).saveBook(book);
        assertEquals("Returned book should come from the service", savedBook, returnedBook);
    }

    private Book stubServiceToReturnStoredBook() {
        final Book book = UserUtil.createBook();
        when(bookService.saveBook(any(Book.class))).thenReturn(book);
        return book;
    }


    @Test
    public void shouldListAllUsers() throws Exception {
        stubServiceToReturnExistingUsers(10);
        Collection<Book> books = bookController.listBooks();
        assertNotNull(books);
        assertEquals(10, books.size());
        // verify user was passed to BookService
        verify(bookService, times(1)).getList();
    }

    private void stubServiceToReturnExistingUsers(int howMany) {
        when(bookService.getList()).thenReturn(UserUtil.createBookList(howMany));
    }

}
