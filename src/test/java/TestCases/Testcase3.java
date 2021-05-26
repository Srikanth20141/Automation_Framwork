package TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testcase3 {
	Logger logger;

	//@Test(priority=1)
	public void getData() {

		logger = Logger.getLogger("TestCase3");
		PropertyConfigurator.configure("log4j.properties");
		//RestAssured.given().get().then().statusCode(200).log().all( );
		
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification httpReq = RestAssured.given();

		Response response = httpReq.get("/users");
		int statusCode = response.getStatusCode();
		String respondBody = response.getBody().asString();

		Assert.assertEquals(statusCode /* actual value */, 200 /* expected value */, "Correct status code returned");
		Assert.assertTrue(respondBody!=null);
		logger.info("Correct status 200"+respondBody);
		
	}
	@Test(priority=0)
	public void test_post() {
		JSONObject rq = new JSONObject();
		rq.put("id","4");
		rq.put("fname", "Kumara");
		rq.put("lname", "Saman");
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).header("Content-Type","application/json").body(rq.toJSONString(rq)).when().post("users").then().statusCode(201);
		
	}
	
	//@Test
	public void test_patch () {
		JSONObject rq = new JSONObject();
		rq.put("id","4");
		rq.put("fname", "Nimal");
		rq.put("lname", "Karunarathne");
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).header("Content-Type","application/json").body(rq.toJSONString(rq)).when().patch("/users/4").then().statusCode(200);
		
	}
	//@Test
	public void test_delete() {
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification httpReq = RestAssured.given();
		Response response = httpReq.delete("/users/4");
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode /* actual value */, 200 /* expected value */, "Successful deleted");
			
	}
}
