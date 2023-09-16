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
    
    @Test
    void testInsertInfixMissingParentheses() {
        assertEquals("((1+2)*((3-4)*(5-6)))", objSolution.insertInfixMissingParentheses("1+2)*3-4)*5-6)))"));
    }
    
    @Test
    void testInfixToPostfix() {
        assertEquals("((12+)((34-)(56-)*)*)", objSolution.infixToPostfix("((1+2)*((3-4)*(5-6)))"));
    }
    
    @Test
    void testEvaluatePostfix() {
        assert objSolution.evaluatePostfix("((12+)((34-)(56-)*)*)") == 3;
    }
    

}
