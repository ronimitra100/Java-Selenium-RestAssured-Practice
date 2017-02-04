package udemy1.fruz1;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import com.jayway.restassured.RestAssured;

public class ApartmentTest {

	@BeforeClass
    public void init(){
	RestAssured.baseURI = "http://localhost:8080";
	}
	
	String id = null;
	String apartmentId = null;
	
	@Test(priority=0)
	public void postLandlord(){
		
	}
	

}
