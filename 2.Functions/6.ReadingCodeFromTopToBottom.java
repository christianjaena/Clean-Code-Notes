/**
	READING CODE FROM TOP TO BOTTOM: THE STEPDOWN RULE
*/

// Top down narrative/ Step down rule - We want every function to be followed by those at the next level of abstraction so that we can read the program, descending one level of abstraction at a time as we read down the list of functions.

/**
	To include the setups and teardowns, we include setups, then we include the test page content, and we include the teardowns.
		To include the setups, we include the suite setup if this is a suite, then we include the regular setup.
		To include the suite setups, we search the parent hierarchy for the "SuiteSetUp" page and add an include statement with the path of that page.
*/

public class SetupTeardownIncluder {
	private PageData pageData;
	private boolean isSuite;
	private WikiPage testPage;
	private StringBuffer newPageContent;
	private PageCrawler PageCrawler;

	public static String render(PageData pageData) throws Exception {
		return render(pageData, false);
	}

	public static String render(PageData pageData, boolean isSuite) throws Exception {
		return new SetupTeardownIncluder(pageData).render(isSuite);
	}

	private SetupTeardownIncluder(PageData pageData) {
		this.pageData = pageData;
		testPage = pageData.getWikiPage();
		PageCrawler = testPage.getPageCrawler();
		newPageContent = new StringBuffer();
	}

	private String render(boolean isSuite) throws Exception {
		this.isSuite = isSuite;
		if (isTestPage())
			includeSetupAndTeardownPages();
		return pageData.getHtml();
	}

	private boolean isTestPage() throws Exception {
		return pageData.hasAttribute("Test");
	}

	private void includeSetupAndTeardownPages()	throws Exception {
		includeSetupPages();
		includePageContent();
		includeTeardownPages();
		updatePageContent();
	}
}
