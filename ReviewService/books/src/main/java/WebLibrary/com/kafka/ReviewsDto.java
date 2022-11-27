package WebLibrary.com.kafka;

import WebLibrary.com.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewsDto {
    private Collection<Review> bookDtos =new ArrayList();
}
