import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Input: Get user's name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Process: Create a greeting message
        String greeting = "Hello, " + name + "! Welcome to the program.";

        // Output: Display the greeting
        System.out.println(greeting);
        System.out.println(greeting);
        scanner.close();
    }
}