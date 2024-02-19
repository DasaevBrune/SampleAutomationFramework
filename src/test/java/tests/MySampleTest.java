package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageEvents.CareersPageEvents;
import pageEvents.FindJobsEvents;
import pageEvents.HomePageEvents;
import pageObjects.FindJobsPageElements;
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

    @Test
    public void verifySearchJob() throws InterruptedException {
        HomePageEvents homePage = new HomePageEvents();
        homePage.clickOnCareersLink();

        CareersPageEvents careersPage = new CareersPageEvents();
        careersPage.clickOnJobOpportunitiesBtn();

        FindJobsEvents findJobs = new FindJobsEvents();
        findJobs.fillKeywordField("QA Automation Engineer");
        Thread.sleep(1000);
        findJobs.fillLocationField("Uruguay");
        findJobs.clickOnLocationOption();
        Thread.sleep(5000);
        findJobs.selectFunctionOption("Software & Product Development");
        Thread.sleep(5000);
        findJobs.clickSearchJobButton();
        Thread.sleep(5000);

        Assert.assertTrue(findJobs.isJobTitlePresent(FindJobsPageElements.jobTitleQAE), "Job title not found");
        Assert.assertTrue(findJobs.isJobLocationPresent(FindJobsPageElements.jobLocation), "Job location not found");



    }

}