package com.testcore;

class InvalidAgeException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String message) {
        super(message);
    }
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
    public InvalidAgeException(Throwable cause) {
        super(cause);
    }
}

public class ExceptionTest {

	public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an InvalidAgeException
        } catch (InvalidAgeException e) {
            System.err.println("Caught an exception: " + e.getMessage());
           e.printStackTrace();
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }
}
