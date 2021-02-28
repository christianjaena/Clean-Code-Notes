/**
	METHOD NAMES
*/

// Class names are named by nouns and Methods should be named as verbs.
// (get, set, is) + name
String name = employee.getName();
customer.setName("Mike");
if (paycheck.isPosted()) ...

// Avoid overloading constructors
Complex fulcrumPoint = Complex.FromRealNumber(23.0);
// >
Complex fulcrumPoint = new Complex(23.0);

// It is recommended to make constructors private
