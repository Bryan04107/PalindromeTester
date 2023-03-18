import java.util.Scanner;
import java.util.Stack;
public class PalindromeStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        StringBuilder testInv = new StringBuilder();
        
        System.out.print("Enter a string:");
        String test = input.nextLine();

        for (int i=0; i<test.length(); i++) {
            stack.push(test.charAt(i));
        }

        while (!stack.isEmpty()) {
            testInv.append(stack.pop());
        }

        if (test.equals(testInv.toString())) {
            System.out.println("Input is a Palindrome.");
        } else {
            System.out.println("Input is Not a Palindrome.");
        }
    }
}