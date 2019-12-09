package automation.restassured;


import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.Method;
import io.restassured.internal.http.HTTPBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class TestApiSample {
    @Test
    public void testSampleApi(){
        try{
            //Just a change for commit1
            RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
            RequestSpecification httpRequest = RestAssured.given();

            Response response = httpRequest.request(Method.GET, "/Hyderabad");

            String responseBody = response.getBody().asString();
            System.out.println(responseBody);

            response.then().assertThat().body(matchesJsonSchemaInClasspath("weatherSample.json"));
        }
        catch (Exception e){
            System.out.println(e.getMessage().toString());

        }


    }
}
