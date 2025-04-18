package week12.Madden;

public class Player {
    private int spd;
    private int acc;
    private int thp;
    private int tha;
    private Position position;

    public Player(int spd, int acc, int thp, int tha,Position pos) {
        this.spd = spd;
        this.acc = acc;
        this.thp = thp;
        this.tha = tha;
        this.position=pos;
    }

    public int getSpd() {
        return spd;
    }

    public int getAcc() {
        return acc;
    }

    public int getThp() {
        return thp;
    }

    public int getTha() {
        return tha;
    }
}
