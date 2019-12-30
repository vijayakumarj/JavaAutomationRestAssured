package automation.restassured;

import automation.restassured.core.ReportLogger;
import automation.restassured.domain.Resources;
import com.google.gson.Gson;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    @BeforeTest
    public void BeforeTest(){

    }
    @AfterTest
    public void AfterTest(){

    }
    @BeforeSuite
    public void BeforeSuite(){
        Resources.BASE_URI = "http://restapi.demoqa.com/";
        Resources.Gson = new Gson();
    }
    @AfterSuite
    public void AfterSuite(){

    }
}
