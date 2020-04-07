package cl.cadc.ds.creational.factory.factories;

import cl.cadc.ds.creational.factory.domains.Enemy;
import cl.cadc.ds.creational.factory.domains.Zombie;

import java.util.ArrayList;
import java.util.List;

public class EasyDifficultyFactory {

    public List<Enemy> getEnemies(){
        //TODO
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Zombie());
        enemies.add(new Zombie());
        enemies.add(new Zombie());
        return enemies;
    }
}
