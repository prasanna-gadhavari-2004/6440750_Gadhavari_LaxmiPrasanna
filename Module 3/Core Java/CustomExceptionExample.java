class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int age = 16; // You can modify this or use Scanner for input
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }
            System.out.println("Access granted.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}