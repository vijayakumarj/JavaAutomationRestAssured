package automation.restassured.services;

import automation.restassured.domain.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseServices implements IBaseServices {

    public RequestSpecification httpRequest;

    public BaseServices() {
        httpRequest = RestAssured.given();
    }

    public Response Get(String path, int expectedStatusCode) throws Exception {
        Response response = RestAssured.get(Resources.BASE_URI + path);
        statusCodeValidation(response.getStatusCode(),expectedStatusCode);
        return response;
    }

    public Response Post(String jsonObject, String path, int expectedStatusCode) throws Exception {
        httpRequest.body(jsonObject);
        Response response = httpRequest.post(Resources.BASE_URI + path);
        statusCodeValidation(response.getStatusCode(),expectedStatusCode);
        return response;
    }

    public Response Delete(String path, int expectedStatusCode) throws Exception {
        Response response = httpRequest.delete(Resources.BASE_URI + path);
        statusCodeValidation(response.getStatusCode(),expectedStatusCode);
        return response;
    }
    public Response Delete(String path,String baseUri, int expectedStatusCode) throws Exception {
        Response response = httpRequest.delete(Resources.BASE_URI + path);
        statusCodeValidation(response.getStatusCode(),expectedStatusCode);
        return response;
    }
    public Response Put(String path, int expectedStatusCode) throws Exception {
        Response response = httpRequest.delete(Resources.BASE_URI + path);
        statusCodeValidation(response.getStatusCode(),expectedStatusCode);
        return response;
    }

    private void statusCodeValidation(int actualStatusCode, int expectedStatusCode) throws Exception {
        if (actualStatusCode != expectedStatusCode) {
            System.out.println("Status Code validation is unsuccessful");
            throw new Exception("Status Code Validation Failed");
        } else {
            System.out.println("Status Code validation is successful");
        }
    }
}

