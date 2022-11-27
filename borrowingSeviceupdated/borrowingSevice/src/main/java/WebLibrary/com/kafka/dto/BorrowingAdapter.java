package WebLibrary.com.kafka.dto;
;
import WebLibrary.com.domain.Borrowing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BorrowingAdapter {
    public static Borrowing getBookFromBookDto(BorrowingDto borrowingDto){
        return new Borrowing(borrowingDto.getBorrowingNumber(), borrowingDto.getLocalDate(), borrowingDto.getCustomer(),borrowingDto.getBook());
    }
    public static BorrowingDto getBookFromBookDto(Borrowing borrowing){
        return new BorrowingDto(borrowing.getBorrowingNumber(), borrowing.getLocalDate(), borrowing.getCustomer(),borrowing.getBook());
    }
    public static Collection<BorrowingDto> getFromBooksToBooksDto(List<Borrowing> borrowingList){
        List<BorrowingDto> booksDtos=new ArrayList<>();
        for (Borrowing b:borrowingList) {
            booksDtos.add(getBookFromBookDto(b));
        }
        return booksDtos;
    }
}
