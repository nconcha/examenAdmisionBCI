package bci.appRest.UserManagerService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class resourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String resource;
	private String name;
	private long value;

	public resourceNotFoundException(String resource, String name, long value) {
		super(String.format("% No encontrado con: % :  '%s'", resource, name, value));
		this.resource = resource;
		this.name = name;
		this.value = value;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

}
