package com.rmg.createProject_4ways;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Way3 {

	@Test
	public void jsonObject() {
		
		File f=new File("./data.json");
		RequestSpecification req = RestAssured.given();
		
		req.contentType("application/json");
		
		req.body(f);
		
		Response resp = req.post("http://localhost:8084/addProject");
		
		ValidatableResponse vresp = resp.then();
		
		vresp.assertThat().statusCode(201);
		
		vresp.log().all();
	}

}
