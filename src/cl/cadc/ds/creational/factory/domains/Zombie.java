package cl.cadc.ds.creational.factory.domains;

public class Zombie implements Enemy {

    private long health;
    private long hurt;

    public Zombie(){
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

    }

    @Override
    public String toString() {
        return "Zombie{" +
                "health=" + health +
                ", hurt=" + hurt +
                '}';
    }
}
