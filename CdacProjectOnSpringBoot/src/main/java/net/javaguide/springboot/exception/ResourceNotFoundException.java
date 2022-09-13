package net.javaguide.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionID=1L;
	private String resourceName;
	private String feildName;
	private Object fieldValue;
	
	public ResourceNotFoundException(String resourceName, String feildName,Object fieldValue) {
		super(String.format("%s not found with %s :'%s'",resourceName,feildName,fieldValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.fieldValue = fieldValue;
		
	}

	public String getResourceName() {
		return resourceName;
	}

	

	public String getFeildName() {
		return feildName;
	}

	

	public Object getFieldValue() {
		return fieldValue;
	}

	
	
	
	
	

}
