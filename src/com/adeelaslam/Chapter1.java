/**
 * 
 */
package com.adeelaslam;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class Chapter1 {

    /**
     * @param args
     */
    public int[] josephusProblem(int populationSize, int indexToKill) {
        List<Integer> list = new ArrayList<>();
        int[] toReturn = new int[populationSize];
        int index = 0;
        int killIndex = 0;
        for(int i = 0; i < populationSize; i++) {
            list.add(i);
        }
        while(list.size() > 1) {
            toReturn[index++] = list.get((killIndex + indexToKill) % list.size() - 1);
            list.remove((killIndex + indexToKill) % list.size() - 1);
            killIndex  = ((killIndex + indexToKill) % list.size() - 1);
        }
        toReturn[populationSize - 1] = list.get(0);
        return toReturn;
    }
}
