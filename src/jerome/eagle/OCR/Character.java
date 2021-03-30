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
     * Compares characters points (heath or attack)
     * @param thisPoints attacking character's points
     * @param characterPoints attacked character's points
     * @param character attacked character
     * @return return strongest character
     */
    private String compareCharacters(int thisPoints, int characterPoints, Character character) {
        int comparePoints = thisPoints - characterPoints;
        if (comparePoints > 0) {
            return this.name;
        } else if (comparePoints < 0) {
            return character.name;
        } else {
            return "";
        }
        }

    /**
     * Compares two characters first on health points, if tied then on attack points, if tied first character wins
     * @param character attacked character
     */
    protected void winner(Character character) {
        System.out.println("Le " + this.name + " attaque le " + character.name + " ! Suspens...");
        System.out.println();
        String stongest = compareCharacters(this.healthPoints, character.healthPoints, character);
        if (stongest.equals("")) {
            stongest = compareCharacters(this.attackPoints, character.attackPoints, character);
            if (stongest.equals("")) {
                displayWinnerSentence(this.name);
            } else {
                displayWinnerSentence(stongest);
            }
        } else {
            displayWinnerSentence(stongest);
        }
    }

    /**
     * Display winner sentence
     */
    private void displayWinnerSentence(String andTheWinnerIs) {
            System.out.println("Le gagnant est : le " + andTheWinnerIs + "  " + "\\o/");
        }
}