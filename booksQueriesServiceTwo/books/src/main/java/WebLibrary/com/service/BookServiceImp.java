package WebLibrary.com.service;

import WebLibrary.com.domain.Book;
import WebLibrary.com.kafka.BookAdapter;
import WebLibrary.com.repo.BooksRepo;
import WebLibrary.com.kafka.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    BooksRepo booksRepo;
    @Override
    public Collection<BookDto> getAllBooks() {
   List<Book>books=booksRepo.findAll();
        return BookAdapter.getFromBooksToBooksDto(books);
    }

    @Override
    public BookDto getBookById(String isbn) {
        Book book=booksRepo.findById(isbn).get();
        if (book==null){
            System.out.println("Book is not found");
        }
         return BookAdapter.getBookFromBookDto(book);
    }
}
