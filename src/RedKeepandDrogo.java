import javax.sound.midi.Soundbank;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class RedKeepandDrogo {

    public static void main(String[] args) throws InterruptedException {

        Intro.intro();
        Game c = new Game();
        c.createChar();
        Game m = new Game();
        m.modifyChar();


    }
}