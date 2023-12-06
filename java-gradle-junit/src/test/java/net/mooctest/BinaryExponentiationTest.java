package net.mooctest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryExponentiationTest {

    @Test
    void calculatePower() {
        // power to zero
        assertEquals(1, BinaryExponentiation.calculatePower(2, 0));
        assertEquals(1, BinaryExponentiation.calculatePower(1, 0));
        assertEquals(1, BinaryExponentiation.calculatePower(0, 0));
        // power to one
        assertEquals(2, BinaryExponentiation.calculatePower(2, 1));
        // power to zero, negative base
        assertEquals(1, BinaryExponentiation.calculatePower(-2, 0));
        // normal cases
        assertEquals(4, BinaryExponentiation.calculatePower(2, 2));
        assertEquals(16, BinaryExponentiation.calculatePower(4, 2));
        // power to one, negative base
        assertEquals(-2, BinaryExponentiation.calculatePower(-2, 1));
        // normal cases, negative base, odd exponent
        assertEquals(4, BinaryExponentiation.calculatePower(-2, 2));
        assertEquals(16, BinaryExponentiation.calculatePower(-4, 2));
        // normal cases, negative base, even exponent
        assertEquals(-8, BinaryExponentiation.calculatePower(-2, 3));
        // power to negative numbers
        assertEquals(0, BinaryExponentiation.calculatePower(2, -1));
        assertEquals(0, BinaryExponentiation.calculatePower(3, -3));
        assertEquals(0, BinaryExponentiation.calculatePower(-2, -2));
        assertEquals(0, BinaryExponentiation.calculatePower(-3, -1));
        // division by zero
        assertThrows(Exception.class, () -> BinaryExponentiation.calculatePower(0, -1));
    }

    @Test
    void power() {
        // power to zero
        assertEquals(1, BinaryExponentiation.power(2, 0));
        assertEquals(1, BinaryExponentiation.power(1, 0));
        // power to one
        assertEquals(2, BinaryExponentiation.power(2, 1));
        // power to zero, negative base
        assertEquals(1, BinaryExponentiation.power(-2, 0));
        // normal cases
        assertEquals(4, BinaryExponentiation.power(2, 2));
        assertEquals(16, BinaryExponentiation.power(4, 2));
        // power to one, negative base
        assertEquals(-2, BinaryExponentiation.power(-2, 1));
        // normal cases, negative base, odd exponent
        assertEquals(4, BinaryExponentiation.power(-2, 2));
        assertEquals(16, BinaryExponentiation.power(-4, 2));
        // normal cases, negative base, even exponent
        assertEquals(-8, BinaryExponentiation.power(-2, 3));
        // power to negative numbers
        assertEquals(0, BinaryExponentiation.power(2, -1));
        assertEquals(0, BinaryExponentiation.power(3, -3));
        assertEquals(0, BinaryExponentiation.power(-2, -2));
        assertEquals(0, BinaryExponentiation.power(-3, -1));
        // division by zero
        assertThrows(Exception.class, () -> BinaryExponentiation.calculatePower(0, -1));
    }
}