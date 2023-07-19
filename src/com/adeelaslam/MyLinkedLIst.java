package com.adeelaslam;

class MyLinkedList {
	ListNode head;
    public MyLinkedList() {
       
    }
    
    public int get(int index) {
        int currentIndex = 0;
        ListNode current = head;
        while(current != null) {
        	if(currentIndex == index)
        		break;
        	currentIndex++;
        	current = current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
    	ListNode myNode = new ListNode(val, head);
    	head = myNode;
    }
    
    public void addAtTail(int val) {
    	ListNode current = head;
    	while(current.next != null) {
    		current = current.next;
    	}
    	ListNode tailNode = new ListNode(val);
    	current.next = tailNode;
    }
    
    public void addAtIndex(int index, int val) {
    	if(head == null && index == 0) {
    		head = new ListNode(val);
    		return;
    	}
    	if(index == 0) {
    		ListNode newHead = new ListNode(val, head);
    		head = newHead;
    		return;
    	}
    	int currentIndex = 0;
    	ListNode current = head;
    	while(current != null) {
    		if(index == currentIndex + 1)
    			break;
    		current = current.next;
    		currentIndex++;
    	}
    	ListNode newNode = new ListNode(val, current.next);
    	current.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
    	int currentIndex = 0;
    	ListNode current = head;
    	if(index == 0){
            head = head.next;
            return;
        }
    	while(current != null) {
    		if(index == currentIndex + 1)
    			break;

    		current = current.next;
    		currentIndex++;
    	}
    	current.next = current.next.next;
    }
    public void traverse() {
    	if(head == null) {
    		System.out.println("Linked List is empty");
    	}
    	ListNode current = head;
    	int index = 0;
    	while(current != null) {
    		System.out.println("Item at index " + index + " is " + current.val);
    		index++;
    		current = current.next;
    	}
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */