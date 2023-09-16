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
    
    public String insertInfixMissingParentheses(String input) {
        Stack<Character> operatorsStack = new Stack<>();
        Stack<String> operandsStack = new Stack<>();
        String lhs = "";
        String rhs = "";
        char operator;
        for(char c : input.toCharArray()) {
            if(c == '+' || c == '-' || c == '*' || c == '/') {
                operatorsStack.push(c);
                continue;
            }else {
                if(Character.isDigit(c)) {
                    operandsStack.push(String.valueOf(c));
                }else {
                    if(c == ')') {
                        rhs = operandsStack.pop();
                        lhs = operandsStack.pop();
                        if(!operatorsStack.isEmpty()) {
                            operator = operatorsStack.pop();
                            operandsStack.push("(" + lhs + operator + rhs + ")");
                        }else {
                            operandsStack.push("(" + lhs + rhs + ")");
                        }
                    }
                }
            }
        }
        return operandsStack.firstElement();
    }
    
    public String infixToPostfix(String infix) {
        Stack<String> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        Stack<Character> bracketStack = new Stack<>();
        String lhs;
        String rhs;
        char operator;
        for(char c : infix.toCharArray()) {
            if(c == '(') {
                bracketStack.push('(');
            }else {
                if(Character.isDigit(c)) {
                    operandStack.push(String.valueOf(c));
                }else {
                    if(c == '+' || c == '-' || c == '*' || c == '/') {
                        operatorStack.push(c);
                    }
                    else {
                        if(c == ')') {
                            rhs = operandStack.pop();
                            lhs = operandStack.pop();
                            operator = operatorStack.pop();
                            bracketStack.pop();
                            
                            operandStack.push("(" + lhs + rhs + operator + ")");
                        }
                    }
                }
            }
        }
        return operandStack.firstElement();
    }
}
