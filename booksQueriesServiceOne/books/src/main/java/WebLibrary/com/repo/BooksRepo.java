package WebLibrary.com.repo;

import WebLibrary.com.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends MongoRepository<Book,String> {

}
