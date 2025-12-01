import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        read();
        System.out.println("Violet: " + Scoreboard.Violet);
        System.out.println("Indigo: " + Scoreboard.Indigo);
        System.out.println("Orange: " + Scoreboard.Orange);
        System.out.println("Yellow: " + Scoreboard.Yellow);
        System.out.println("Red: " + Scoreboard.Red);
        System.out.println("Green: " + Scoreboard.Green);
        System.out.println("Blue: " + Scoreboard.Blue);
    }

    public static void read() throws FileNotFoundException {
        File f = new File("ScoreBoard.txt");
        Scanner s = new Scanner(f);
        Scoreboard names = new Scoreboard();

        while (s.hasNext()) {

            String a = "";
            String b = "";

            if (!s.hasNextInt()) {
                a = s.next();
                b = s.next();
                names.constructor(a, b);
            }

            int points = s.nextInt();
            Scoreboard.recordPlay(points, a, b);
        }

        s.close();
    }
}
