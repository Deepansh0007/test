// Main.java
public class Main {
    public static void main(String[] args) {
        Utility util = new Utility();
        int a = 5;
        int b = 3;

        int sum = util.add(a, b);
        int difference = util.subtract(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        String message = util.getMessage();
        System.out.println("Message: " + message);
    }
}

// Utility.java
public class Utility {
    // Function to add two numbers
    public int add(int x, int y) {
        return x + y;
    }

    // Function to subtract two numbers
    public int subtract(int x, int y) {
        return x - y;
    }

    // Function to return a message
    public String getMessage() {
        return "Hello, this is a message from the Utility class.";
    }
}
