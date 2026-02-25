import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Define the input string
        String input = "refer";
        System.out.println("Input : " + input);

        // 2. Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // 3. Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // 4. Flag to track palindrome result
        boolean isPalindrome = true;

        // 5. Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove from front and rear for direct comparison
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Print the result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}