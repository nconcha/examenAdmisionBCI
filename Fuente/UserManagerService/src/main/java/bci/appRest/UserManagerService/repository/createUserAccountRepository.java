package bci.appRest.UserManagerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bci.appRest.UserManagerService.Entity.Users;



public interface createUserAccountRepository extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
	

}
