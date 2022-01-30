package stepDef;


import base.setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends setup {
    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envData = System.getProperty("env");

    @Before
    public void startTest(){
        driver = setupBrowser(driverType);
        switch (envData){
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }

    @After
    public void endTest(){
        //driver.close();
    }
}
