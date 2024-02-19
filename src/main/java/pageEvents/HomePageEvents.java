package pageEvents;

import pageObjects.HomePageElements;
import utils.BaseTest;
import utils.ElementFetch;

public class HomePageEvents {
    public void clickOnCareersLink(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on Careers Link");
        elementFetch.getWebElement("XPATH", HomePageElements.careersLinkText).click();
    }
}
