package jerome.eagle.OCR;

public class Warrior extends Character {
    protected Weapon sword = new Weapon("l'épée", 10);
    protected Weapon knife = new Weapon("le couteau", 5);


    public Warrior() {
        super(10, "Guerrier");
    }
}