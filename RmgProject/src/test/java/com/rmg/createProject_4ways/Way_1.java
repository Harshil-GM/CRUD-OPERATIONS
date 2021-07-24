package com.rmg.createProject_4ways;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Way_1 {
	
	@Test
	public void jsonObject() {
		
		JSONObject jo=new JSONObject();
		
		jo.put("createdBy", "chintu");
		jo.put("createdOn", "19/07/2021");
		jo.put( "projectName", "playgroup");
		jo.put( "status", "created");
		
		RequestSpecification req = RestAssured.given();
		
		req.contentType("application/json");
		
		req.body(jo.toJSONString());
		
		Response resp = req.post("http://localhost:8084/addProject");
		
		ValidatableResponse vresp = resp.then();
		
		vresp.assertThat().statusCode(201);
		
		vresp.log().all();
	}

}
