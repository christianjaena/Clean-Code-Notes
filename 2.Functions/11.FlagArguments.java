/**
	FLAG ARGUMENTS
*/

// Passing a boolean into a function is truly a terrible practice.
// It immediately complicates the signature of the method, loudly proclaiming that this function does more than one thing.
// It does one thing if the flag is true and another if the flag is false.


void render(true); // bad application
void render(boolean isSuite); // better but not quite