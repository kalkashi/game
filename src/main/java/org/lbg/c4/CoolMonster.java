package org.lbg.c4;

public class CoolMonster extends Monster {
    public CoolMonster(int x,int y){
        super(x,y);
    }
    @Override
    public String monsterSaysHello(){
        return("Cool Monster has destroyed you in a cool way");
    }

}
