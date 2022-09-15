public class Warrior {
    public Warrior(){
        name = " ";
        damage = 0;
        hp = 0;
    }
    protected String name;
    protected int hp;
    protected int damage;
    public Warrior (String name, int hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }
    public boolean isAlive(){ return hp > 0; }
    public void takeHit(Warrior w2){
        this.setHp(this.getHp() - w2.damage);
    }
}
