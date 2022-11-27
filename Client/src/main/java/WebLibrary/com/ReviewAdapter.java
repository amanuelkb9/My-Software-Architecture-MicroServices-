package WebLibrary.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReviewAdapter {
    public static Review gerReviewFromReviewDto(ReviewDto reviewDto){
       return new Review(reviewDto.getReviewId(), reviewDto.getReviewRating(), reviewDto.getDescription(), reviewDto.getCustomerName(), reviewDto.getBookIsbn());
    }
    public static ReviewDto gerReviewDtoFromReviewDto(Review review){
        return new ReviewDto(review.getReviewId(), review.getReviewRating(), review.getDescription(), review.getCustomerName(), review.getBookIsbn());
    }
    public static Collection<ReviewDto> getFromBooksToBooksDto(List<Review> reviews){
        List<ReviewDto > reviewDtoList=new ArrayList<>();
        for (Review review:reviews) {
           reviewDtoList.add(gerReviewDtoFromReviewDto(review));
        }
        return reviewDtoList;/// to be done--------------------
    }
}
