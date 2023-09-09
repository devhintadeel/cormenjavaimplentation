package com.adeelaslam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SedgewickStackTest {
    SedgewickStack objSolution = new SedgewickStack();
    @Test
    void testCheckParenthesis() {
        assert objSolution.checkParenthesis("[()]{}{[()()]}()") == true;
    }
    @Test
    void testCheckParenthesis1() {
        assert objSolution.checkParenthesis("[(])") == false;
    }

}
