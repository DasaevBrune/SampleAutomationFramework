package pageEvents;

import org.openqa.selenium.WebElement;
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

}
