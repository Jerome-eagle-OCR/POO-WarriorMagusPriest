package jerome.eagle.OCR;

public class Character {

    protected int healthPoints;
    protected int attackPoints;
    protected String name;

    public Character(int healthPoints, int attackPoints, String name) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
        this.name = name;
    }

    /**
     * Display character properties.
     */
    protected void present() {
        System.out.println("Type de personnage : " + name);
        System.out.printf("Point(s) de vie : %d, ", healthPoints);
        System.out.println("Point(s) d'attaque : " + attackPoints);
        System.out.println();
    }

    /**
     * substract attacking character's attack points from attacked character's healthPoints
     * @param character attacked character
     */
    protected void actionOn(Character character) {
        System.out.println("Le " + this.name + " attaque le " + character.name + " qui a " + character.healthPoints + " point(s) de vie :");
        character.healthPoints -= this.attackPoints;
        System.out.println("Le " + character.name + " n'a maintenant plus que " + character.healthPoints + " point(s) de vie\n");
    }

    /**
     * Compares characters points (heath or attack)
     * @param thisPoints attacking character's points
     * @param characterPoints attacked character's points
     * @param character attacked character
     * @return return strongest character
     */
    private Object compareCharacters(int thisPoints, int characterPoints, Character character) {
        int comparePoints = thisPoints - characterPoints;
        if (comparePoints > 0) {
            return this;
        } else if (comparePoints < 0) {
            return character;
        } else {
            return "";
        }
        }

    /**
     * Compares two characters first on health points, if tied then on attack points, if tied first character wins
     * @param character attacked character
     * @return final strongest and so winner
     */
    protected Object winner(Character character) {
        System.out.println("Le " + this.name + " se mesure au " + character.name + " :");
        Object strongest = compareCharacters(this.healthPoints, character.healthPoints, character);
        if (strongest.equals("")) {
            strongest = compareCharacters(this.attackPoints, character.attackPoints, character);
            if (strongest.equals("") || strongest.equals(this)) {
                displayWinnerSentence(this.name);
                return strongest;
            } else {
                displayWinnerSentence(character.name);
                return strongest;
            }
        } else if (strongest.equals(this)) {
            displayWinnerSentence(this.name);
            return strongest;
        } else {
            displayWinnerSentence(character.name);
            return strongest;
        }
    }

    /**
     * Display winner sentence
     */
    private void displayWinnerSentence(String andTheWinnerIs) {
            System.out.println("Le plus fort est le " + andTheWinnerIs + "  " + "\\o/");
        }

}