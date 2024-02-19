package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CareersPageElements;
import utils.BaseTest;
import utils.ElementFetch;

import static utils.BaseTest.driver;

public class CareersPageEvents {
    public boolean isCareerPageOpened() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying if Login page is opened");
        return !elementFetch.getListWebElements("XPATH", CareersPageElements.careersTitleText).isEmpty();
    }

    public void clickOnJobOpportunitiesBtn() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jobOpportunitiesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CareersPageElements.viewJobsBtn)));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", jobOpportunitiesBtn);
    }
}
