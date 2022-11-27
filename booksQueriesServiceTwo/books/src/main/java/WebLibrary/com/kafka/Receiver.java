package WebLibrary.com.kafka;


import WebLibrary.com.domain.Book;
import WebLibrary.com.domain.Review;
import WebLibrary.com.repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Receiver {

    @Autowired
    BooksRepo booksRepo;

    @KafkaListener(topics={"updateBook"})
    public void messageReceived(@Payload BookDto bookDto ) {
        Book book=booksRepo.findById(bookDto.getIsbn()).orElse(null);
        book.setAuthor(bookDto.getAuthor());
        book.setTittle(bookDto.getTittle());
        book.setReview(bookDto.getReview());
        booksRepo.save(book);

    }
    @KafkaListener(topics={"updateBook"})
    public void reviewMessageReceived(@Payload ReviewDTO reviewDTO ) {
        Book book = booksRepo.findById(reviewDTO.getBook().getIsbn()).orElse(null);
        Review review = new Review(reviewDTO.getReviewRating(), reviewDTO.getDescription());
       book.getReview().add(review);
       booksRepo.save(book);

    }

}
