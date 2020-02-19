package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int coef = r.nextInt(3);
        if (coef == 0) {    boss.setDamage(boss.getDamage()*coef);

        System.out.println("Босс оглушен");

        }}


        }




