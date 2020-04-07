package cl.cadc.ds.creational.factory.domains;

public class Licker implements Enemy {

    private long health;
    private long hurt;

    public Licker(){
        this.health = 100;
        this.hurt = 50;
    }

    public long getHealth() {
        return health;
    }

    public long getHurt() {
        return hurt;
    }

    @Override
    public void attack() {
        //TODO
    }

    @Override
    public String toString() {
        return "Licker{" +
                "health=" + health +
                ", hurt=" + hurt +
                '}';
    }
}
