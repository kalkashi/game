package org.lbg.c4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {
    int size = 0;
    int max_size = 10;
    int min_size = 3;
    private final Scanner scanner;

    public Board(Scanner scanner) {
        this.scanner = scanner;
    }

    public void initialiseBoard() {
        System.out.println("Please specify a board size between 3 and 10");
        while (this.size < min_size || this.size > max_size) {
            try {
                int result = scanner.nextInt();
                if (result < min_size || result > max_size) {
                    System.out.println("The board size cannot be smaller than 3 or larger than 10");
                } else {
                    size = result;
                }
            } catch (InputMismatchException e) {
                System.out.println("Board size must be an integer value between 3 and 10");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
