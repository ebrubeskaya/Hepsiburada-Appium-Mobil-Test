package StepDefinitions;

import Pages.HepsiBuradaPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class HepsiBuradaStepDefinitions {
    HepsiBuradaPages HepsiBuradaPages = new HepsiBuradaPages(DriverFactory.getDriver());

    @When("Click to MyAccount Symbol")
    public void clickToMyAccountSymbol() {
        HepsiBuradaPages.clkAccSymbol();
    }

    @When("Click to GirisYap Button")
    public void clickToGirisYapButton() {
        HepsiBuradaPages.clkGirisYapBtn();
    }



    @Then("Check to GirisYap Button is Available in Login Page")
    public void checkToGirisYapButtonIsAvailableInLoginPage() {
        HepsiBuradaPages.chckGirisYapBtn();
    }

    @Then("Check E-Mail Box is Available in Login Page")
    public void checkEMailBoxIsAvailableInLoginPage() {
        HepsiBuradaPages.chckEmailBox();
    }

    @When("Write False Email Address")
    public void writeFalseEmailAddress() {
        HepsiBuradaPages.writeFalseEmail();
    }

    @Then("Check to {string} Message")
    public void checkToMessage(String errorEmailMessage) {
        HepsiBuradaPages.chckMessage(errorEmailMessage);
    }

    @When("Write {string} Number")
    public void writeNumber(String falseNumber) {
        HepsiBuradaPages.writeFalsePhone(falseNumber);
    }


    @Then("Check to {string} Message About Phone Number")
    public void checkToMessageAboutPhoneNumber(String errorPhoneMessage) {
        HepsiBuradaPages.chckMessagePhone(errorPhoneMessage);
    }

    @When("Write Correct Email Address")
    public void writeCorrectEmailAddress() {
        HepsiBuradaPages.writeCorrectEmail();
    }

    @When("Write False Password")
    public void writeFalsePassword() {
        HepsiBuradaPages.writeFalsePassword();
    }

    @Then("Check to {string} Message About Login")
    public void checkToMessageAboutLogin(String errorMessageLogin) {
        HepsiBuradaPages.chckMessageLogin(errorMessageLogin);
    }


}
