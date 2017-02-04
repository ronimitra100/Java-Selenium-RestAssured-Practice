package udemy1.fruz1;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
*/

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class LandLordTest {
	
	/*@Before
	public void init(){
		RestAssured.baseURI = "http://localhost:8080";
	}*/
	
	@BeforeClass
	public static void classinit(){
		RestAssured.baseURI = "http://localhost:8080";
	}
	
	@Test(priority=0, dependsOnMethods="failTest")
	public void getLandlords(){
		
		when()
		  .get("/landlords")
		.then()
		  .statusCode(200);
		//.body("", is(empty()))
	}
	
	@DataProvider(name = "validLandLords")
	public Object[][] createData1(){
		return new Object[][] {
			{new LandLord("Roni5", "Mitra5")},
			{new LandLord("Roni5", "Mitra5", true)}
		};
	}
	
	
	@Test(enabled=true)
	public void failTest(){
		Assert.assertTrue(false);
	}
	
	@Test(priority=1, dataProvider="validLandLords")
	public void postLandlord01(LandLord landlord){
		
		//LandLord landlord = new LandLord("Roni", "Mitra");
		
		String id = given()
		  .contentType(ContentType.JSON)
		  .body(landlord)
		.when()
		  .post("/landlords")
		.then()
		  .statusCode(201)
		  .body("firstName", is(landlord.getFirstName()))
		  .body("lastName", is(landlord.getLastName()))
		  .body("trusted", is(landlord.getTrusted()))
		  .body("apartments", is(empty()))
		 .extract()
		    .path("id");
		
		given()
		 .pathParam("id", id)
		.when()
		 .get("/landlords/{id}")
		.then()
		 .statusCode(200)
		 .body("id", is(id))
		 .body("firstName", is(landlord.getFirstName()))
		 .body("lastName", is(landlord.getLastName()))
		  .body("trusted", is(landlord.getTrusted()))
		  .body("apartments", is(empty()));
		  
		
	}
	
	/*@Test(priority=1)
	public void postLandlord02(){
		
		LandLord landlord = new LandLord("Roni", "Mitra", true);
		
		String id = given()
		  .contentType(ContentType.JSON)
		  .body(landlord)
		.when()
		  .post("/landlords")
		.then()
		  .statusCode(201)
		  .body("firstName", is(landlord.getFirstName()))
		  .body("lastName", is(landlord.getLastName()))
		  .body("trusted", is(true))
		  .body("apartments", is(empty()))
		 .extract()
		    .path("id");
		
		given()
		 .pathParam("id", id)
		.when()
		 .get("/landlords/{id}")
		.then()
		 .statusCode(200)
		 .body("id", is(id))
		 .body("firstName", is(landlord.getFirstName()))
		 .body("lastName", is(landlord.getLastName()))
		  .body("trusted", is(true))
		  .body("apartments", is(empty()));	
	}*/

	@Test(priority=1, enabled=false)
	public void postLandlordNegative01(){
		LandLord landlord = new LandLord("", "");
		
    given()
      .contentType(ContentType.JSON)
      .body(landlord)
    .when()
      .post("/landlords")
    .then()
      .statusCode(400)
      .body("message", is("Fields are with validation errors"))
      .body("fieldErrorDTOs[1].fieldName", is("lastName"))
      .body("fieldErrorDTOs[1].fieldError", is("Last name can not be empty"))
      .body("fieldErrorDTOs[0].fieldName", is("firstName"))
      .body("fieldErrorDTOs[0].fieldError", is("First name can not be empty"));
    
    }
    
		
	@Test(priority=2)
	public void putLandlord()
{
        LandLord landlord1 = new LandLord("Roni1", "Mitra1", true);
		
		String id = given()
		  .contentType(ContentType.JSON)
		  .body(landlord1)
		.when()
		  .post("/landlords")
		.then()
		  .statusCode(201)
		 .extract()
		    .path("id");
		
		LandLord landlord2 = new LandLord("Roni2", "Mitra2");
		
		given()
		   .contentType(ContentType.JSON)
		   .body(landlord2)
		   .pathParam("id", id)
		.when()
		   .put("/landlords/{id}")
		 .then()
		   .statusCode(200)
		   .body("message", is("LandLord with id: " + id + " successfully updated"));
		
		
		given()
		  .contentType(ContentType.JSON)
		  .pathParam("id", id)
	    .when()
	      .get("/landlords/{id}")
	    .then()
	       .statusCode(200)
		   .body("id", is(id))
		   .body("firstName", is(landlord2.getFirstName()))
		 .body("lastName", is(landlord2.getLastName()))
		  .body("trusted", is(false))
		  .body("apartments", is(empty()));	
	       
}

	
	@Test(priority=3)
	public void deleteLandlord()
{
        LandLord landlord3 = new LandLord("Roni3", "Mitra3", true);
		
		String id = given()
		  .contentType(ContentType.JSON)
		  .body(landlord3)
		.when()
		  .post("/landlords")
		.then()
		  .statusCode(201)
		 .extract()
		    .path("id");
		
		LandLord landlord4 = new LandLord("Roni4", "Mitra4");
		
		given()
		   .contentType(ContentType.JSON)
		   .body(landlord4)
		   .pathParam("id", id)
		.when()
		   .delete("/landlords/{id}")
		 .then()
		   .statusCode(200)
		   .body("message", is("LandLord with id: " + id + " successfully deleted"));
		
		
		given()
		  .contentType(ContentType.JSON)
		  .pathParam("id", id)
	    .when()
	      .get("/landlords/{id}")
	    .then()
	       .statusCode(404)
		   .body("message", is("There is no LandLord with id: " + id));	
	       
}
	
	
}