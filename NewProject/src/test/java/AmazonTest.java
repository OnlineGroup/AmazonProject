import Pages.AmazonPages;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest extends TestBase {

@BeforeTest
public void LogIn(){
    driver.get("http://calculator.s3.amazonaws.com/index.html");
}
    @Test
    public void Test(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        AmazonPages page=new AmazonPages(driver);
        page.addEC2Instance.click();



        page.t2microRadioBtn.click();

        page.saveAndClose.click();
        page.discriptionEC2Instance.get(0).sendKeys("T1 Linux Micro");


        page.addEC2Instance.click();

        page.typeButtonEC2Instance.get(1).click();

        page.t2microRadioBtn.click();

        page.saveAndClose.click();
        page.discriptionEC2Instance.get(1).sendKeys("T1 Linux Micro");

        //------------------------------------------------------------------------

    }


}
