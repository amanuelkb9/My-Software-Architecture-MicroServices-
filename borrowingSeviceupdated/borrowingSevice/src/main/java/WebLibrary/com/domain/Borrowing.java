package WebLibrary.com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrowing {
    @Id
    private Integer borrowingNumber;
    private String localDate;
   private Customer customer;
   private Book book;


}
