package jerome.eagle.OCR;

public class Main {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior();
        warrior1.present();

        Magus magus1 = new Magus();
        magus1.present();

        warrior1.winner(magus1);
    }
}
