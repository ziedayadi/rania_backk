package com.auth;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auth.entitie.Role;
import com.auth.entitie.User;
import com.auth.service.UserService;


@SpringBootApplication
public class TestAuthApplication implements CommandLineRunner {
	
	@Autowired
	UserService userService;
	
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(TestAuthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User admin = new User();
//	    admin.setUsername("admin");
//	    admin.setPassword("admin");
//	    admin.setEmail("admin@email.com");
//	    admin.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_ADMIN)));
//
//	    userService.signup(admin);
//
//	    User client = new User();
//	    client.setUsername("client");
//	    client.setPassword("client");
//	    client.setEmail("client@email.com");
//	    client.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_AGENT)));
		
//		User agent = new User();
//	    agent.setUsername("agent1");
//	    agent.setPassword("agent1");
//	    agent.setEmail("agent1@email.com");
//	    agent.setRoles(new ArrayList<Role>(Arrays.asList(Role.ROLE_AGENT)));
//
//	    userService.signup(agent);
//
//	    userService.signup(client);
	//	System.out.println("listeDepense");
	//	depenseService.listeDepenses();
	  }
		
	}
	
