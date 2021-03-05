/**
	SMALL FUNCTIONS
*/

// Functions should be small and about 20 lines long at most.

// They should be shorter than this.

public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
	if (isTestPage(pageData))
		includeSetupAndTeardownPages(pageData, isSuite);
	return pageData.getHtml();
}
