package automation.restassured;

import automation.restassured.domain.models.Customer;
import automation.restassured.services.DemoQAServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQAPostApiTest extends TestBase{
    @Test
    public void PostCustomer(){
        try {
            Customer customer = new Customer();
            customer.Email = "vija@dkd.com";
            customer.FirstName = "Vijayakumar J";
            customer.LastName = "Kongu";
            customer.Password = "GGG@ididi";
            customer.UserName ="vijayisalwayskool";
            DemoQAServices demoQAServices = new DemoQAServices();
            demoQAServices.postCustomer(customer,200);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            Assert.fail(e.getMessage());
        }
    }
}
