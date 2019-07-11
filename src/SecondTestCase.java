import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login test");
        Assert.assertEquals(1,1);
    }


    @Test(priority = 3)
    void addCustomer() {
        System.out.println("This is add customer test");
    }


    @Test(priority = 4)
    void SearchCustomer() {
        System.out.println("This is customer search");
    }

    @Test(priority = 5)
    void close() {
        System.out.println("This is close window test");
    }

}
