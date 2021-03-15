/**
	HAVE NO SIDE EFFECTS
*/

// Functions should do ONE thing. Input and Output, no side effects outside the function.
public class UserValidator {
	private Cryptographer cryptographer;

	public boolean checkPassword(String userName, String password) {
		User user = UserGateway.findByName(userName);
		if (user != User.NULL) {
			String codedPhrase = user.getPhraseEncodedByPassword();
			String phrase = cryptographer.decrypt(codedPhrase, password);
			if ("Valid Password".equals(phrase)) {
				Session.initialize();
				return true;
			}
		}
		return false;
	}
}

// Session.initialize() is the side effect. It should only check for password.
// This is called temporal coupling, solution would be change the name to checkPasswordAndInitializeSession()

public class UserValidator {
	private Cryptographer cryptographer;

	public boolean checkPassword(String userName, String password) {
		User user = UserGateway.findByName(userName);
		if (user != User.NULL) {
			String codedPhrase = user.getPhraseEncodedByPassword();
			String phrase = cryptographer.decrypt(codedPhrase, password);
			if ("Valid Password".equals(phrase)) {
				return true;
			}
		}
		return false;
	}

	public void initializeSession(String userName, String password) {
		checkPassword(userName, password) && Session.initialize();
	}
}


