package cmc.example.demo.kafka.subscribe.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
@Builder
public class Text {

	private long timestamp;
    private String message;
    
}
