package br.com.mvc.voxy.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Simple dto to provide a bean validation on screen 
public class RequestTextDTO {

	@NotBlank
	private String text;
	
	private Integer wordCount = 0;

}
