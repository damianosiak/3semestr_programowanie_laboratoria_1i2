package com.damianosiak.Controller;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    /**
     * This test is related to method named "getHistory" from "Calculations" class
     * Program executes four calculations (multiplication, addition, subtraction, exponentiation) and result is saving to history variable
     * In this case, test Vector named "testVectorHistory" contains values [6,5,-1,8]
     * Correct mathematical results history of this calculations must also contains values [6,5,-1,8], let's check it!
     */
    @Test
    void getHistory() {
        //given
        Calculations calculations = new Calculations();
        Long numberA = 2L;
        Long numberB = 3L;

        //when
        calculations.multiplication(numberA,numberB);
        calculations.addition(numberA,numberB);
        calculations.subtraction(numberA,numberB);
        calculations.exponentiation(numberA,numberB);

        //then
        Vector<Long> testVectorHistory = new Vector<>();
        testVectorHistory.add(6L);testVectorHistory.add(5L);testVectorHistory.add(-1L);testVectorHistory.add(8L);
        assertEquals(testVectorHistory,calculations.getHistoryVector());
    }

    /**
     * This test is related to method named "multiplication()" from "Calculations" class
     * In this case, variable "numberA" is equal "2" and variable "numberB" is equal "3"
     * The correct mathematical result of this multiplication is "6", let's check it!
     */
    @Test
    void multiplication() {
        //given
        Calculations calculations = new Calculations();
        Long numberA = 2L;
        Long numberB = 3L;

        //when
        Long result = calculations.multiplication(numberA,numberB);

        //then
        assertEquals(Long.valueOf(6),result);
    }

    /**
     * This test is related to method named "addition()" from "Calculations" class
     * In this case, variable "numberA" is equal "2" and variable "numberB" is equal "3"
     * The correct mathematical result of this addition is "5", let's check it!
     */
    @Test
    void addition() {
        //given
        Calculations calculations = new Calculations();
        Long numberA = 2L;
        Long numberB = 3L;

        //when
        Long result = calculations.addition(numberA,numberB);

        //then
        assertEquals(Long.valueOf(5),result);
    }

    /**
     * This test is related to method named "subtraction()" from "Calculations" class
     * In this case, variable "numberA" is equal "2" and variable "numberB" is equal "3"
     * The correct mathematical result of this subtraction is "-1", let's check it!
     */
    @Test
    void subtraction() {
        //given
        Calculations calculations = new Calculations();
        Long numberA = 2L;
        Long numberB = 3L;

        //when
        Long result = calculations.subtraction(numberA,numberB);

        //then
        assertEquals(Long.valueOf(-1),result);
    }

    /**
     * This test is related to method named "exponentiation()" from "Calculations" class
     * In this case, variable "numberA" is equal "2" and variable "numberB" is equal "3"
     * The correct mathematical result of this exponentiation is "8", let's check it!
     */
    @Test
    void exponentiation() {
        //given
        Calculations calculations = new Calculations();
        Long numberA = 2L;
        Long numberB = 3L;

        //when
        Long result = calculations.exponentiation(numberA,numberB);

        //then
        assertEquals(Long.valueOf(8),result);
    }
}