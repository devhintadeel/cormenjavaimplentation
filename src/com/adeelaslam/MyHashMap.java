package com.adeelaslam;

import java.util.ArrayList;
import java.util.List;

class MyMap{
    private int key;
    private int value;
    public MyMap(int key, int value) {
        this.key = key;
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    
}

public class MyHashMap {
    
    List<MyMap> container = new ArrayList<>();
    
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if(get(key) == -1) {
            container.add(new MyMap(key, value));
        }else {
            for(MyMap myMapItem : container) {
                if(myMapItem.getKey() == key) {
                    myMapItem.setValue(value);
                }
            }
        }
        
    }
    
    public int get(int key) {
        for(MyMap myMapItem : container) {
            if(myMapItem.getKey() == key)
                return myMapItem.getValue();
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < container.size(); i++) {
            if(container.get(i).getKey() == key) {
                container.remove(i);
            }
        }
    }
}
