import java.util.Random;

public class Knight extends Warrior {
    Knight(){}

    Knight(String name, int hp, int damage){
        super(name, hp, damage);
    }

    @Override
    public int getDamage() {
        Random rdm = new Random();
        int chance = rdm.nextInt(10000);
        if (chance < 1000) {
            System.out.println("Critical hit!");
            return 2*super.getDamage();
        }
        else return super.getDamage();
    }
}
