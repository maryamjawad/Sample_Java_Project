/* Steps
1. Setup - Open Application
2. Login
3. Close browser
 */


import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup()
    {
      System.out.println("This is setup test");
    }
    @Test(priority = 2)
    void login()
    {
        System.out.println("This is login tets");
    }
    @Test (priority = 3)
    void close()
    {
        System.out.println("This is close window test");
    }

}
