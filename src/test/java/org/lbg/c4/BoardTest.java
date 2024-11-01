package org.lbg.c4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    private Board cut; // Class Under Test
    private Scanner mockScanner;

    @BeforeEach
    public void setUp() {
        mockScanner = Mockito.mock(Scanner.class); // Create a mock Scanner
        cut = new Board(mockScanner); // Inject the mock into the Board instance
    }

    @Test
    public void testInitialiseBoard_ValidInput() {
        // Simulate valid input of 5
        Mockito.when(mockScanner.nextInt()).thenReturn(5);

        cut.initialiseBoard();

        assertEquals(5, cut.size);
    }

    @Test
    public void testInitialiseBoard_InputTooLow() {
        // Simulate input: first too low, then valid
        Mockito.when(mockScanner.nextInt()).thenReturn(2, 5);

        cut.initialiseBoard();

        assertEquals(5, cut.size);
    }

    @Test
    public void testInitialiseBoard_InputTooHigh() {
        // Simulate input: first too high, then valid
        Mockito.when(mockScanner.nextInt()).thenReturn(12, 5);

        cut.initialiseBoard();

        assertEquals(5, cut.size);
    }

    @Test
    public void testInitialiseBoard_NonIntegerInput() {
        // Simulate input: first non-integer (causes exception), then valid
        Mockito.when(mockScanner.nextInt()).thenThrow(new InputMismatchException()).thenReturn(7);

        cut.initialiseBoard();

        assertEquals(7, cut.size);
    }
}
