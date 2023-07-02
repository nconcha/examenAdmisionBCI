package bci.appRest.UserManagerService.Entity;

import java.time.LocalDateTime;


public class responseOk {
	
	

	public String codigoStatus;
	public Long idUsuario;
	public String nameUser;
	public LocalDateTime created;
	public LocalDateTime modified;
	public LocalDateTime lastLogin;
	public Boolean isactive;
	
	
	
	
	public String getCodigoStatus() {
		return codigoStatus;
	}




	public void setCodigoStatus(String codigoStatus) {
		this.codigoStatus = codigoStatus;
	}




	public Long getIdUsuario() {
		return idUsuario;
	}




	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}




	public String getNameUser() {
		return nameUser;
	}




	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
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




	public Boolean getIsactive() {
		return isactive;
	}




	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}




	public responseOk() {
		super();
	}




	public responseOk(String codigoStatus, Long idUsuario, String nameUser, LocalDateTime created,
			LocalDateTime modified, LocalDateTime lastLogin, Boolean isactive) {
		super();
		this.codigoStatus = codigoStatus;
		this.idUsuario = idUsuario;
		this.nameUser = nameUser;
		this.created = created;
		this.modified = modified;
		this.lastLogin = lastLogin;
		this.isactive = isactive;
	}
	
	
	


}
