package com.adeelaslam;

public class Stack {

    private Stack top;
    
    
    private int data;
    public int getData() {
        return data;
    }
    
    // it is not push keep it separate it is not called
    public void setData(int data) {
        this.data = data;
    }
    
    public void push(int data) {
        Stack node = new Stack();
        node.setData(data);
        if(top == null) {
            top = node;
        }else {
            
        }
    }
    
    public boolean isEmpty() {
        if(top == null) {
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Stack objStack = new Stack();
        System.out.println("Is the stack empty " + objStack.isEmpty());
    }

}
