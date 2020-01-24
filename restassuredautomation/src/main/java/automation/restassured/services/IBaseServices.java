package automation.restassured.services;

import io.restassured.response.Response;

public interface IBaseServices {
    public Response Get(String path, int expectedStatusCode) throws Exception;

    public Response Post(String jsonObject, String path, int expectedStatusCode) throws Exception;

    public Response Delete(String path, int expectedStatusCode) throws Exception;

    public Response Put(String path, int expectedStatusCode) throws Exception;
}
