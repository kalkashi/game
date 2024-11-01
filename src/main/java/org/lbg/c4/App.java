package org.lbg.c4;

import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Board b = new Board(sc);
        
        b.initialiseBoard();
    }
}
