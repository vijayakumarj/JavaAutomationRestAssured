package automation.restassured;


import automation.restassured.domain.models.WeatherSample;
import automation.restassured.services.DemoQAServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequestTest extends TestBase{
    @Test
    public void testSampleApi(){
        try{
            DemoQAServices demoQAServices = new DemoQAServices();
            WeatherSample weatherSample = demoQAServices.GetWeatherByCity("Hyderabad",200,false);
            Assert.assertEquals("Hyderabad",weatherSample.getCity());
        }
        catch (Exception e){
            ReportError(e);
        }
    }
}
