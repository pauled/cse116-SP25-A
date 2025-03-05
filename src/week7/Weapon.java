package week7;

import week4.Player;

public class Weapon extends GameItem{
    private int damage;

    public Weapon(double xloc,double yloc,int damage){
        super(xloc,yloc);
        this.damage=damage;
    }
    public double getX(){
        return super.xLoc;
    }

    @Override
    public void use(Player player) {
        player.setDamageDealt(this.damage);
    }
    public String toString(){
        String out=super.toString();
        out+=" damage: "+this.damage+" "+super.toString2();
        return out;
    }

    public static void main(String[] args) {
        /*
        Player p1=new Player(10);
        p1.move(1,1);
        Weapon w=new Weapon(1,2,20);
        w.use(p1);
        System.out.println(p1);
        System.out.println(w);
        HealthPotion h=new HealthPotion(3,4,5);
        System.out.println(h);
        w.move(10,10);
        h.move(20,20);
        System.out.println(w);
        System.out.println(h);
         */
        Weapon w=new Weapon(1,2,20);
        w.move(5,5);
        String temp=w.toString();
        System.out.println(temp);
    }
}
