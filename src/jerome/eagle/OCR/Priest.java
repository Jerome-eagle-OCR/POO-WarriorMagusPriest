package jerome.eagle.OCR;

public class Priest extends Character{

    @Override
    protected void actionOn(Character character) {
        System.out.println("Le " + this.name + " soigne le " + character.name + " qui a " + character.healthPoints + " point(s) de vie :");
        character.healthPoints += this.attackPoints;
        System.out.println("Le " + character.name + " a maintenant " + character.healthPoints + " point(s) de vie\n");
    }

    public Priest() {
        super(20, 5, "Prêtre");
    }
}
