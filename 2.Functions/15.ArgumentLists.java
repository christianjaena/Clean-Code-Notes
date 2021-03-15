/**
	ARGUMENT LISTS
*/

// Sometimes we want to pass a variable number of arguments into a function. Consider, for example, the String.format method:
String.format("%s worked %.2f hours.", name, hours);

// If the variable arguments are all treated identically, as they are in the example above, then they are equivalent to a single argument of type List. By that reasoning, String.format is actually dyadic. Indeed, the declaration of String.format as shown below is clearly dyadic.
public String format(String format, Object ... args)

// So all the same rules apply. Functions that take variable arguments can be monads, dyads or even triads. But it would be a mistake to give them more arguments than that.
void monad(Integer ... args);
void dyad(String name, Integer ... args);
void traid(String name, int count, Integer ... args);