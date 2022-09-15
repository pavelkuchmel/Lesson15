package Pacckage;

public class Fraction {
    private int nom;
    private int denom;
    // необходимо создавать кроме конструктора с данными, конструктор по-умолчанию
    public Fraction (){
        nom = 0;
        denom = 1;
    }
    public Fraction (int nom, int denom){
        this.nom = nom;
        this.denom = denom;
    }
    public void setNom(int nom){
        this.nom = nom;
    }
    public int getNom(){
        return nom;
    }
    public void setDenom(int denom){
        if (denom <= 0) this.denom = 1;
        else this.denom = denom;
    }
    public int getDenom(){
        return denom;
    }
    public void print(){
        System.out.println(nom+"/"+denom);
    }
    public Fraction mul(Fraction f2){
        Fraction res = new Fraction();
        res.nom = this.nom * f2.nom;
        res.denom = this.denom * f2.denom;
        return res;
    }

}
