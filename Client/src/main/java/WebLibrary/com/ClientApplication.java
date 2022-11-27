package WebLibrary.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {
	@Autowired
	RestOperations restTemplate;
	@Value("{}")
	String apiGateway;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//1-->Add customers

		Address address1 = new Address("5st. 89Ave","Toronto","J8Y4B");
		Address address2 = new Address("12st. 2Ave","Kitchener","N2M5E7");
		Contact contact1 = new Contact("6104545678","milkias@gmail.com");
		Contact contact2 = new Contact("8935456679","heri@gmail.com");

		CustomerDto customerDTO1 = new CustomerDto(12345, "Milkias",address1, contact1);
		CustomerDto customerDTO2 = new CustomerDto(12346, "Heri",address2, contact2);

		restTemplate.postForLocation(apiGateway+"/customers", customerDTO1);
		restTemplate.postForLocation(apiGateway+"/customers", customerDTO2);

		// print customers
		System.out.println(restTemplate.getForEntity(apiGateway+"/customers/12345",Customer.class));
		System.out.println(restTemplate.getForEntity(apiGateway+"/customers12346",Customer.class));


		//2-->Add two books to command service

		Book book1=new Book("111","Software Architecture","professor Rene ");
		Book book2=new Book("112","Software Engineering","professor Kalu ");

		restTemplate.postForLocation(apiGateway+"/bookcommand",book1);
		restTemplate.postForLocation(apiGateway+"/bookcommand",book2);

		// print books
		System.out.println(restTemplate.getForObject(apiGateway+"/111",Book.class));
		System.out.println(restTemplate.getForObject(apiGateway+"/112",Book.class));





	}
	public RestOperations getRestTemplate(){
		return new RestTemplate();
	}
}
