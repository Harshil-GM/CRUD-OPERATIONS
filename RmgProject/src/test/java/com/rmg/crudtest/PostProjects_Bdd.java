package com.rmg.crudtest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import  io.restassured.http.ContentType;

public class PostProjects_Bdd {
	
	@Test
public void addProject() {
		
		JSONObject jo=new JSONObject();
		
		jo.put("createdBy", "pallu");
		jo.put("createdOn", "19/07/2021");
		jo.put( "projectName", "sparkLight");
		jo.put( "status", "created");
  
		given()
		
		.contentType(ContentType.JSON)
		.body(jo.toJSONString())
		
		.when()
		.post("http://localhost:8084//addProject")
		
		.then()
		
		.log().all();

	}
	
}
