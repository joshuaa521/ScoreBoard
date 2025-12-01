public class Scoreboard {
    String team1 = "";
    String team2 = "";

    static int Blue = 0;
    static int Orange = 0;
    static int Yellow = 0;
    static int Green = 0;
    static int Indigo = 0;
    static int Violet = 0;
    static int Red = 0;

    static int points1 = 0;
    static int points2 = 0;

    static boolean firstTeam = true;

    public void constructor(String name1, String name2) {
        team1 = name1;
        team2 = name2;
    }
    // Pass the team/color names to update the correct color variables
    public static void recordPlay(int point, String a, String b) {
        if (point > 0) {
            if (firstTeam) {
                points1 += point;
            } else {
                points2 += point;
            }
            if (a.equals("Orange")) Orange += point;
            if (b.equals("Orange")) Orange += point;
            if (a.equals("Yellow")) Yellow += point;
            if (b.equals("Yellow")) Yellow += point;
            if (a.equals("Blue")) Blue += point;
            if (b.equals("Blue")) Blue += point;
            if (a.equals("Red")) Red += point;
            if (b.equals("Red")) Red += point;
            if (a.equals("Green")) Green += point;
            if (b.equals("Green")) Green += point;
            if (a.equals("Violet")) Violet += point;
            if (b.equals("Violet")) Violet += point;
            if (a.equals("Indigo")) Indigo += point;
            if (b.equals("Indigo")) Indigo += point;
        } else {
            firstTeam = !firstTeam;
        }
    }
    public static String getScoreStatic() {
        if (points1 > points2) return points1 + "-" + points2;
        return points1 + "-" + points2;
    }
}