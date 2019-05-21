package com.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/*tester web service*/

@WebAppConfiguration
@RunWith(SpringRunner.class)
public abstract class TestParcRestController{
	
	@Autowired
	WebApplicationContext webApplicationContext;
	
	protected MockMvc mvc;
	
	public TestParcRestController() {
		super();
	}
	
	@Before
	public final void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		MockitoAnnotations.initMocks(this);

	}
	
	//tester GEt
	public abstract void getAllEntityList();
	
	//tester POSt
	public abstract void createEntity();
	
	//tester PUT
	public abstract void updateEntity();
	
	//tester DELETE
	public abstract void deleteEntity();

}
