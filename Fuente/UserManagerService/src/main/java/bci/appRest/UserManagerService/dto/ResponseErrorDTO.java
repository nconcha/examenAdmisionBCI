package bci.appRest.UserManagerService.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ResponseErrorDTO {

	HttpStatus statusResponse;

	private String mensajeError;
	
	int code;
	
	
	public HttpStatus getStatusResponse() {
		return statusResponse;
	}


	public void setStatusResponse(HttpStatus statusResponse) {
		this.statusResponse = statusResponse;
	}


	public String getMensajeError() {
		return mensajeError;
	}


	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	



	public ResponseErrorDTO(HttpStatus statusResponse, String mensajeError, int code) {
		super();
		this.statusResponse = statusResponse;
		this.mensajeError = mensajeError;
		this.code = code;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public ResponseErrorDTO() {
		super();
	}
	
	
	

}
