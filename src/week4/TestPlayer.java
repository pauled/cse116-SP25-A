package week4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPlayer {
    @Test
    public void testPlayer(){
        Player p1=new Player(4);
        Player p2=new Player(4);
        //assertTrue("These should be equal",p1==p2);
        assertEquals("maxHP",p1.getMaxHP(),p2.getMaxHP());
        assertEquals("HP",p1.getHP(),p2.getHP());
        assertEquals("damageDealt",p1.getDamageDealt(),p2.getDamageDealt());
    }
}
