package bci.appRest.UserManagerService.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;

import bci.appRest.UserManagerService.dto.phonesDTO;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })

public class Users implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nameUser", length = 50, nullable = false)
	public String nameUser;

	@Column(name = "password", length = 50)
	private String password;

	@Column(name = "dateCreated")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime created;

	@Column(name = "dateModified")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime modified;

	@Column(name = "lastLogin")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lastLogin;

	@Column(name = "isActive")
	private Boolean isActive;

	@Column(name = "email", length = 70)
	@Email
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_phones")
	
private Set<Phone> phones = new HashSet<>();

	/* Getter and Setetrs */
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

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public Users(Long id, String nameUser, String password, LocalDateTime created, LocalDateTime modified,
			LocalDateTime lastLogin, Boolean isActive, @Email String email, Set<Phone> phones) {
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
	}

	public Users() {
		super();
	}

	

	


	

}
