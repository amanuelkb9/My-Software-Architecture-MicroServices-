package WebLibrary.com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Review {
    @Id
    private Integer reviewId;
    private int reviewRating;
    private String description;
    private Customer customerName;
    private Book book;

}
