package prob05;

public class PasswordDismatchException extends Exception {
	private static final long serialVersionUID = 1L;

	public PasswordDismatchException() {
		super("Password is Nothing");
	}

	public PasswordDismatchException(String message) {
		super(message);
	}

}
