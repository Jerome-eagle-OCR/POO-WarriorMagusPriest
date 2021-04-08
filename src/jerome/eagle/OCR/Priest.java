package jerome.eagle.OCR;

public class Priest extends Character{
    protected Weapon pray = new Weapon("une prière", 10);
    protected Weapon holyWater = new Weapon("de l'eau bénite", 5);

    @Override
    protected void actionOn(Character character, Weapon weapon) {
        System.out.println("Le " + this.name + " soigne le " + character.name + " qui a " + character.healthPoints + " point(s) de vie avec " + weapon.weaponName + " qui a " + weapon.attackPoints + " points de guérison :");
        character.healthPoints += weapon.attackPoints;
        System.out.println("Le " + character.name + " a maintenant " + character.healthPoints + " point(s) de vie\n");
    }

    public Priest() {
        super(20, "Prêtre");
    }
}
