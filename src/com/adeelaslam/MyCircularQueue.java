package com.adeelaslam;

public class MyCircularQueue {
    int[] container;
    int tail;
    int head;
    int elementsCounter;


    public MyCircularQueue(int k) {
        container = new int[k];
        head = 0;
        tail = 0;
        elementsCounter = 0;
        for(int i = 0; i < k; i++) {
            container[i] = -1;
        }
    }

    public boolean enQueue(int value) {
        if (
            isFull()
        )
            return false;
        else {
            container[tail] = value;
            tail = (tail + 1) % container.length;
            elementsCounter++;
            return true;
        }
    }

    public boolean deQueue() {
        if (
            isEmpty()
        )
            return false;
        else {
            container[head] = -1;
            head = (head + 1) % container.length;
            elementsCounter--;
            return true;
        }
    }

    public int Front() {
        return container[head];
    }

    public int Rear() {
        if(tail == 0)
            return container[container.length - 1];
        
        return container[tail - 1];
    }

    public boolean isEmpty() {
        return elementsCounter == 0;
    }

    public boolean isFull() {
        return elementsCounter == container.length;
    }
}
