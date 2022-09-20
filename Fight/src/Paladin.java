import java.util.Random;

public class Paladin extends Warrior{
    public Paladin(){}
    public Paladin(String name, int hp, int damage){
        super(name, hp, damage);
    }

    @Override
    public void takeHit(Warrior w2) {
        Random rdm = new Random();
        int chance = rdm.nextInt(10000);
        if (chance < 2000){
            System.out.println("Paladin "+name+" dodge hit!");
        }
        else takeHit(w2);
    }

}
