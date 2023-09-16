package com.adeelaslam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Chapter1Test {
    Chapter1 objSolution = new Chapter1();
    @Test
    void testJosephusProblem() {
        int[] result = objSolution.josephusProblem(7, 2);
        assert result.length == 7;
        assert result[0] == 1;
        assert result[1] == 3;
        assert result[2] == 5;
        assert result[3] == 0;
        assert result[4] == 4;
        assert result[5] == 2;
        assert result[6] == 6;
    }

}
