package WebLibrary.com.service;

import WebLibrary.com.kafka.BookDto;

import java.util.Collection;

public interface BookService {
    public Collection<BookDto> getAllBooks();
    public BookDto getBookById(String isbn);
}
