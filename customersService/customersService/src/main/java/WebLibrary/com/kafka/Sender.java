package WebLibrary.com.kafka;

import WebLibrary.com.service.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {
    @Autowired
    KafkaTemplate<String, CustomerDto> kafkaTemplate;
    @Value("update")
    String topic;

    public void send(CustomerDto customerDto){
        kafkaTemplate.send(topic, customerDto);
    }
}
