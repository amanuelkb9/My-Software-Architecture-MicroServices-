package WebLibrary.com.repo;

import WebLibrary.com.domain.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends MongoRepository<Review,Integer> {

}
