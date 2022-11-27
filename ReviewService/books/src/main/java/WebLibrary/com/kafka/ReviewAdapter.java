package WebLibrary.com.kafka;

import WebLibrary.com.domain.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReviewAdapter {
    public static Review gerReviewFromReviewDto(ReviewDto reviewDto){
       return new Review(reviewDto.getReviewId(), reviewDto.getReviewRating(),
               reviewDto.getDescription(), reviewDto.getCustomerName(), reviewDto.getBook());
    }
    public static ReviewDto gerReviewDtoFromReviewDto(Review review){
        return new ReviewDto(review.getReviewId(), review.getReviewRating(), review.getDescription(), review.getCustomerName(), review.getBook());
    }
    public static Collection<ReviewDto> getFromBooksToBooksDto(List<Review> reviews){
        List<ReviewDto > reviewDtoList=new ArrayList<>();
        for (Review review:reviews) {
           reviewDtoList.add(gerReviewDtoFromReviewDto(review));
        }
        return reviewDtoList;/// to be done--------------------
    }
}
