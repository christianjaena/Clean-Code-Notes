/**
	OUTPUT ARGUMENTS
*/

// Arguments are most naturally interpreted as inputs to a function.
public void appendFooter(StringBuffer report) {}
appendFooter(s);
// Here, you have to know about the function itself.
report.appendFooter();
// This is much better because 'this' is already considered as input.
