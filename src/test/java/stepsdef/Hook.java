package stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    StepsBase stepsBase;

    public Hook(StepsBase stepsBase) {
        this.stepsBase = stepsBase;
    }

    @Before
    public void initializeTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jesus G\\Desktop\\Tutofast Gerencia\\tutofast-web-testing\\driver\\chromedriver.exe");
        stepsBase.driver=new ChromeDriver();
    }

    @After
    public void finishTest(){
        stepsBase.driver.quit();
    }

}
