import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

/**
 * Created by Rajesh on 7/20/2016.
 */
public class IAmTheEventListener extends AbstractWebDriverEventListener{


    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Before Navigate To "+url);

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Before Navigate Back. Right now I'm at "+driver.getCurrentUrl());

    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("After Navigate Back. Right now I'm at "+driver.getCurrentUrl());

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        // TODO Auto-generated method stub

    }
    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("After navigate to "+url + " and the current url is "+driver.getCurrentUrl());

    }
}

