package WebLibrary.com.service;

import WebLibrary.com.service.dto.CustomerDto;

import java.util.Collection;

public interface CustomerService {
    void  add(CustomerDto customerDto);
    void deleteById(long customerNumber);
    void updateById(long customerNumber,CustomerDto customerDto);
    CustomerDto getCustomerById (long customerNumber);
    Collection<CustomerDto> getCustomers();

}