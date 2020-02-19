package kg.geektech.game.players;

import java.util.Random;

public class Golem extends Hero {

    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.SHIELD);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random=new Random();
        int coef=  random.nextInt(50);
        heroes[6].setHealth(boss.getDamage()-coef);
        for (int i = 0; i <5 ; i++) {heroes[i].setHealth(heroes[i].getHealth()+coef);
            System.out.println("Принял урон:"+coef);

        }

        }


        }




