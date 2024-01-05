package stacks;

import java.util.Stack;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221; // Change this to the number you want to check

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(int number) {
        String numString = Integer.toString(number);
        Stack<Character> stack = new Stack<>();

        // Push each digit onto the stack
        for (int i = 0; i < numString.length(); i++) {
            stack.push(numString.charAt(i));
        }

        // Pop the digits off the stack and compare them with the original number
        for (int i = 0; i < numString.length(); i++) {
            char digit = stack.pop();
            if (digit != numString.charAt(i)) {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }
}
