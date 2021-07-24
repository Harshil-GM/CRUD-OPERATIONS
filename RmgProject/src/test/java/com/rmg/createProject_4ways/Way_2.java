package com.rmg.createProject_4ways;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Way_2 {
	
	@Test
	public void hashmap() {
		
		HashMap map=new HashMap();
		
		map.put("createdBy", "dinku");
		map.put("createdOn", "19/07/2021");
		map.put( "projectName", "playgroup2");
		map.put( "status", "created");
		
		RequestSpecification req = RestAssured.given();
		
		req.contentType(ContentType.JSON);
		
		req.body(map);
		
		Response resp = req.post("http://localhost:8084/addProject");
		
		ValidatableResponse vresp = resp.then();
		
		vresp.assertThat().statusCode(201);
		
		vresp.log().all();
	}

}
