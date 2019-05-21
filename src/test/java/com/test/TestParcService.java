package com.test;

import org.junit.Before;
import org.mockito.MockitoAnnotations;


/*tester service*/
public abstract class TestParcService {
	
	@Before
	  public final void setUp() {
	    MockitoAnnotations.initMocks(this);
	  }
	
	//tester l'operation save 
	public abstract void givenEntityService_whenSaving();
	
	//tester l'operation update
	public abstract void givenEntityService_whenUpdating();
	
	//tester l'operation delete
	public abstract void givenEntityService_whenDeleting();
	
	//tester getall
	public abstract void givenEntityService_whenRetrievingAll();
	
	//tester oneByid
	public abstract void givenEntityService_whenRetrievingOneById();

}
