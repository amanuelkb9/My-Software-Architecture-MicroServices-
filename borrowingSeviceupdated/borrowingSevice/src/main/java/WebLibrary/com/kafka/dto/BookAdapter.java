package WebLibrary.com.kafka.dto;



import WebLibrary.com.domain.Book;

public class BookAdapter {
    public static Book getBookFromBookDto(BookDto bookDto){
        return new Book(bookDto.getIsbn(), bookDto.getTittle());
    }
    public static BookDto getBookFromBookDto(Book book){
        return new BookDto(book.getIsbn(), book.getTittle());
    }

}
