package Pacckage;

public class Fruits {
    private String name;
    private String color;
    private String taste;
    private int weight;

    public Fruits(String name, String color, String taste, int weight){
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.weight = weight;
    }
    public Fruits(String name){
        this.name = name;
        color = "grey";
        taste = "salt";
        weight = 666;
    }
    public int getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public String getTaste() {
        return taste;
    }
    public void show(){
        System.out.printf("%s: \nColor: %s\nTaste: %s\nWeight: %d", name, color, taste, weight);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
