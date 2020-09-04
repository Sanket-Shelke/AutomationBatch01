package ifElseStatement;

public class NestedIfElse {

	public static void main(String[] args) {

		// Pre-condition - > launch browser, valid credentials to login,
		// ComposeEmail button enable

		boolean browser = true;
		boolean login = true;
		boolean composeEmail = true;

		if (browser) {
			System.out.println("Browser launched successfully...!!");
			if (login) {
				System.out.println("Login Successful...!!");

				if (composeEmail) {
					System.out.println("Compose button is enabled..!");

					// enter email in To:
					// Enter Subject line
					// Enter mail body
					// Click send
				} else {
					System.out.println("Compose button is not enabled..!!");
				}
			} else {
				System.out.println("Login Failed..!!!");
			}
		} else {
			System.out.println("Failed to Launch...!!!");
		}
	}

}
