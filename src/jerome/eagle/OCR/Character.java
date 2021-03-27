package jerome.eagle.OCR;

public class Character {

    private int healthPoints = 0;
    private int attackPoints = 0;


        /**
         * Setter pour modifier les points de vie et d'attaque
         * @param newCharacterHealthPoints les points de vie du nouveau personnage
         * @param newCharacterAttackPoints les points d'attaque du nouveau personnage
         */

        protected void setPoints(int newCharacterHealthPoints, int newCharacterAttackPoints){
            healthPoints = newCharacterHealthPoints;
            attackPoints = newCharacterAttackPoints;
        }

        /**
         * Display character properties.
         */

        protected void present() {
            System.out.println("Point(s) de vie : " + healthPoints);
            System.out.println("Point(s) d'attaque : " + attackPoints);
        }
    }