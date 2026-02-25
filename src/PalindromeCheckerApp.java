import java.util.LinkedList;

void main() {

    String input = "level";
    System.out.println("Input : " + input);


    LinkedList<Character> list = new LinkedList<>();

    for (char c : input.toCharArray()) {
        list.add(c);
    }

    boolean isPalindrome = true;


    while (list.size() > 1) {
        if (!list.removeFirst().equals(list.removeLast())) {
            isPalindrome = false;
            break;
        }
    }


    System.out.println("Is Palindrome? : " + isPalindrome);
}