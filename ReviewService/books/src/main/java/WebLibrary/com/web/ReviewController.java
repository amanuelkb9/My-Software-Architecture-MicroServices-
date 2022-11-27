package WebLibrary.com.web;

import WebLibrary.com.kafka.ReviewDto;
import WebLibrary.com.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;
    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody ReviewDto reviewDto){
        reviewService.addBReviewToBook(reviewDto);
        return new ResponseEntity<>(reviewDto, HttpStatus.OK);
    }
    
}
