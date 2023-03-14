package com.example.au_demo_live;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
class LinkedListTest {

    @Test
    @DisplayName("index = -1 ---> Exception should be thrown")
    void testElement_shouldThrowsExceptionOnNegativeIndex(){

        final var list = new LinkedList<Integer>();
        assertThrows(RuntimeException.class, () -> list.getElement(-1));
    }

    @Test
    @DisplayName("Given a valid index, getElement() should return the value")
    void testGetElement_shouldReturnELementOnValidIndex(){
        final var list = new LinkedList<Integer>();

        list.addElement(10);
        assertEquals(10, list.getElement(0));
    }

    @Test
    @DisplayName("index greater than the size --> throw exception")
    void testGetElement_shouldthrowExceptionGreaterThanSize(){
        final var list = new LinkedList<Integer>();

        list.addElement(10);
        list.addElement(20);
        final var exception =  assertThrows(RuntimeException.class, () -> list.getElement(2));
        assertEquals("Index greater than the size on the list", exception.getMessage());
    }

    @Test
    @DisplayName("Length Of LinkedList should increase after adding element")
    void testIncreaseSize_shouldIncreaseTheSize(){

        final var list = new LinkedList<Integer>();

        list.addElement(10);
        list.addElement(20);
    }

}