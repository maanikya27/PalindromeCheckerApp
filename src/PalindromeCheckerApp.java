/**
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * Goal: Ignore spaces and case while checking a palindrome.
 * Data Structure: String / Array.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // 1. Define the input string with spaces and mixed case
        String input = "A man a plan a canal Panama";
        System.out.println("Input : " + input);

        // 2. Normalize the string: remove non-alphanumeric characters and lowercase
        // This is the "String preprocessing" step using Regular Expressions
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 3. Assume palindrome initially
        boolean isPalindrome = true;

        // 4. Compare symmetric characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare characters at symmetric positions
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // 5. Print the result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}