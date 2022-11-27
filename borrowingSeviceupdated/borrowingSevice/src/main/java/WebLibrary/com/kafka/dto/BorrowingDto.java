package WebLibrary.com.kafka.dto;


import WebLibrary.com.domain.Book;
import WebLibrary.com.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowingDto {
    private Integer borrowingNumber;
    private String localDate;
    private Customer customer;
    private Book book;
}
