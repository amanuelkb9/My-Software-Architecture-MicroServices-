package WebLibrary.com.repo;


import WebLibrary.com.domain.Borrowing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowingRepo extends MongoRepository<Borrowing,Integer> {
@Query("{'customer.customerNumber'::#{#customerNumber}}")
    List<Borrowing> findCustomersByCustomerNumber(@Param("customerNumber") long customerNumber);
@Query("{'book.isbn'::#{#isbn}}")
    List<Borrowing> findBorrowingForBooks(@Param("isbn") String isbn);
}
