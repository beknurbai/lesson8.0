package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int coef = r.nextInt(2)+3;
       heroes[0].setDamage(coef * heroes[0].getDamage());
        System.out.println("Warriors damage increased in: " + coef);
    }
}
