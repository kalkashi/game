package org.lbg.c4;

public abstract class Monster {

    int x;
    int y;

    public Monster(int x,int y){
        this.x=x;
        this.y=y;
    }
    public abstract String monsterSaysHello();

    public int getXValue(){
        return x;
    }

    public int getYValue(){
        return y;
    }


}
