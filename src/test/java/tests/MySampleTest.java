package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageEvents.CareersPageEvents;
import pageEvents.FindJobsEvents;
import pageEvents.HomePageEvents;
import utils.BaseTest;

public class MySampleTest extends BaseTest {

    @Test
    public void verifyCareersAccessView(){
        HomePageEvents homePage = new HomePageEvents();
        homePage.clickOnCareersLink();

        CareersPageEvents careersPage = new CareersPageEvents();
        boolean isCareersPageOpened = careersPage.isCareerPageOpened();
        Assert.assertTrue(isCareersPageOpened,"Career Access failed");
    }

    @Test
    public void verifyFindJobsView(){
        HomePageEvents homePage = new HomePageEvents();
        homePage.clickOnCareersLink();

        CareersPageEvents careersPage = new CareersPageEvents();
        careersPage.clickOnJobOpportunitiesBtn();

        FindJobsEvents findJobs = new FindJobsEvents();
        boolean isFindJobsPageOpened = findJobs.isJobOpportunitiesPageOpened();
        Assert.assertTrue(isFindJobsPageOpened,"Job Opportunities access failed");

    }

    @Test
    public void verifyFindJobsView_FailingTest() {
        HomePageEvents homePage = new HomePageEvents();
        homePage.clickOnCareersLink();

        CareersPageEvents careersPage = new CareersPageEvents();
        careersPage.clickOnJobOpportunitiesBtn();

        FindJobsEvents findJobs = new FindJobsEvents();
        boolean isUnexpectedElementPresent = findJobs.isUnexpectedElementPresent();
        Assert.assertTrue(isUnexpectedElementPresent, "Unexpected element found, test should fail");
    }

}