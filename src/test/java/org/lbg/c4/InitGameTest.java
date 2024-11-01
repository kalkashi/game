package org.lbg.c4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitGameTest {

    private InitGame cut;
    private Scanner mockScanner;

    @BeforeEach
    public void setUp() {
        mockScanner = Mockito.mock(Scanner.class);
        cut = new InitGame(mockScanner);
    }

    @Test
    public void testInitialiseBoard_ValidInput() {
        Mockito.when(mockScanner.nextInt()).thenReturn(5);

        cut.initialiseBoard();

        assertEquals(5, cut.size);
    }

    @Test
    public void testInitialiseBoard_InputTooLow() {
        Mockito.when(mockScanner.nextInt()).thenReturn(2, 5);

        cut.initialiseBoard();

        assertEquals(5, cut.size);
    }

    @Test
    public void testInitialiseBoard_InputTooHigh() {
        Mockito.when(mockScanner.nextInt()).thenReturn(12, 5);

        cut.initialiseBoard();

        assertEquals(5, cut.size);
    }

    @Test
    public void testInitialiseBoard_NonIntegerInput() {
        Mockito.when(mockScanner.nextInt())
                .thenThrow(new InputMismatchException())
                .thenReturn(7); // Valid input

        cut.initialiseBoard();

        assertEquals(7, cut.size);
    }
}
