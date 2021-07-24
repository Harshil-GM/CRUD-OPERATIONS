package com.rmg.crudtest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProject {

	@Test
	public void getProjects() {
		
       Response resp = RestAssured.get("http://localhost:8084/projects");
     ValidatableResponse resval = resp.then();
     
     resval.assertThat().contentType(ContentType.JSON);
    //esval.assertThat().statusCode(201);
     
     
     
     resval.log().all();
//     resval.assertThat().contentType(ContentType.JSON);
//     resval.assertThat().statusCode(201);
	}
}
