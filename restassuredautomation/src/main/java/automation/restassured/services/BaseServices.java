package automation.restassured.services;

import automation.restassured.domain.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseServices {

    public RequestSpecification httpRequest;
    public BaseServices(){
        httpRequest = RestAssured.given();
    }

    public Response Get(String path, int expectedStatusCode){
        Response response = RestAssured.get(Resources.BASE_URI+path);
        if (response.getStatusCode() != expectedStatusCode){
            System.out.println("Status Code validation is unsuccessful");
        }
        else{
            System.out.println("Status Code validation is successful");
        }
        return response;
    }
    public Response Post(String jsonObject,String path,int expectedStatusCode){
        httpRequest.body(jsonObject);
        Response response = httpRequest.post(Resources.BASE_URI+path);
        if (response.getStatusCode() != expectedStatusCode){
            System.out.println("Status Code validation is unsuccessful");
        }
        else{
            System.out.println("Status Code validation is successful");
        }
        return response;
    }
    public void Delete(){

    }
    public void Put(){

    }
}

