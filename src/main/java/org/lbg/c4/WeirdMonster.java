package org.lbg.c4;

public class WeirdMonster extends Monster {
    public WeirdMonster(int x,int y){
        super(x,y);
    }
    @Override
    public String monsterSaysHello(){
        return("Weird Monster has burnt you in a weird way");
    }
}
