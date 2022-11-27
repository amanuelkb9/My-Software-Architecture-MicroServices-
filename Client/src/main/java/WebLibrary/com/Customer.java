package WebLibrary.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    private long customerNumber;
    private String name;
    private Address address;
    private Contact contact;
}
