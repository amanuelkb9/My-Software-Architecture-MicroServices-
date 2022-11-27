package WebLibrary.com.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BorrowingListDto {
    private Collection<BorrowingDto> borrowingDtos =new ArrayList();
}
