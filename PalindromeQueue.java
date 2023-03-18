import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        StringBuilder testInv = new StringBuilder();

        System.out.print("Enter a string:");
        String test = input.nextLine();

        for (int i=test.length()-1; i >=0; i--) {
            queue.add(test.charAt(i));
        }

        while (!queue.isEmpty()) {
            testInv.append(queue.remove());
        }

        if (test.equals(testInv.toString())) {
            System.out.println("Input is a Palindrome.");
        } else {
            System.out.println("Input is Not a Palindrome.");
        }
    }
}