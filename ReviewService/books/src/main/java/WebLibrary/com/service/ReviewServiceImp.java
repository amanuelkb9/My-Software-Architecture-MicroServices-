package WebLibrary.com.service;

import WebLibrary.com.Integration.Sender;
import WebLibrary.com.domain.Review;
import WebLibrary.com.kafka.ReviewAdapter;
import WebLibrary.com.kafka.ReviewDto;
import WebLibrary.com.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImp implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;
    @Autowired
    Sender sender;
    @Override
    public void addBReviewToBook(ReviewDto reviewDto) {
        Review review= ReviewAdapter.gerReviewFromReviewDto(reviewDto);
        reviewRepo.save(review);
        System.out.println("Sending ReviewDTO");
        sender.send(reviewDto);

    }
}
