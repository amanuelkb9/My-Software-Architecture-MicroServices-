package WebLibrary.com.kafka;

import WebLibrary.com.domain.Borrowing;
import WebLibrary.com.repo.BorrowingRepo;
import WebLibrary.com.kafka.dto.BookDto;
import WebLibrary.com.kafka.dto.CustomerDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Receiver {
    @Autowired
    BorrowingRepo borrowingRepo;
    @KafkaListener(topics={"update"})
    public void messageReceived(@Payload CustomerDto customerDto ){
        System.out.println("Recieved .. "+ customerDto);
        List<Borrowing> borrowedCustomers=borrowingRepo.findCustomersByCustomerNumber(customerDto.getCustomerNumber());
        for (Borrowing borrowing:borrowedCustomers){
            //borrowing.getCustomer().setCustomerNumber(customerDto.getCustomerNumber());
            borrowing.getCustomer().setName(customerDto.getName());
            borrowingRepo.save(borrowing);
        }
    }
//    @KafkaListener(topics={"updateBook"})
//   public void messageReceivedFromBook(@Payload String asString){
//        BookDto bookDto = new BookDto();
//        try{
//            ObjectMapper objectMapper = new ObjectMapper();
//              bookDto = objectMapper.readValue(asString, BookDto.class);
//
//        } catch (JsonMappingException e) {
//            throw new RuntimeException(e);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//        List<Borrowing>borrowingList=borrowingRepo.findBorrowingForBooks(bookDto.getIsbn());
//        for (Borrowing borrow:borrowingList) {
//            borrow.getBook().setIsbn(bookDto.getIsbn());
//            borrow.getBook().setTittle(bookDto.getTittle());
//            borrowingRepo.save(borrow);
//        }

//
//    }
}
