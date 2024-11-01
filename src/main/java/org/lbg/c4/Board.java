package org.lbg.c4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Board {

    int size=4;
    char[][] game_board;

    Random r = new Random();

    Treasure t ;
    Monster m ;
    Player p;



    public Board(int size){
        this.size = size;
        this.game_board = new char[size][size];
        int pX = r.nextInt(size);
        int pY = r.nextInt(size);
        p = new Player(pX, pY);

        int mX = r.nextInt(size);
        int mY = r.nextInt(size);
        m = MonsterDB.create(mX,mY);

        int tX = r.nextInt(size);
        int tY = r.nextInt(size);
        t = new Treasure(tX, tY);

    }






    public Treasure findTreasure(){
        return t;
    }

    public Player findPlayer(){
        return p;
    }

    public Monster findMonster(){
        return m;
    }

    public int getSize(){
        return size;
    }

    public boolean foundMonster() {
        if( p.getXValue() == m.getXValue() && p.getYValue() == m.getYValue()){
            return true;
        }
        return false;
    }

    public boolean foundTreasure() {
        if( p.getXValue() == t.getXValue() && p.getYValue() == t.getYValue()){
            return true;
        }
        return false;
    }



}
