package automation.restassured;


import automation.restassured.domain.models.WeatherSample;
import automation.restassured.services.DemoQAServices;
import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class DemoQAGetAPISchemaValidation extends TestBase{
    @Test
    public void testSampleApi(){
        try{
            DemoQAServices demoQAServices = new DemoQAServices();
            WeatherSample weatherSample = demoQAServices.GetWeatherByCity("Hyderabad",true,200);

            Assert.assertEquals("Hyderabad",weatherSample.getCity());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail(e.getMessage());
        }


    }
}
