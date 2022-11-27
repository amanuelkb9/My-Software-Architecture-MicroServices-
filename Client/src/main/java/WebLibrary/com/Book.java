package WebLibrary.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String isbn;
    private  String tittle;
    private String author;

}
