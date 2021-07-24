package com.rmg.crudtest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutProjects {
	
	@Test
	public void putProjects() {
	
JSONObject jo=new JSONObject();
		
		jo.put("createdBy", "Balegar");
		
		jo.put( "projectName", "sparkLight-sales");
				
	         given()
	         
	         .contentType(ContentType.JSON)
	         .body(jo.toJSONString())
	         
	         .when()
	         .patch("http://localhost:8084/projects/TY_PROJ_1606")
	         .then()
	         .log().all();
	         
	         
		
	}

}
