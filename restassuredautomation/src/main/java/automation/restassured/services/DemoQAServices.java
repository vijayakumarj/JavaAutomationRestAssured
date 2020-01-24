package automation.restassured.services;

import automation.restassured.core.JsonJavaValidator;
import automation.restassured.domain.Resources;
import automation.restassured.domain.models.Customer;
import automation.restassured.domain.models.WeatherSample;
import io.restassured.response.Response;

public class DemoQAServices extends BaseServices {
    public WeatherSample GetWeatherByCity(String city,int expectedStatusCode,boolean isSchemaToBeValidated) throws Exception {
        Response response = Get("utilities/weather/city/"+city, expectedStatusCode);
        WeatherSample responseAsObject = Resources.Gson.fromJson(response.body().asString(), WeatherSample.class);
        if (isSchemaToBeValidated){
            JsonJavaValidator jsonJavaValidator = new JsonJavaValidator();
            jsonJavaValidator.validateSchema("weatherSample.json",response.body().asString());
        }
        return responseAsObject;
    }
    public void postCustomer(Customer customer,int expectedStatusCode) throws Exception {
        String JsonCustomer = Resources.Gson.toJson(customer,Customer.class);
        Response response = Post(JsonCustomer,"customer/Register",expectedStatusCode);
    }
    public void deletePost(String postId, int expectedStatusCode) throws Exception {
        String baseUri = "https://jsonplaceholder.typicode.com/";
        String path = "posts/"+postId;
        Response response = Delete(path,baseUri,expectedStatusCode);
    }
}
