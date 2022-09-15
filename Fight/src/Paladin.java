import java.util.Random;

public class Paladin extends Warrior{
    @Override
    public int getDamage() {
        Random rdm = new Random();
        int chance = rdm.nextInt(10000);
        if (chance < 1000) return 2*super.getDamage();
        else return super.getDamage();
    }
}
