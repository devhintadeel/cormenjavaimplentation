package com.adeelaslam;

public class Stack {

    private int[] array = new int[8];
    int top = 0;
    
    private int data;
    public int getData() {
        return data;
    }
    
    // it is not push keep it separate it is not called
    public void setData(int data) {
        this.data = data;
    }
    
    public void push(int x) {
        top = top + 1;
        array[top] = x;
    }
    
    public boolean isEmpty() {
        if(top == 0) {
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Stack objStack = new Stack();
        System.out.println("Is the stack empty " + objStack.isEmpty());
        objStack.push(3);
        System.out.println("Is the stack empty " + objStack.isEmpty());
        objStack.isEmpty();
    }

}
