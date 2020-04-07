package cl.cadc.ds.creational.factory.factories;

import cl.cadc.ds.creational.factory.domains.Enemy;
import cl.cadc.ds.creational.factory.enums.DifficultyEnum;

import java.util.List;

public class EnemyDifficultyFactory {

    public List<Enemy> getEnemiesByDifficulty(DifficultyEnum difficulty){
        switch (difficulty){
            case EASY :
                EasyDifficultyFactory easyDifficultyFactory = new EasyDifficultyFactory();
                return easyDifficultyFactory.getEnemies();
            case NORMAL:
                NormalDifficultyFactory normalDifficultyFactory = new NormalDifficultyFactory();
                return normalDifficultyFactory.getEnemies();
            case DIFFICULTY:
                DifficultDifficultyFactory difficultDifficultyFactory = new DifficultDifficultyFactory();
                return difficultDifficultyFactory.getEnemies();
            default:
                return null;
        }
    }
}
