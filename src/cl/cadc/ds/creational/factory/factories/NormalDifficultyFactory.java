package cl.cadc.ds.creational.factory.factories;

import cl.cadc.ds.creational.factory.domains.Enemy;
import cl.cadc.ds.creational.factory.domains.Licker;
import cl.cadc.ds.creational.factory.domains.Zombie;
import cl.cadc.ds.creational.factory.enums.DifficultyEnum;

import java.util.ArrayList;
import java.util.List;

import static cl.cadc.ds.creational.factory.enums.DifficultyEnum.*;

public class NormalDifficultyFactory {

    public List<Enemy> getEnemies(){
        //TODO
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Zombie());
        enemies.add(new Zombie());
        enemies.add(new Licker());
        return enemies;
    }
}
