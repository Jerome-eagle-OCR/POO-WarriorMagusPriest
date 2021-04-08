package jerome.eagle.OCR;

public class Magus extends Character {
    protected Weapon spell = new Weapon("l'incantation", 10);
    protected Weapon potion = new Weapon("la potion", 5);

    public Magus() {
        super(15, "Mage");
    }
}