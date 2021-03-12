/**
	FUNCTION ARGUMENTS
*/

// The ideal number of arguments for a function is zero (niladic)
// Three arguments should be avoided as possible.

includeSetupPage();
// is easier to understand than
includeSetupPageInto(newPageContent);
// the argument is at a different level of abstraction than the function name and forces you to know a detail that isn't particularly important at that point.


// Having more than one arguments make testing hard too because you have to factor every possibilities of every argument.

// One input argument is the next best thing to no arguments.
SetupTeardownIncluder.render(pageData)
// is pretty easy to understand.
// Clearly we are going to render the data in the pageData object.