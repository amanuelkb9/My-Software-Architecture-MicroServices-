package WebLibrary.com.service;


import WebLibrary.com.domain.Borrowing;
import WebLibrary.com.kafka.dto.BorrowingAdapter;
import WebLibrary.com.kafka.dto.BorrowingDto;
import WebLibrary.com.repo.BorrowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BorrowingServiceImp implements BorrowingService {
    @Autowired
    BorrowingRepo borrowingRepo;

    @Override
    public Collection<BorrowingDto> getAllBorowingList() {
        List<Borrowing> borrowingCollection=borrowingRepo.findAll();
        return BorrowingAdapter.getFromBooksToBooksDto(borrowingCollection);
    }

    @Override
    public BorrowingDto getBorrowingById(Integer id) {
        Borrowing borrowing=borrowingRepo.findById(id).get();
        return BorrowingAdapter.getBookFromBookDto(borrowing);
    }

    @Override
    public void update(BorrowingDto borrowingDto, Integer id) {
        Borrowing borrowing=borrowingRepo.findById(id).get();
        borrowing.setBorrowingNumber(borrowingDto.getBorrowingNumber());
        borrowing.setLocalDate(borrowingDto.getLocalDate());
      borrowing.setCustomer(borrowingDto.getCustomer());
      borrowing.setBook(borrowingDto.getBook());
        borrowingRepo.save(borrowing);
    }

    @Override
    public void deleteById(Integer id) {
        borrowingRepo.deleteById(id);

    }

    @Override
    public void addBorrowing(BorrowingDto borrowingDto) {
        Borrowing borrowing=BorrowingAdapter.getBookFromBookDto(borrowingDto);
        borrowingRepo.save(borrowing);

    }


}
