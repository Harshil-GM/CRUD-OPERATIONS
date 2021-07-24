package com.rmg.crudtest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetProject_Bdd {
	
	@Test
	public void getProjects() {
		
		when()
		
		.get("http://localhost:8084/projects")
		.then()
		.log().all()
		.and()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON);
		
		
		
		
	}

}
