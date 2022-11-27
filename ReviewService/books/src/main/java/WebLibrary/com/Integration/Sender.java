package WebLibrary.com.Integration;


import WebLibrary.com.kafka.ReviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {
    @Autowired
    KafkaTemplate<String, ReviewDto> kafkaTemplate;
    @Value("addReview")
    String topic;

    public void send(ReviewDto reviewDto){
        kafkaTemplate.send(topic, reviewDto);
    }
}
