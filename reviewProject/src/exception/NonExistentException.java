package exception;

public class NonExistentException extends Exception{
	
	public NonExistentException() {}
	
	public NonExistentException(String message) {
		super(message);
	}
	
}
