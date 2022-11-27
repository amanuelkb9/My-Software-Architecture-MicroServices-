package WebLibrary.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private long customerNumber;
    private String name;
    private Address address;
    private Contact contact;
}
