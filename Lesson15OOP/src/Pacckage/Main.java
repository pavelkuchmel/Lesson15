package Pacckage;

public class Main {

    public static void main(String[] args) {
                /*
-------Lesson 15 - 15.09.2022------------------------------------------------------------------------------------
         */
        //Классы хронятся в MetaSpace
        //Объекты в Heap
        //Сссылки на объекты классов в Stack
        Fraction f1 = new Fraction();
        f1.print();
        f1.setNom(2);
        f1.setDenom(9);
        //f1.print();
        Fraction f2 = new Fraction(5,9);
        f2.print();
        Fraction f3 = f1.mul(f2);
        f3.print();
        /*Fruits apple = new Fruits("Apple", "red", "sour", 55);
        Fruits cucumber = new Fruits("Cucumber", "green", "neutral", 100);
        Fruits banana = new Fruits("Banana");
        banana.setColor("Yellow");
        banana.setTaste("Sweet");
        banana.setWeight(80);
        cucumber.show();*/
    }
}
