package automation.restassured.services;

import automation.restassured.domain.Resources;
import automation.restassured.domain.models.WeatherSample;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class DemoQAServices extends BaseServices {
    public WeatherSample GetWeatherByCity(String city, boolean isSchemaValidationNeeded){
        Response response = Get("utilities/weather/city/"+city,200);
        WeatherSample responseAsObject = Resources.Gson.fromJson(response.print(), WeatherSample.class);
        if (isSchemaValidationNeeded) {
            response.then().assertThat().body(matchesJsonSchemaInClasspath("weatherSample.json"));
            System.out.println("Schema Validation Successful 1");
        }
        return responseAsObject;
    }
    public void PostCustomer(){

    }
}
