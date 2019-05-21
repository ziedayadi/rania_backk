package com.auth.entitie;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

public class UserResponse {
	
	private String username ;
	private String token ;
	
	 @ElementCollection(fetch = FetchType.EAGER)
	  List<Role> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserResponse(String username, List<Role> roles,String token) {
		super();
		this.username = username;
		this.roles = roles;
		this.token=token ;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	 
	 

}
