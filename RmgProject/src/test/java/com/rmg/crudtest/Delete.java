package com.rmg.crudtest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Delete {
	
	@Test
	public void delete() {
		
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_1002")
		
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}

}
