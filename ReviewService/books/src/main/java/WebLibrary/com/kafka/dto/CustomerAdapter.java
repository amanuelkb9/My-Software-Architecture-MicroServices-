package WebLibrary.com.kafka.dto;

import WebLibrary.com.domain.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerAdapter {
    public static Customer getCustomerFromCustomerDto(CustomerDto customerDto){
        return new Customer(customerDto.getCustomerNumber(),
                customerDto.getName());
    }
    public static CustomerDto getCustomerDtoFromCustomer(Customer customer){
        return  new CustomerDto(customer.getCustomerNumber(),
                customer.getName() );
    }
    public static Collection<CustomerDto> getCustomerDtoListFromCustomerList(List<Customer> customers){
        List <CustomerDto> customerDtos=new ArrayList<>();
        for (Customer customer:customers){
            customerDtos.add(getCustomerDtoFromCustomer(customer));

        }
        return customerDtos;
    }
}
