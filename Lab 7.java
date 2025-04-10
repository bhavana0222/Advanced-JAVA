//1.WAP for handling Divide By Zero Exception.

DivideByZero.java

// Java program to handle Divide By Zero Exception
public class  DivideByZero {
  public static void main(String[] args)
 {
		        try {
		            int result = 10 / 0; // Attempt division by zero
		            System.out.println("Result: " + result);
		        } 
                       catch (ArithmeticException e) {
		            System.out.println("Error:Division by zero is not allowed");
		        }
		    
   }
}


//2.WAP for Shopping Application using Custom Exception to handle incorrect User credentials Exception and Payment Exceptions

class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

// Custom Exception for payment failure
class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }
}
// Shopping Application Class
class ShoppingApplication {
    private String username = "ammu@123";
    private String password = "pass@123";

    // Method to validate user login
    public void login(String user, String pass) throws InvalidUserException {
        if (!user.equals(username) || !pass.equals(password)) {
            throw new InvalidUserException("Invalid Username or Password!");
        }
        System.out.println("Login Successful!");
    }

    // Method to process payment
    public void makePayment(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Invalid Payment Amount!");
        }
        System.out.println("Payment of $" + amount + " processed successfully.");
    }

    public static void main(String[] args) {
        ShoppingApplication app = new ShoppingApplication();
        try {
            // Attempt login with incorrect credentials
            app.login("user123", "wrongpass"); 
        } catch (InvalidUserException e) {
            System.out.println("Login Error: " + e.getMessage());
        }

        try {
            // Attempt a valid login
            app.login("user123", "pass123");

            // Attempt an invalid payment
            app.makePayment(-100);
        } catch (InvalidUserException | PaymentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}