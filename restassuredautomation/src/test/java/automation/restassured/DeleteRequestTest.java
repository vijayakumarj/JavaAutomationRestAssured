package automation.restassured;

import automation.restassured.domain.models.WeatherSample;
import automation.restassured.services.DemoQAServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteRequestTest extends TestBase {
    @Test
    public void deleteRequestTestCase() {
        try {
            DemoQAServices demoQAServices = new DemoQAServices();
            demoQAServices.deletePost("1", 200);
        } catch (Exception e) {
            ReportError(e);
        }
    }
}

