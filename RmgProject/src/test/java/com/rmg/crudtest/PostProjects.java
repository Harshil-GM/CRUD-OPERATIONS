package com.rmg.crudtest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostProjects {
	
	@Test
	public void addProject() {
		
		JSONObject jo=new JSONObject();
		
		jo.put("createdBy", "bujju");
		jo.put("createdOn", "19/07/2021");
		jo.put( "projectName", "sparkLight-sales");
		jo.put( "status", "created");
		
	RequestSpecification req =RestAssured.given();
	
	req.contentType(ContentType.JSON);
	req.body(jo.toJSONString());
	
	Response resp = req.post("http://localhost:8084/addProject");
	
	                  ValidatableResponse vresp = resp.then();     
	                  
	                  vresp.assertThat().statusCode(200);
	                  vresp.assertThat().contentType(ContentType.JSON);
	                  vresp.log().all();
	
	}

}
