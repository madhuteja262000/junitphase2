package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {
	static JavaOperations obj;
	@BeforeAll
	public void init()
	{
		System.out.println("Start the Db");
		obj = new JavaOperations();
		System.out.println("Initalization done..");
	}
	@AfterAll
	public void teardown()
	{
		System.out.println("Start the Db");
	}
	@Test
	public void method1()
	{
		System.out.println("Executing method 1 of code class");
		
	}
	@Test
	public void method2()
	{
		System.out.println("Executing method 2 of code class");
		
	}
	

}
