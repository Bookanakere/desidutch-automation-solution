package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.FileDownloadSteps;

public class FileDownloadStepDefinitions {

    @Steps
    FileDownloadSteps fileDownloadSteps;

    @Given("I am on the file download page of the automation demo site")
    public void iAmOnTheFileDownloadPageOfTheAutomationDemoSite() {
        fileDownloadSteps.goToFileDownloadPage();

    }

    @When("I download the file")
    public void iDownloadTheFile() {
        fileDownloadSteps.clickOnDownload();
    }

    @Then("A file should be downloaded to my downloads folder")
    public void aFileShouldBeDownloadedToMyDownloadsFolder() {
        fileDownloadSteps.checkIfTheFileIsDownloaded();
    }
}
