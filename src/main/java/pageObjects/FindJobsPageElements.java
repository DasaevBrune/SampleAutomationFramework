package pageObjects;

public interface FindJobsPageElements {
    String jobOpportunitiesUrl = "https://careers.ukg.com/careers";
    String keyWordField = "//input[@id='3730']";
    String locationField = "//input[@id='3731-search__field']";

    String functionField ="3732";
    String functionOption ="//option[contains(text(), 'Software & Product Development')]";

    String searchJobBtn ="3734-submit";

    String titleCareersText = "//h2[normalize-space()='Careers']";

    String elemetsToFail = "//span[@id='unexpectedElement']";

    String countryListUY = "//li[@id='li5768933']";

    String jobTitleQAE = "//a[normalize-space()='QA Automation Engineer']";

    String jobLocation = "//span[normalize-space()='Location: Montevideo - Uruguay - Uruguay.']";
}
