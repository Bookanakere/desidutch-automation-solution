package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.FileDownloadPage;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FileDownloadSteps {

    private FileDownloadPage fileDownloadPage;

    @Step("Go to file download page of automation demo website")
    public void goToFileDownloadPage(){
        fileDownloadPage.open();
    }

    @Step("Click on download")
    public void clickOnDownload(){
        fileDownloadPage.clickOnDownload();
    }

    @Step("check if the file exists in downloads directory")
    public void checkIfTheFileIsDownloaded(){
        File file = new File("/Users/rashmibookanakere/Downloads/selenium-webdriver-3.142.7.gem");
        assertTrue(file.exists());
        assertTrue(file.delete());
    }
}
