package kg.geektech.game.players;

public class Tank extends Hero {

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
     heroes[1].setDamage(heroes[1].getDamage()+boss.getDamage());
        System.out.println(heroes[1].getDamage());

        }


        }




