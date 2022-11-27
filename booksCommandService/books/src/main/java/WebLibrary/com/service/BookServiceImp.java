package WebLibrary.com.service;

import WebLibrary.com.domain.Book;
import WebLibrary.com.kafka.BookAdapter;
import WebLibrary.com.kafka.BookDto;
import WebLibrary.com.kafka.Sender;
import WebLibrary.com.repo.BooksRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    BooksRepo booksRepo;
@Autowired
    Sender sender;

    @Override
    public void addBook(BookDto booksDto) {
        Book book= BookAdapter.getBookFromBookDto(booksDto);
        booksRepo.save(book);
        sender.send(BookAdapter.getBookFromBookDto(book));
        System.out.println("Book sending");
    }

    @Override
    public void updateBook(BookDto booksDto, String isbn) {
        Book book=booksRepo.findById(isbn).get();
        if (book!=null){
            book.setIsbn(booksDto.getIsbn());
            book.setTittle(booksDto.getTittle());
            book.setAuthor(booksDto.getAuthor());
            sender.send(BookAdapter.getBookFromBookDto(book));
            System.out.println("book is sent......");

        }

    }

    @Override
    public void deleteById(String isbn) {
        Book book=booksRepo.findById(isbn).get();
        if (book==null){
            System.out.println("Books is not available "+isbn );
        }
        booksRepo.delete(book);
       sender.send(BookAdapter.getBookFromBookDto(book));
        System.out.println("Book sending");

    }
}
