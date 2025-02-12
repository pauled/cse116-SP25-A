package week4;

public class Player {
    private int maxHP;
    private int HP;
    private int damageDealt;

    //constructor
    public Player(int maxHP){
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
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
    public void setMaxHP(int maxHP){
        this.maxHP=maxHP;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public String toString(){
        String out="Health: "+this.getHP()+"/";
        out+=this.maxHP;
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
    }
}
