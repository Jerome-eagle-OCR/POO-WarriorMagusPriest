package jerome.eagle.OCR;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagusTest {

        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        @BeforeEach
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }

        @AfterEach
        public void restoreStreams() {
            System.setOut(System.out);
        }

        Magus magus = new Magus();

        @Test
        public void Given_NewCharacter_When_DisplayCharacterProperties_Then_DisplayNewCharacterProperties() {
            magus.present();
            assertEquals("""
                    Point(s) de vie : 15
                    Point(s) d'attaque : 15
                    """, outContent.toString().replace("\r\n", "\n"));
        }
    }
