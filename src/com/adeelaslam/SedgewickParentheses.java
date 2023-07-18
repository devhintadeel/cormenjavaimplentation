package com.adeelaslam;

import java.util.Scanner;
import java.util.Stack;

// Problem 1.3.4 
public class SedgewickParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // [()]{}{[()()]()}
        // [(])
        String textStream = "";
        do {
            System.out.println("Enter a valid parentheses text stream or q to quit: ");
            textStream = scanner.next();
            if(textStream.equalsIgnoreCase("q")) {
                System.out.println("Thank you for using this program! Good bye");
                System.exit(1);
            }else {
                if(isValid(textStream)) {
                    System.out.println("Text stream is valid");
                }else {
                    System.out.println("Text Stream is not valid");
                }
            }
        }while(true);
    }
    public static boolean isValid(String textStream) {
        Stack<Character> bracketsStack = new Stack<>();
        for(char c : textStream.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                bracketsStack.push(c);
            }else {
                if(c == ')') {
                    c = bracketsStack.pop();
                    if(c != '(')
                        return false;
                }
                if(c == '}') {
                    c = bracketsStack.pop();
                    if(c != '{')
                        return false;
                }
                if(c == ']') {
                    c = bracketsStack.pop();
                    if(c != '[')
                        return false;
                }
            }
        }
        return true;
    }

}
