package bci.appRest.UserManagerService.dto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;

import bci.appRest.UserManagerService.Entity.Phone;

public class createUserAcountDTO {
	private Long id;

	private String nameUser;

	private String password;

	private LocalDateTime created;

	private LocalDateTime modified;

	private LocalDateTime lastLogin;

	private Boolean isActive;

	private String email;

	private Set<Phone> phones = new HashSet<>();

	HttpStatus statusResponse;

	private String mensajeError;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getModified() {
		return modified;
	}

	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public HttpStatus getStatusResponse() {
		return statusResponse;
	}

	public void setStatusResponse(HttpStatus statusResponse) {
		this.statusResponse = statusResponse;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public createUserAcountDTO() {
		super();
	}

	public createUserAcountDTO(Long id, String nameUser, String password, LocalDateTime created, LocalDateTime modified,
			LocalDateTime lastLogin, Boolean isActive, String email, Set<Phone> phones, HttpStatus statusResponse,
			String mensajeError) {
		super();
		this.id = id;
		this.nameUser = nameUser;
		this.password = password;
		this.created = created;
		this.modified = modified;
		this.lastLogin = lastLogin;
		this.isActive = isActive;
		this.email = email;
		this.phones = phones;
		this.statusResponse = statusResponse;
		this.mensajeError = mensajeError;
	}

	
	public createUserAcountDTO(HttpStatus statusResponse,
			String mensajeError) {
		this.statusResponse = statusResponse;
		this.mensajeError = mensajeError;
	}
}
