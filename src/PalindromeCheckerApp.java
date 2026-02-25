import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Declare and initialize the input string
        String input = "noon";
        System.out.println("Input : " + input);

        // 2. Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // 3. Push each character of the string into the stack
        // This utilizes the Push Operation
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 4. Assume palindrome initially
        boolean isPalindrome = true;

        // 5. Iterate again through original string and compare with Pop Operation
        for (char c : input.toCharArray()) {
            // Pop returns characters in reverse order
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Print result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}