package jerome.eagle.OCR;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {

        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        @BeforeEach
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }

        @AfterEach
        public void restoreStreams() {
            System.setOut(System.out);
        }

        Character character = new Character(0, 0,  "");

        @Test
        public void Given_NewCharacter_When_DisplayCharacterProperties_Then_DisplayNewCharacterProperties() {
            character.present();
            assertEquals("""
                    Type de personnage :\s
                    Point(s) de vie : 0, Point(s) d'attaque : 0
                    
                    """, outContent.toString().replace("\r\n", "\n"));
        }
}
