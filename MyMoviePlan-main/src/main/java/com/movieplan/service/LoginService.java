package com.movieplan.service;

import org.apache.kafka.common.security.auth.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.base.Optional;

@Service
public class LoginService {
//	@Autowired
//	com.movieplan.repository.LoginRepository loginRepository;
//	public String signIn(Login login) {
//		Optional<Login> result = loginRepository.findById(login.getEmailid());
//		if(result.isPresent()) {
//					Login ll = result.get();
//					if(ll.getPassword().equals(login.getPassword())) {		
//						
//				if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("admin")) {
//							return "Admin sucessfully login";
//				}else if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("user")){
//							return "User successfully login";
//						}else {
//							return "Invalid details";
//						}					
//					}else {
//						return "InValid password";
//					}
//		}else {
//			return "InValid emailId";
//		}		
//	}
//	public String signUp(Login login) {
//		Optional<Login> result = loginRepository.findById(login.getEmailid());
//		if(result.isPresent()) {
//					return "Email Id alreay exists";
//		}else {
//			if(login.getTypeOfUser().equals("admin")) {
//				return "You can't create admin account";
//			}else {
//				loginRepository.save(login);
//				return "Account created successfully";
//			}
//			
//		}	
//	}
}
