/**
	INFORMATIVE COMMENTS
*/

// Returns an instance of the Responder being tested.
protected abstract Responder responderInstance();

// An informative comment like this is helpful, but renaming the function name into responderBeingTested is better.
protected abstract Responder responderBeingTested();

// A good example of informative comment:

// format matched kk::mm::ss EEE, MMM dd, yyyy
Pattern timeMatcher = Pattern.compile(
	"\\d*:\\d*\\d* \\w*, \\w* \\d*, \\d*"
);

// This case tells us the regex pattern is intended to match a time and date that were formatted with the SimpleDateFormat.format function using the specified format string.