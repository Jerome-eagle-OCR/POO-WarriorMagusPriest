package jerome.eagle.OCR;

public class Warrior extends Character {

    String characterType = "Guerrier";
    public void present() {
        System.out.println("Type de personnage : " + characterType);
        super.present();
        System.out.println();
    }

    public Warrior() {
        setPoints(10, 10);
    }
}