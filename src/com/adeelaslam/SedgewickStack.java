package com.adeelaslam;

import java.util.Stack;

public class SedgewickStack {
    public boolean checkParenthesis(String s) {
        Stack<Character> stack =  new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }else {
                if(c == ')') {
                    if(stack.pop() != '(') {
                        return false;
                    }
                }
                if(c == '}') {
                    if(stack.pop() != '{') {
                        return false;
                    }
                }

                if(c == ']') {
                    if(stack.pop() != '[') {
                        return false;
                    }
                }

            }
            
        }
        return stack.isEmpty();
    }
}
