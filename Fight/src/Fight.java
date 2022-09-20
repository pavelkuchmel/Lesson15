public class Fight {

    public static void main(String[] args) {

	Knight k = new Knight("vasya", 50, 10);
	//System.out.println(k);
	Paladin p = new Paladin("neVasya", 50, 10);
	//System.out.println(p);
	while (k.isAlive()&&p.isAlive()){
        System.out.println(k.getName()+" hits " + p.getName());
        p.takeHit(k);
        System.out.println(p);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!p.isAlive()) System.out.println(k.getName()+" wins!");
        else System.out.println(p.getName()+" wins");
        System.out.println(p.getName()+" hits "+k.getName());
        k.takeHit(p);
        System.out.println(k);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (k.isAlive()) System.out.println(k.getName()+" wins!");
        else System.out.println(p.getName()+" wins");
    }

    }
}
