package WebLibrary.com.kafka;

import WebLibrary.com.domain.Book;
import WebLibrary.com.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private Integer reviewId;
    private int reviewRating;
    private String description;
    private Customer customerName;
    private Book book;
}
