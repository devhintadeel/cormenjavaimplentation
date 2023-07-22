package com.adeelaslam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyCircularQueueTest {

    @Test
    void testCase1() {
        MyCircularQueue obj = new MyCircularQueue(3);

        assert obj.container.length == 3;
        assert obj.head == 0;
        assert obj.tail == 0;
        assert obj.elementsCounter == 0;

        obj.enQueue(1);

        assert obj.container[0] == 1;
        assert obj.tail == 1;
        assert obj.head == 0;
        assert obj.elementsCounter == 1;

        obj.enQueue(2);
        assert obj.container[1] == 2;
        assert obj.tail == 2;
        assert obj.head == 0;
        assert obj.elementsCounter == 2;

        obj.enQueue(3);
        assert obj.container[2] == 3;
        assert obj.tail == 0;
        assert obj.head == 0;
        assert obj.elementsCounter == 3;
        
        assert obj.enQueue(4) == false;
        assert obj.tail == 0;
        assert obj.head == 0;
        assert obj.elementsCounter == 3;

        assert obj.Rear() == 3;

        assert obj.isFull() == true;
        obj.deQueue();
        assert obj.container[0] == -1;
        assert obj.tail == 0;
        assert obj.head == 1;
        assert obj.elementsCounter == 2;

        obj.enQueue(4);
        assert obj.container[0] == 4;
        assert obj.tail == 1;
        assert obj.head == 1;
        assert obj.elementsCounter == 3;

        assert obj.Rear() == 4;

    }
    @Test
    void testCase2() {
        MyCircularQueue obj = new MyCircularQueue(6);
        
        assert obj.container.length == 6;
        assert obj.head == 0;
        assert obj.tail == 0;
        assert obj.elementsCounter == 0;

        obj.enQueue(6);
        assert obj.container[0] == 6;
        assert obj.tail == 1;
        assert obj.head == 0;
        assert obj.elementsCounter == 1;

        assert obj.Rear() == 6;
        assert obj.Rear() == 6;
        obj.deQueue();
        assert obj.container[0] == -1;
        assert obj.tail == 1;
        assert obj.head == 1;
        assert obj.elementsCounter == 0;

        obj.enQueue(5);
        assert obj.container[1] == 5;
        assert obj.tail == 2;
        assert obj.head == 1;

        assert obj.Rear() == 5;
        
        obj.deQueue();
        assert obj.container[1] == -1;
        assert obj.tail == 2;
        assert obj.head == 2;

        assert obj.Rear() == -1;

        assert obj.deQueue() == false;
        assert obj.deQueue() == false;
        assert obj.deQueue() == false;
    }
    
    @Test
    void testCase3() {
        MyCircularQueue obj = new MyCircularQueue(3);

        assert obj.container.length == 3;
        assert obj.head == 0;
        assert obj.tail == 0;
        assert obj.elementsCounter == 0;

        obj.enQueue(2);
        assert obj.container[0] == 2;
        assert obj.tail == 1;
        assert obj.head == 0;
        assert obj.elementsCounter == 1;
        

        assert obj.Rear() == 2;

        assert obj.Front() == 2;

        obj.deQueue();

        assert obj.container[0] == -1;
        assert obj.tail == 1;
        assert obj.head == 1;
        assert obj.elementsCounter == 0;

        assert obj.Front() == -1;

        assert obj.deQueue() == false;
        assert obj.container[0] == -1;
        assert obj.tail == 1;
        assert obj.head == 1;
        assert obj.elementsCounter == 0;

        assert obj.Front() == -1;

        obj.enQueue(4);
        assert obj.container[1] == 4;
        assert obj.tail == 2;
        assert obj.head == 1;
        assert obj.elementsCounter == 1;

        obj.enQueue(2);
        assert obj.container[2] == 2;
        assert obj.tail == 0;
        assert obj.head == 1;
        assert obj.elementsCounter == 2;

        obj.enQueue(2);
        assert obj.container[0] == 2;
        assert obj.tail == 1;
        assert obj.head == 1;
        assert obj.elementsCounter == 3;

        assert obj.enQueue(3) == false;
        assert obj.container[0] == 2;
        assert obj.tail == 1;
        assert obj.head == 1;
        assert obj.elementsCounter == 3;
    }

}
