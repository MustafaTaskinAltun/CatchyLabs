package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CatchylabsPage {
    public CatchylabsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement Username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement Password;

    @FindBy(xpath = "//*[@class='css-146c3p1 r-jwli3a r-1b43r93']")
    public WebElement Loginbutonu;

    @FindBy(xpath = "//*[@class='css-146c3p1 r-howw7u r-1b43r93']")
    public WebElement UsernameorPasswordInvalidText;

    @FindBy(xpath = "//*[@class='css-146c3p1 r-jwli3a r-1b43r93']")
    public WebElement OpenMoneyTransferButton;

    @FindBy(xpath = "(//*[@class='css-146c3p1 r-jwli3a r-1b43r93'])[4]")
    public WebElement EditAccountButton;

    @FindBy(xpath = "//*[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']")
    public WebElement AccountName;

    @FindBy(xpath = "(//*[@class='css-146c3p1 r-jwli3a r-1b43r93'])[5]")
    public WebElement UpdateButton;

    @FindBy(xpath = "//*[text()='12345']")
    public WebElement AccountNameDogrulama;

    @FindBy(xpath = "//*[text()='     ']")
    public WebElement AccountSpaceNameDogrulama;

    @FindBy(xpath = "//*[text()='**--??']")
    public WebElement AccountSpecialNameDogrulama;












}


