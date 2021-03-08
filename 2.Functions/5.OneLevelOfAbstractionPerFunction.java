/**
	ONE LEVEL OF ABSTRACTION 
*/

// Mixing levels of abstraction within a function is always confusing. Readers may not be able to tell whether a particular expression is an essential concept or a detail.

public void getHtml() {
	return html;
}

public void getHtmlAndDeleteHtml() {
	getHtml();
	return deleteHtml();
}