package week7;

import week10.Player;
import week10.Usable;

import java.util.HashMap;

public class HealthPotion extends GameItem  {
    private int increase;

    public HealthPotion(double xLoc,double yLoc, int increase){
        super(xLoc,yLoc);
        this.increase=increase;
    }

    public void use(Player player) {
        player.takeDamage(-this.increase);
    }

    public void drink(){
        System.out.println("I feel healthy!");
    }
}
