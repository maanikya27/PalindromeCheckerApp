import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Define the input string to validate
        String input = "civic";
        System.out.println("Input : " + input);

        // 2. Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // 3. Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // 4. Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue operation
            stack.push(c); // Push operation
        }

        // 5. Flag to track palindrome status
        boolean isPalindrome = true;

        // 6. Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // dequeue (FIFO) vs pop (LIFO)
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Output results
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}