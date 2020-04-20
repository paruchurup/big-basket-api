package com.yogaapp.api.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class UserDTO {
	private String name;
	private String username;
	private String email;
	private int mobile;
	private int age;
	private String password;
	private String confirmPassword;
	private String token;
	
	private List<RoleDTO> roles = new ArrayList<>();
	private List<AilmentDTO> ailments = new ArrayList<>();
	

}
