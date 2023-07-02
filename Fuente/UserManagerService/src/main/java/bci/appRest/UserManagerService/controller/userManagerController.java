package bci.appRest.UserManagerService.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bci.appRest.UserManagerService.Entity.responseOk;
import bci.appRest.UserManagerService.dto.createUserAcountDTO;
import bci.appRest.UserManagerService.repository.createUserAccountRepository;
import bci.appRest.UserManagerService.service.createUserAccount;

@RestController
@RequestMapping("/api/createUser")
@Validated

public class userManagerController {
	@Value("${validatePass}")
	String PASSWORD_PATTERN;
	@Autowired
	private createUserAccount userManagerService;
	@Autowired
	private createUserAccountRepository accountRepository;

	@PostMapping
	public ResponseEntity<?> createNewUser(@Valid @RequestBody createUserAcountDTO newUser) {

		if (accountRepository.findByEmail(newUser.getEmail()) != null) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"mensaje\": \"El correo se encuentraRegistrado\"}");
		} else

		if ((validatePassword(newUser.getPassword())) == true) {
			
			responseOk responseOk = new responseOk();
			responseOk.setCodigoStatus(HttpStatus.CREATED.toString());
			responseOk.setIdUsuario(newUser.getId());
			responseOk.setNameUser(newUser.getNameUser());
			responseOk.setCreated(newUser.getCreated());
			responseOk.setModified(newUser.getModified());
			responseOk.setLastLogin(newUser.getLastLogin());
			responseOk.setIsactive(newUser.getIsActive());
			return  ResponseEntity.status(HttpStatus.CREATED).body(responseOk);
			//return new ResponseEntity<>(userManagerService.createUserAcount(newUser), HttpStatus.CREATED);
		} else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"mensaje\": \"La contraseña no cumple los requisitos\"}");

	}

	public Boolean validatePassword(String patt) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		pattern.matcher(patt).matches();
		return pattern.matcher(patt).matches();

	}
}
