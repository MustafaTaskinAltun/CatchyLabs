package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CatchylabsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CatchylabsStepDefinition {
    CatchylabsPage catchylabsPage = new CatchylabsPage();

    @Given("kullanici catchylab sayfasina gider")
    public void kullaniciCatchylabSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("catchylabsUrl"));
        ReusableMethods.bekle(3);
    }

    @Then("kullanici invalid user ve invalid password girer")
    public void kullaniciInvalidUserVeInvalidPasswordGirer() {
        catchylabsPage.Username.sendKeys("hakan.altun@asdastestinium.com");
        ReusableMethods.bekle(3);
        catchylabsPage.Password.sendKeys("12345");
        ReusableMethods.bekle(3);
        catchylabsPage.Loginbutonu.click();
    }

    @And("kullanici Username or Password Invalid! hatasini aldigini gorur")
    public void kullaniciUsernameOrPasswordInvalidHatasiniAldiginiGorur() {
        Assert.assertTrue(catchylabsPage.UsernameorPasswordInvalidText.getText().contains("Username or Password Invalid!"));
        ReusableMethods.bekle(3);
    }

    @Then("kullanici valid user ve valid password ile girer")
    public void kullaniciValidUserVeValidPasswordIleGirer() {
        catchylabsPage.Username.sendKeys("taskin.altun@testinium.com");
        ReusableMethods.bekle(3);
        catchylabsPage.Password.sendKeys("!Asd5215");
        ReusableMethods.bekle(3);
        catchylabsPage.Loginbutonu.click();
        ReusableMethods.bekle(3);
    }

    @And("Sayfa basliginin apps olarak geldigi gorulur")
    public void sayfaBasligininAppsOlarakGeldigiGorulur() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apps"));
        ReusableMethods.bekle(3);
    }


    @And("kullanici open money transfer butonuna tiklar")
    public void kullaniciOpenMoneyTransferButonunaTiklar() {

        catchylabsPage.OpenMoneyTransferButton.click();
        ReusableMethods.bekle(3);
    }

    @And("kullanici money transfer ekraninin acildigini kontrol eder")
    public void kullaniciMoneyTransferEkranininAcildiginiKontrolEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("money-transfer"));
        ReusableMethods.bekle(3);
    }

    @And("kullanici edit account butonuna tiklar")
    public void kullaniciEditAccountButonunaTiklar() {

        catchylabsPage.EditAccountButton.click();
        ReusableMethods.bekle(3);
    }

    @And("kullanici account name alanina rakam girer ve update e tiklar")
    public void kullaniciAccountNameAlaninaRakamGirerVeUpdateETıklar() {
        catchylabsPage.AccountName.clear();

        catchylabsPage.AccountName.sendKeys("12345");
        ReusableMethods.bekle(3);
        catchylabsPage.UpdateButton.click();
        ReusableMethods.bekle(3);

    }

    @And("hata almadan gectigini gorur")
    public void hataAlmadanGectiginiGorur() {
        Assert.assertTrue(catchylabsPage.AccountNameDogrulama.getText().contains("12345"));
    }

    @And("kullanici account name alanina space tusu ile bosluk karakteri girer ve update e tiklar")
    public void kullaniciAccountNameAlaninaSpaceTusuIleBoslukKarakteriGirerVeUpdateETiklar() {

        catchylabsPage.AccountName.clear();

        catchylabsPage.AccountName.sendKeys("     ");
        ReusableMethods.bekle(3);
        catchylabsPage.UpdateButton.click();
        ReusableMethods.bekle(3);


    }

    @And("kulanici hata almadan gectigini gorur")
    public void kulaniciHataAlmadanGectiginiGorur() {

        Assert.assertTrue(catchylabsPage.AccountSpaceNameDogrulama.isDisplayed());
    }

    @And("kullanici account name special karakter girer ve update e tiklar")
    public void kullaniciAccountNameSpecialKarakterGirerVeUpdateETiklar() {

        catchylabsPage.AccountName.clear();

        catchylabsPage.AccountName.sendKeys("**--??");
        ReusableMethods.bekle(3);
        catchylabsPage.UpdateButton.click();
        ReusableMethods.bekle(3);
    }

    @And("kulanici special karakter ile hata almadan gectigini gorur")
    public void kulaniciSpecialKarakterIleHataAlmadanGectiginiGorur() {
        Assert.assertTrue(catchylabsPage.AccountSpecialNameDogrulama.getText().contains("**--??"));
        Driver.closeDriver();
    }
}
