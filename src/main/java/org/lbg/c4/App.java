package org.lbg.c4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InitGame g = new InitGame(scanner);
        g.letsGo();
        scanner.close();
    }
}
