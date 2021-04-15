package com.xworkz.web.service;

import org.springframework.stereotype.Component;

import com.xworkz.web.components.Register;
import com.xworkz.web.dto.RegisterDTO;

@Component
public class RegisterServiceImpl implements RegisterService{
	private Register register;

	public RegisterServiceImpl(Register register) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.register=register;
		System.out.println(this.register);
	}

	@Override
	public boolean validation(RegisterDTO registerdto) {
		
		System.out.println("invoked validateAndSave");
		System.out.println("RegisterDTO "+registerdto);
		boolean valid = false;

		if(registerdto !=null) {
			String username = registerdto.getUsername();

			if(username !=null && !username.isEmpty() && username.length()<12 && username.length()>3) {
				System.out.println("username is valid");
				valid=true;
			} else {
				System.out.println("username is invalid");
				valid=false;
			}

			if(valid) {
				String email= registerdto.getEmail();

				if(email!=null) {
					System.out.println("email is valid");
					valid=true;
				} else {
					System.out.println("email is invalid");
					valid=false;
				}
				
				if(valid) {
					String password = registerdto.getPassword();

					if(!password.isEmpty() && password!=null && password.length()==5 ) {
						System.out.println("password is valid");
						valid=true;
					} else {
						System.out.println("password is invalid");
						valid=false;
					}
					
					if(valid) {
						String cpassword = registerdto.getCpassword();

						if(!cpassword.isEmpty() && cpassword==password ) {
							System.out.println("cpassword is valid");
							valid=true;
						} else {
							System.out.println("cpassword is invalid");
							valid=false;
						}	
				
										
						if(valid) {
							System.out.println("Registeration can be done");
							register.saveRegister(registerdto);
						} else {
							System.out.println("Registeration cannot be done");
						}


					}

				}
			}			

		}
		return valid;
	}}