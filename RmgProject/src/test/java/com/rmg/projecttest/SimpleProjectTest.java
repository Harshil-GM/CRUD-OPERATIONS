package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class SimpleProjectTest {
	
	@Test
	public void getAllProjects() {
		
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		//System.out.println(resp);//resturns address of the object
		
		//System.out.println(resp.asString());//to display the content available in the object
		//resp.prettyPrint(); // to print data in formate
		
		resp.then().log().all();
	}
}
