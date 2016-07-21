import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Rajesh on 7/7/2016.
 */
public class Selenium2Example  {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        /*
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        ChromeDriverService.Builder builder = new ChromeDriverService.Builder();

        ChromeDriverService srvc = builder.usingDriverExecutable(new File("C:\\chromedriver_win32\\chromedriver.exe")).usingPort(9519).build();
        WebDriver driver = new ChromeDriver(srvc);
        driver.get("http://www.google.com");

        driver.quit();
*/
        /*
        //Working with Internet Explorer.............................................................
        System.setProperty("webdriver.ie.driver","C:\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");


        InternetExplorerDriverService.Builder builder = new InternetExplorerDriverService.Builder();

        InternetExplorerDriverService srvc = builder.usingPort(5555).withHost("127.0.0.1").build();


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);




        WebDriver driver = new InternetExplorerDriver(srvc,capabilities);
        driver.get("http://www.google.com");

        srvc.stop();

        */

        /*
        FirefoxProfile profile = new FirefoxProfile();

        try {
            profile.addExtension(new File("C:\\Users\\Rajesh\\Downloads\\firebug-2.0.1.xpi"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        FirefoxDriver driver = new FirefoxDriver(profile);
*/


      /* //cookies
        for (Cookie ck:driver.manage().getCookies()
             ) {

            System.out.println(ck);
        }
        */
        /*
        //Implicit and explicit waits
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element = new WebDriverWait(driver,20).until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.name("q"));
            }
        });
        */

        /*
        //Navigation example
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("selenium webdriver");
//        element.sendKeys(Keys.ENTER);
        element.submit();
        Thread.sleep(2000L);
        driver.navigate().back();
        Thread.sleep(2000L);
        driver.navigate().forward();
        Thread.sleep(2000L);
        driver.navigate().refresh();

*/

       /* //window handle....................................//
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.online.citibank.co.in/");

        String window1 = driver.getWindowHandle();
        System.out.println("window1 "+window1);
        driver.findElement(By.xpath("//img[@alt='LOGIN NOW']")).click();

        String window2 = driver.getWindowHandle();
        System.out.println("window2 "+window2);

        driver.switchTo().window(window1);  */

/*
        //switch to frames
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        Actions action = new Actions(driver);
        driver.switchTo().frame(driver.findElements(By.tagName(“iframe”).get(0));
        driver.switchTo().frame(1);

*/



     //   WebElement element = driver.findElement(By.)

/*
        //Capture screenshot...............................//

        Map capalities = new HashMap();
        capalities.put("takesScreenShot",true);
        DesiredCapabilities cap = new DesiredCapabilities(capalities);
        WebDriver driver = new FirefoxDriver(cap);
        driver.get("http://www.packtpub.com/");
        File scrFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
        File tgtFile = new File("C:\\xmltest\\dest.jpg");
        FileUtils.copyFile(scrFile,tgtFile);
        System.out.println(scrFile.getAbsolutePath());
*/


/*        Map capalities = new HashMap();

        capalities.put("takesScreenShot",true);

        DesiredCapabilities cap = new DesiredCapabilities(capalities);

        WebDriver driver = new FirefoxDriver(cap);
        driver.get("http://www.google.com");

        WebDriver driver = new FirefoxDriver();
        driver.get("file://C:/xmltest/Selectable.html");
        driver.manage().window().maximize();
        Thread.sleep(5000L);
        WebElement one = driver.findElement(By.name("one"));
        WebElement eleven = driver.findElement(By.name("eleven"));
        WebElement five = driver.findElement(By.name("five"));
        Actions builder = new Actions(driver);

        builder.moveToElement(one).clickAndHold().moveToElement(five).release().perform();
//        builder.moveByOffset(one.getLocation().getX(),one.getLocation().getY()).clickAndHold().moveByOffset(five.getLocation().getX(),five.getLocation().getY());

        //Click on One
        builder.doubleClick(one);
        builder.build().perform();
        // Click on Eleven
        builder.click(eleven);
        builder.build().perform();
        //Click on Five
        builder.click(five);
        builder.build().perform();
        int border = 1;
        int tileWidth = 100;
        int tileHeight = 80;
        Actions builder = new Actions(driver);
        //Click on One
        builder.moveByOffset(one.getLocation().getX()+border, one.getLocation().getY()+border).click();
        builder.build().perform();
        // Click on Eleven
        builder.moveByOffset(2*tileWidth+4*border, 2*tileHeight+4*border).click();
        builder.build().perform();
        //Click on Five
        builder.moveByOffset(-2*tileWidth-4*border,-tileHeight-2*border).click();
        builder.build().perform();

//        WebElement element = driver.findElement(By.name("btnK"));


 /*       WebElement one = driver.findElement(By.name("one"));
        WebElement two = driver.findElement(By.name("three"));
        WebElement three = driver.findElement(By.name("five"));

        builder.keyDown(Keys.CONTROL).click(one).click(two).click(three).keyUp(Keys.CONTROL);

        builder.perform();

        System.out.println(three.getLocation().getX());


        builder.moveByOffset(three.getLocation().getX()+1,three.getLocation().getY()+1).click();
        builder.perform();


        builder.moveByOffset(5,6);

        builder.perform();

//
//        element.sendKeys(Keys.chord(Keys.SHIFT,"Hi"));

//        element.getCssValue("color");
//        Thread.sleep(5000L);
//        System.out.println(element.getAttribute("class"));
//        element.click();

//        WebElement searchBox = driver.findElement(By.className("gbqfif"));
//        searchBox.sendKeys("Packt Publishing");

//        List<WebElement> buttons =   driver.findElements(By.tagName("button"));
//        System.out.println(buttons.size());
//
//        System.out.println(buttons.get(0).getText());
 //       driver.executeScript("alert('hello')");

      //  driver.executeScript("scroll(0,100000)");

     //   Thread.sleep(5000L);

//        WebElement element = driver.findElement(By.name("q"));
//
//        element.sendKeys("cheese!");
//
//        element.submit();
//
//
//        System.out.println(driver.getTitle());
//

//        List<WebElement> cheeses = driver.findElements(By.className("cheese"));
//
//        for (WebElement elements:cheeses
//             ) {
//
//            System.out.println(elements);
//        }


 //       WebElement frames = driver.findElement(By.tagName("iframe"));

//        System.out.println(frames);

  //      driver.switchTo(frames);*/

    }
}
