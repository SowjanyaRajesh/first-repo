import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by Rajesh on 7/20/2016.
 */
public class IAmTheDriver {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        IAmTheEventListener listener = new IAmTheEventListener();
        eventFiringWebDriver.register(listener);


        eventFiringWebDriver.get("http://www.google.com");
        eventFiringWebDriver.get("http://www.facebook.com");
        eventFiringWebDriver.navigate().back();


    }
}
