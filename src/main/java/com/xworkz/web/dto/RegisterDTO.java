package com.xworkz.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="registerdto")
public class RegisterDTO implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USERNAME")
	private String Username;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="CPASSWORD")
	private String cpassword;
}
