package jerome.eagle.OCR;

public class Character {

    int healthPoints = 0;
    int attackPoints = 0;

    protected void present() {
        System.out.println("Point(s) de vie : " + healthPoints);
        System.out.println("Point(s) d'attaque : " + attackPoints);
    }
}
