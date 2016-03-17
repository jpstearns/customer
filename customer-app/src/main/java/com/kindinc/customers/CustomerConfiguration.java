package com.kindinc.customers;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;

public class CustomerConfiguration extends Configuration{
	@JsonProperty
	@NotEmpty
	private String message;
	
	@JsonProperty
	@Max(10)
	private int messageRepetitions;

	@JsonProperty
	private String additionalMessage = "This is an optional message";

	public String getMessage(){
		return message;
	}
	
	public int getMessageRepetitions(){
		return messageRepetitions;
	}

	public String getAdditionalMessage(){
		return additionalMessage;
	}
}
