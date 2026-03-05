/**
 * ==========================================================
 * INTERFACE - PalindromeStrategy
 * ==========================================================
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * ==========================================================
 * CLASS - StackStrategy
 * ==========================================================
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";
        PalindromeStrategy strategy = new StackStrategy();

        // Capture execution start time
        long startTime = System.nanoTime();

        // Execute the algorithm
        boolean isPalindrome = strategy.check(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display benchmarking results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}




