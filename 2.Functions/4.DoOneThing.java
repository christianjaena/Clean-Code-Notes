/**
	DO ONE THING
*/

// Functions should do one thing. They should do it well. They should do it only.

public static void pureFunction() {
	return a + b;
}

// vs

public static void impureFunction() {
	doSomething();
	doAnotherThing();
	return a + b;
}