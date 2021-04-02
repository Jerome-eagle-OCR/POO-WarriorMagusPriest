package jerome.eagle.OCR;

public class Main {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior();
        warrior1.present();

        Magus magus1 = new Magus();
        magus1.present();

        Character strongest = warrior1.amIStrongerThanYou(magus1);
        System.out.println("(Object return test) " + strongest.name + " gagne !\n");

        warrior1.actionOn(magus1);
        strongest = warrior1.amIStrongerThanYou(magus1);
        System.out.println("(Object return test) " + strongest.name + " gagne !\n");

        Priest priest1 = new Priest();
        priest1.present();
        priest1.actionOn(magus1);

        magus1.actionOn(warrior1);
        System.out.println("(Object return test) " + magus1.amIStrongerThanYou(warrior1).name + " gagne !\n");
    }
}
