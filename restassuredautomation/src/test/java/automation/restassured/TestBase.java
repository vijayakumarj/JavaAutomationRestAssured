package automation.restassured;

import automation.restassured.core.ReportLogger;
import automation.restassured.domain.Resources;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    @BeforeTest
    public void beforeTest(){

    }
    @AfterTest
    public void afterTest(){

    }
    @BeforeSuite
    public void beforeSuite(){
        Resources.BASE_URI = "http://restapi.demoqa.com/";
        Resources.Gson = new Gson();
    }
    @AfterSuite
    public void afterSuite(){

    }
    public void ReportError(Exception e){
        System.out.println(e.getMessage());
        Assert.fail(e.getMessage());
    }
}
