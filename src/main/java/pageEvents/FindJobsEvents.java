package pageEvents;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CareersPageElements;
import pageObjects.FindJobsPageElements;
import utils.BaseTest;
import utils.ElementFetch;

import java.util.List;

public class FindJobsEvents {
    public boolean isJobOpportunitiesPageOpened() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying if Job Opportunities Page is opened");
        return !elementFetch.getListWebElements("XPATH", FindJobsPageElements.titleCareersText).isEmpty();
    }

    public boolean isUnexpectedElementPresent() {
        ElementFetch elementFetch = new ElementFetch();
        List<WebElement> unexpectedElements = elementFetch.getListWebElements("XPATH",FindJobsPageElements.elemetsToFail);
        return !unexpectedElements.isEmpty();
    }

    public void fillKeywordField(String keyword) {
        ElementFetch elementFetch = new ElementFetch();
        WebElement keywordField = elementFetch.getWebElement("XPATH", FindJobsPageElements.keyWordField);
        keywordField.sendKeys(keyword);
    }

    public void fillLocationField(String location) {
        ElementFetch elementFetch = new ElementFetch();
        WebElement locationField = elementFetch.getWebElement("XPATH", FindJobsPageElements.locationField);
        locationField.sendKeys(location);
        locationField.sendKeys(Keys.ENTER);
    }

    public void clickOnLocationOption() {
        ElementFetch elementFetch = new ElementFetch();
        WebElement locationOption = elementFetch.getWebElement("XPATH", FindJobsPageElements.countryListUY);
        locationOption.click();
    }

    public void selectFunctionOption(String function) {
        ElementFetch elementFetch = new ElementFetch();
        WebElement functionDropdown = elementFetch.getWebElement("ID", FindJobsPageElements.functionField);
        Select select = new Select(functionDropdown);
        select.selectByVisibleText(function);

    }

    public void clickSearchJobButton() {
        ElementFetch elementFetch = new ElementFetch();
        WebElement searchJobButton = elementFetch.getWebElement("ID", FindJobsPageElements.searchJobBtn);
        searchJobButton.click();
    }

    public boolean isJobTitlePresent(String jobTitle) {
        ElementFetch elementFetch = new ElementFetch();
        List<WebElement> jobTitles = elementFetch.getListWebElements("XPATH", jobTitle);
        return !jobTitles.isEmpty();
    }

    public boolean isJobLocationPresent(String jobLocation) {
        ElementFetch elementFetch = new ElementFetch();
        List<WebElement> jobLocations = elementFetch.getListWebElements("XPATH", jobLocation);
        return !jobLocations.isEmpty();
    }

}
