package cmc.example.demo.kafka.subscribe.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import cmc.example.demo.kafka.subscribe.model.Text;
import cmc.example.demo.kafka.subscribe.stream.TextStreams;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TextListener {
	
	 @StreamListener(TextStreams.INPUT)
	    public void handleGreetings(@Payload Text text) {
	        log.info("Received greetings: {}", text);
	    }

}
