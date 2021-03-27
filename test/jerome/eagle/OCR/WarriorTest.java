package jerome.eagle.OCR;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {

        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        @BeforeEach
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }

        @AfterEach
        public void restoreStreams() {
            System.setOut(System.out);
        }

        Warrior warrior = new Warrior();

        @Test
        public void Given_NewWarrior_When_DisplayCharacterProperties_Then_DisplayNewWarriorProperties() {
            warrior.present();
            assertEquals("""
                    Type de personnage : Guerrier
                    Point(s) de vie : 10
                    Point(s) d'attaque : 10
                    
                    """, outContent.toString().replace("\r\n", "\n"));
        }
    }
