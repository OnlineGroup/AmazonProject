package Pages;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonPages {
    public AmazonPages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='cell Instances rowsSection']//child::img[@src='//d2zogmwzrm9slh.cloudfront.net/ver20200204w5/common/icons/small/add.png']")
    public WebElement addEC2Instance;
    @FindBy(xpath ="//tr[@class = 'EC2InstanceRow itemsTableDataRow table']//input[@class='gwt-TextBox input']")
    public List<WebElement> discriptionEC2Instance;
    @FindBy(xpath = "//div[@class='gwt-HTML field SF_EC2_INSTANCE_FIELD_TYPE instanceTypeField rowDialogSelectorFieldView']/..//following-sibling::td//img")
    public List<WebElement> typeButtonEC2Instance;
    @FindBy(xpath = "//div[.='t1.micro']/..//preceding-sibling::td//span/input")
    public WebElement T1microRadioBtn;
    @FindBy(xpath = "//button[.='Close and Save']")
    public WebElement saveAndClose;
    @FindBy(xpath = "//div[.='t2.micro']/..//preceding-sibling::td//span/input")
    public WebElement t2microRadioBtn;
    @FindBy(xpath = "//div[.='t2.medium']/..//preceding-sibling::td//span//input")
    public WebElement t2Medium;
    @FindBy(xpath ="//div[.='t2.large']/..//preceding-sibling::td//span//input")
    public WebElement t2Large;
    @FindBy(xpath ="//div[.='t2.xlarge']/..//preceding-sibling::td//span//input")
    public WebElement t2XLarge;
    @FindBy(xpath = "//div[@class='billLabel']")
    public WebElement estimateMonthlyBill;
    @FindBy(xpath = "/div[@class='gwt-HTML DynamicPrice DynamicPricePricing']")
    public List<WebElement> monthlyCosts;
    @FindBy(xpath = "//div[@class='restLabel']")
    public WebElement serviceTab;
    @FindBy(xpath = "//tr[@class='EC2InstanceRow itemsTableDataRow table']//select[@class='gwt-ListBox unit']")
    public List<WebElement> selectUsage;
    @FindBy(xpath = "//button[.='Save and Share']")
    public WebElement saveAndShare;
    @FindBy(xpath = "//input[@class='gwt-TextBox SC_SOLUTION_Input']")
    public WebElement nameInput;
    @FindBy(xpath = "//textArea[@class='gwt-TextArea SC_INCLUDES_Input']")
    public WebElement includesInput;
    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;
    @FindBy(xpath = "//a[@id='saveURL']")
    public WebElement saveUrl;
    @FindBy(xpath = "//div[@class='gwt-HTML SC_Price']")
    public WebElement monthlyCostAws;

}
