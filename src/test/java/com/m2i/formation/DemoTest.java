package com.m2i.formation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.m2i.formation.entity.Employee;
import com.m2i.formation.presentation.Demo;

public class DemoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAjoutEmp() {
		Demo demo = new Demo();
		Employee employee = new Employee("FGRJFGD", "m2i", "MICHEL", "Smith", "mina@yahoo.fr", "PO");
		demo.AjoutEmp(employee);
	}

//	@Test
//	public void testRecupEmp() {
//		Demo demo = new Demo();
//		demo.RecupEmp(3);
//	}
}
