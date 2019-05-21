package com.auth.entitie;

import org.springframework.security.core.GrantedAuthority;

public enum Role  implements GrantedAuthority{
	ROLE_ADMIN,ROLE_AGENT;

	public String getAuthority() {
	    return name();
	  }
	

}
