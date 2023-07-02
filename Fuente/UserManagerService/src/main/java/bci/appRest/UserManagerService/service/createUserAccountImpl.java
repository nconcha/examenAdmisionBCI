package bci.appRest.UserManagerService.service;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import bci.appRest.UserManagerService.Entity.Users;
import bci.appRest.UserManagerService.dto.createUserAcountDTO;
import bci.appRest.UserManagerService.repository.createUserAccountRepository;

@Service
public class createUserAccountImpl implements createUserAccount {

	@Autowired
	private createUserAccountRepository accountRepository;

	@Override
	public createUserAcountDTO createUserAcount(createUserAcountDTO createUserAcountDTO) {
		// dto entities
		Users users = new Users();
		LocalDateTime now = LocalDateTime.now();

		users.setId(createUserAcountDTO.getId());
		System.out.println(createUserAcountDTO.getId());
		users.setNameUser(createUserAcountDTO.getNameUser());
		users.setPassword(createUserAcountDTO.getPassword());
		users.setEmail(createUserAcountDTO.getEmail());
		users.setCreated(now);
		users.setModified(now);
		users.setLastLogin(now);
		users.setIsActive(true);
		users.setPhones(createUserAcountDTO.getPhones());

		Users newUser = accountRepository.save(users);

		// wntitiwa to dto
		createUserAcountDTO createUSerAccountResponse = new createUserAcountDTO();
		createUSerAccountResponse.setId(newUser.getId());
		createUSerAccountResponse.setNameUser(newUser.getNameUser());
		createUSerAccountResponse.setPassword(newUser.getPassword());
		createUSerAccountResponse.setEmail(newUser.getEmail());
		createUSerAccountResponse.setCreated(newUser.getCreated());
		createUSerAccountResponse.setModified(newUser.getModified());
		createUSerAccountResponse.setLastLogin(newUser.getLastLogin());
		createUSerAccountResponse.setIsActive(newUser.getIsActive());
		createUSerAccountResponse.setPhones(newUser.getPhones());
		createUSerAccountResponse.setStatusResponse(HttpStatus.CREATED);
		createUSerAccountResponse.setMensajeError(HttpStatus.CREATED.toString());
		return createUSerAccountResponse;

	}

}
