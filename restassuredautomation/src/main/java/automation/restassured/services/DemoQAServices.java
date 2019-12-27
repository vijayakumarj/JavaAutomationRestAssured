package automation.restassured.services;

import automation.restassured.domain.Resources;
import automation.restassured.domain.models.Customer;
import automation.restassured.domain.models.WeatherSample;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class DemoQAServices extends BaseServices {
    public WeatherSample GetWeatherByCity(String city, boolean isSchemaValidationNeeded,int expectedStatusCode){
        Response response = Get("utilities/weather/city/"+city,expectedStatusCode);
        WeatherSample responseAsObject = Resources.Gson.fromJson(response.print(), WeatherSample.class);
        if (isSchemaValidationNeeded) {
            response.then().assertThat().body(matchesJsonSchemaInClasspath("weatherSample.json"));
            System.out.println("Schema Validation Successful");
        }
        return responseAsObject;
    }
    public void postCustomer(Customer customer,int expectedStatusCode){
        String JsonCustomer = Resources.Gson.toJson(customer,Customer.class);
        Response response = Post(JsonCustomer,"customer/Register",expectedStatusCode);
    }
}
