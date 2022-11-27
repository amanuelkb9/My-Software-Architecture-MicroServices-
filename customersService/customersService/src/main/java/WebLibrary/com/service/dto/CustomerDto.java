package WebLibrary.com.service.dto;

import WebLibrary.com.domain.Address;
import WebLibrary.com.domain.Contact;
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
