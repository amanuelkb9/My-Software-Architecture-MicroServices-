package WebLibrary.com.web;

import WebLibrary.com.service.BookService;
import WebLibrary.com.kafka.BookDto;
import WebLibrary.com.kafka.BooksDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/bookquery")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping()
    public ResponseEntity<?> getAllBooks(){
       Collection <BookDto> booksDto= bookService.getAllBooks();
       BooksDto booksDto1=new BooksDto(booksDto);
        return new ResponseEntity<>(booksDto1, HttpStatus.OK);
    }
    @GetMapping("/{isbn}")
    public ResponseEntity<?>  getBooksByIsbn(@PathVariable String isbn){
        return new ResponseEntity<>(bookService.getBookById(isbn),HttpStatus.OK);
    }
    
}
