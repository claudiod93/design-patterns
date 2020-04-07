package cl.cadc.ds.creational.factory;

import cl.cadc.ds.creational.factory.enums.DifficultyEnum;
import cl.cadc.ds.creational.factory.factories.EnemyDifficultyFactory;

public class Game {

    public static void main(String[] args){
        EnemyDifficultyFactory enemyDifficultyFactory = new EnemyDifficultyFactory();
        //Player one choose easy mode
        System.out.println(enemyDifficultyFactory.getEnemiesByDifficulty(DifficultyEnum.EASY));
        //Player two choose normal mode
        System.out.println(enemyDifficultyFactory.getEnemiesByDifficulty(DifficultyEnum.NORMAL));
        //Player three choose easy difficult
        System.out.println(enemyDifficultyFactory.getEnemiesByDifficulty(DifficultyEnum.DIFFICULTY));
    }
}
