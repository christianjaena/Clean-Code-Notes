/**
	COMMON MONADIC FORMS
*/

// Two very common reasons to pass a single argument into a function.

// 1. Asking question about the argument.
public boolean fileExists("MyFile") {}

// 2. Operating on that argument, transforming it into something else and returning it.

public InputStream fileOpen("MyFile") {
	// transforms a file name String into an InputStream return value
}

// A less common, bit still very useful form for a single argument function, is an event.
public void passwordAttemptsFailedNTime(int attempts) {
	// Interpreting the function call as an event and use the argument to alter the state of the system.
}

// !! You should choose names that make the distinction clear, and always use the two forms in a consistent context.

// AVOID DOING THESE:
// Using an output argument instead of a return value for a transformation is confusing.
public void transform(StringBuffer output) {}

// if a function is going to transform its input argument, the transformation should appear as the return value.
public StringBuffer transform(StringBuffer input) {}
