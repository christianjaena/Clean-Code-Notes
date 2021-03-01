/**
	MAKE MEANINGFUL DISTINCTIONS
*/

/*
	Consider these 2 functions:
		The first function is noninformative about its variable names.
		The second function is explicit on the naming of its variable and that makes it more understandable.

*/
public static void copyChars(char a1[], char a2[]) {
	for (int i = 0; i < a1.length; i++) {
		a2[i] = a1[i];
	}
}

public static void copyCharacters(char source[], char destination[]) {
	for (int counter = 0; counter < source.length; counter++) {
		destination[counter] = source[counter];
	}
}


/*
	Consider these classes:
		The word 'Info' and 'Data' added to an existing class named 'Product' does not give any new meaning.
		It is considered as a noise word which can be compared to 'a', 'an', and 'the' thus it is considered as a meaningless distinction.
*/ 
public class Product {}
public class ProductInfo {}
public class ProductData {}

// Try to at least not to contain an existing word to a new variable name such as:
int user;
int theUser; // named 'theUser' because 'user' already existed.

// Avoid redundance of words in a variable name such as:
int accountVariable; // the word 'variable' should not exist.
int[] accountTable; // the word 'table' should not exist.

public class Customer {}
public class CustomerObject {}

getActiveAccount();
getActiveAccounts();
getActiveAccountInfo();

int moneyAmount, money;
int customerInfo, customer;
int accountData, account;
int theMessage, message;

/*
	NOTE: Redundant naming does not help with distinctions.
*/