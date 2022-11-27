package WebLibrary.com;

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
    private String customerName;
    private String bookIsbn;
}
