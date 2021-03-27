package jerome.eagle.OCR;

public class Magus extends Character {

    String characterType = "Mage";
    public void present() {
        System.out.println("Type de personnage : " + characterType);
        super.present();
        System.out.println();
    }
    public Magus() {
        setPoints(15, 15);
    }
}