package com.damianosiak.Model;

import com.damianosiak.Controller.Calculations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void getNumberA() {
        Number number = new Number();
        number.setNumberA(2L);
        assertEquals(2L,number.getNumberA());
    }

    @Test
    void getNumberB() {
        Number number = new Number();
        number.setNumberB(3L);
        assertEquals(3L,number.getNumberB());
    }

    @Test
    void getAdditionvalue() {
        Number number = new Number();
        number.setNumberA(2L);
        number.setNumberB(3L);
        Calculations calculations = new Calculations();
        number.setAdditionValue(calculations.addition(number.getNumberA(),number.getNumberB()));
        assertEquals(5L,number.getAdditionvalue());
    }

    @Test
    void getSubtractionValue() {
        Number number = new Number();
        number.setNumberA(2L);
        number.setNumberB(3L);
        Calculations calculations = new Calculations();
        number.setSubtractionValue(calculations.subtraction(number.getNumberA(),number.getNumberB()));
        assertEquals(-1L,number.getSubtractionValue());
    }

    @Test
    void getMultiplicationValue() {
        Number number = new Number();
        number.setNumberA(2L);
        number.setNumberB(3L);
        Calculations calculations = new Calculations();
        number.setMultiplicationValue(calculations.multiplication(number.getNumberA(),number.getNumberB()));
        assertEquals(6L,number.getMultiplicationValue());
    }

    @Test
    void getExponentiation() {
        Number number = new Number();
        number.setNumberA(2L);
        number.setNumberB(3L);
        Calculations calculations = new Calculations();
        number.setExponentiationValue(calculations.exponentiation(number.getNumberA(),number.getNumberB()));
        assertEquals(8L,number.getExponentiation());
    }

    @Test
    void setExponentiationValue() {
        Number number = new Number();
        number.setExponentiationValue(8L);
        assertEquals(8L,number.getExponentiation());
    }

    @Test
    void setNumberA() {
        Number number = new Number();
        number.setNumberA(2L);
        assertEquals(2L,number.getNumberA());
    }

    @Test
    void setNumberB() {
        Number number = new Number();
        number.setNumberB(3L);
        assertEquals(3L,number.getNumberB());
    }

    @Test
    void setAdditionValue() {
        Number number = new Number();
        number.setAdditionValue(5L);
        assertEquals(5L,number.getAdditionvalue());
    }

    @Test
    void setSubtractionValue() {
        Number number = new Number();
        number.setSubtractionValue(-1L);
        assertEquals(-1L,number.getSubtractionValue());
    }

    @Test
    void setMultiplicationValue() {
        Number number = new Number();
        number.setMultiplicationValue(6L);
        assertEquals(6L,number.getMultiplicationValue());
    }

    @Test
    void getTeam() {
        Number number = new Number();
        number.setTeam(Number.Team.BLUE);
        assertEquals("Sky is blue",number.getTeam());
    }

    @Test
    void setTeam() {
        Number number = new Number();
        number.setTeam(Number.Team.BLUE);
        assertEquals("Sky is blue",number.getTeam());
    }
}