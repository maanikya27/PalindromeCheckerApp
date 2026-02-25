/**
 * MAIN CLASS - PalindromeCheckerApp
 * This class validates a palindrome using recursion.
 */
public class PalindromeCheckerApp { // Class name now matches your file name

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input : " + input);

        // Call the recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * Uses the Call Stack to manage method calls.
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: stop when pointers cross
        if (start >= end) {
            return true;
        }

        // Comparison logic
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}