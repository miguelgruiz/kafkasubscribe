package cmc.example.demo.kafka.subscribe.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TextStreams {
	
	String INPUT = "text-in";
	
	@Output(INPUT)
    MessageChannel inboundText();

}
