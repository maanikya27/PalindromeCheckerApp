public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Declare and initialize the input string
        String input = "radar";
        System.out.println("Input : " + input);

        // 2. Convert the string into a character array
        char[] chars = input.toCharArray();

        // 3. Initialize pointer at the beginning
        int start = 0;

        // 4. Initialize pointer at the end
        int end = chars.length - 1;

        // 5. Assume palindrome initially
        boolean isPalindrome = true;

        // 6. Continue comparison until pointers cross
        while (start < end) {
            // Compare characters at current pointers
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        // Output the result
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}