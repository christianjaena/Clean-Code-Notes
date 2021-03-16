/**
	COMMAND QUERY SEPARATION
*/

// Functions should either do something or answer something but not both.
// Either your function should change the state of an object, or it should return some information about that object.

public boolean set(String attribute, String value) {}
if (set("username", "unclebob")) {}
// This is confusing because you might wonder if set is a verb or checking for it's existence

// You could resolve by changing the name into
public boolean setAndCheckIfExists(String attribute, String value) {}
// but this doesn't help much with the readability of the if statement.

//SOLUTION:
if (attributeExists("username")) {
	setAttribute("username", "unclebob");
}

// It reads like what you expected.