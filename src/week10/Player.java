package week10;

import week7.GameItem;
import week7.HealthPotion;
import week7.Weapon;

import java.util.ArrayList;

public class Player extends GameItem {
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory;

    //constructor
    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
        this.inventory=new ArrayList<>();
    }
    public void pickupItem(Usable item){
        this.inventory.add(item);
    }
    public int getHP(){
        return this.HP;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void setDamageDealt(int damage){
        this.damageDealt=damage;
    }
    public void setMaxHP(int maxHP){
        this.maxHP=maxHP;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void use(Player p){
        System.out.println("I am morally opposed to using a player");
    }
    public String toString(){
        String out="Health: "+this.getHP()+"/";
        out+=this.maxHP+" damage dealt: "+this.damageDealt;
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(9);
        Player p3=p1;
        int temp=p1.getHP();
        System.out.println(temp);
        p1.takeDamage(5);
        System.out.println(p1);

        GameItem smallHealthPotion=new HealthPotion(3,2,10);
        HealthPotion largeHealth=new HealthPotion(5,4,20);
        HealthPotion temp1=(HealthPotion) smallHealthPotion;
        Weapon weapon=new Weapon(8,8,10);
        largeHealth.drink();
        System.out.println(p1);
        smallHealthPotion.use(p1);
        System.out.println(p1);
        //smallHealthPotion.drink();
        temp1.drink();
        GameItem akward=p2;
        //akward.use(p1);
        p1.pickupItem(largeHealth);
        p1.pickupItem(weapon);
    }
}
