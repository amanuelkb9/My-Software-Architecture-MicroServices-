package WebLibrary.com.service;

import WebLibrary.com.kafka.BookDto;


public interface BookService {
    public void addBook(BookDto booksDto);
    public void updateBook(BookDto booksDto, String isbn);
    public void deleteById(String isbn);

}
