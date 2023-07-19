package com.adeelaslam;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    
    List<Integer> integers = new ArrayList<>();
    
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!contains(key)) {
            integers.add(key);
        }
    }
    
    public void remove(int key) {
        if(contains(key))
            integers.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for(int integer : integers) {
            if(integer == key) {
                return true;
            }
        }
        return false;
        
    }
}
