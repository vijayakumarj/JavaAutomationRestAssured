package automation.restassured.services;

import automation.restassured.domain.Resources;
import automation.restassured.domain.models.Customer;
import automation.restassured.domain.models.WeatherSample;
import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class DemoQAServices extends BaseServices {
    public WeatherSample GetWeatherByCity(String city,int expectedStatusCode){
        Response response = Get("utilities/weather/city/"+city,expectedStatusCode);
        WeatherSample responseAsObject = Resources.Gson.fromJson(response.body().asString(), WeatherSample.class);
        return responseAsObject;
    }
    public void postCustomer(Customer customer,int expectedStatusCode){
        String JsonCustomer = Resources.Gson.toJson(customer,Customer.class);
        Response response = Post(JsonCustomer,"customer/Register",expectedStatusCode);
    }
}
