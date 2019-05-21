package com.test;

public abstract class TestParcRepository extends TestParc {
	
	//tester save
		public abstract void givenEntityRepository_whenSaving();
		
		//tester update
		public abstract void givenEntityRepository_whenUpdating();
		
		//tester delete
		public abstract void givenEntityRepository_whenDeleting();
		
		//tester getall
		public abstract void givenEntityRepository_whenRetrievingAll();
		
		//tester oneByid
		public abstract void givenEntityRepository_whenRetrievingOneById();

}
