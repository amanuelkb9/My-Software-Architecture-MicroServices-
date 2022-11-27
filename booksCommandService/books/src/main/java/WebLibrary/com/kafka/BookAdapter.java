package WebLibrary.com.kafka;

import WebLibrary.com.domain.Book;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookAdapter {
    public static Book getBookFromBookDto(BookDto bookDto){
        return new Book(bookDto.getIsbn(), bookDto.getTittle(), bookDto.getAuthor());
    }
    public static BookDto getBookFromBookDto(Book book){
        return new BookDto(book.getIsbn(), book.getTittle(), book.getAuthor());
    }
    public static Collection<BookDto> getFromBooksToBooksDto(List<Book> books){
        List<BookDto > booksDtos=new ArrayList<>();
        for (Book b:books) {
            booksDtos.add(getBookFromBookDto(b));
        }
        return booksDtos;
    }
}
