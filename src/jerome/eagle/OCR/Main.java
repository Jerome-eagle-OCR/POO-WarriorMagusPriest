package jerome.eagle.OCR;

public class Main {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior();
        warrior1.present();

        Magus magus1 = new Magus();
        magus1.present();

        Object winner = warrior1.winner(magus1);
        System.out.println("(Object return test) " + winner.getClass().getSimpleName() + " wins !\n");

        warrior1.actionOn(magus1);
        winner = warrior1.winner(magus1);
        System.out.println("(Object return test) " + winner.getClass().getSimpleName() + " wins !\n");

        Priest priest1 = new Priest();
        priest1.present();
        priest1.actionOn(magus1);

        magus1.actionOn(warrior1);
        System.out.println("(Object return test) " + magus1.winner(warrior1).getClass().getSimpleName() + " wins !\n");
    }
}
