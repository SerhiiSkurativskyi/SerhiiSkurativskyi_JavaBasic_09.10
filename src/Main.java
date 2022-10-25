public class Main {
    public static void main(String[] args) {
        double[] arrayTeam1 = {25, 26, 35, 37, 18, 27, 38, 33, 22, 18, 21, 29, 31, 35, 25, 26, 33, 38, 18, 29, 38, 33, 22, 18, 21};
        double[] arrayTeam2 = {35, 36, 23, 28, 29, 19, 28, 22, 32, 38, 31, 19, 21, 25, 29, 24, 34, 32, 19, 19, 23, 23, 32, 19, 32};

        System.out.println("Ages of Team 1 players, years: " + arrayTeam1[0] + ", " + arrayTeam1[1] + ", " + arrayTeam1[2] + ", " + arrayTeam1[3] + ", " + arrayTeam1[4] + ", " + arrayTeam1[5] + ", " + arrayTeam1[6] + ", " + arrayTeam1[7] + ", " + arrayTeam1[8] + ", " + arrayTeam1[9] + ", " + arrayTeam1[10] + ", " + arrayTeam1[11] + ", " + arrayTeam1[12] + ", " + arrayTeam1[13] + ", " + arrayTeam1[14] + ", " + arrayTeam1[15] + ", " + arrayTeam1[16] + ", " + arrayTeam1[17] + ", " + arrayTeam1[18] + ", " + arrayTeam1[19] + ", " + arrayTeam1[20] + ", " + arrayTeam1[21] + ", " + arrayTeam1[22] + ", " + arrayTeam1[23] + ", " + arrayTeam1[24]);
        System.out.println("Ages of Team 2 players, years: " + arrayTeam2[0] + ", " + arrayTeam2[1] + ", " + arrayTeam2[2] + ", " + arrayTeam2[3] + ", " + arrayTeam2[4] + ", " + arrayTeam2[5] + ", " + arrayTeam2[6] + ", " + arrayTeam2[7] + ", " + arrayTeam2[8] + ", " + arrayTeam2[9] + ", " + arrayTeam2[10] + ", " + arrayTeam2[11] + ", " + arrayTeam2[12] + ", " + arrayTeam2[13] + ", " + arrayTeam2[14] + ", " + arrayTeam2[15] + ", " + arrayTeam2[16] + ", " + arrayTeam2[17] + ", " + arrayTeam2[18] + ", " + arrayTeam2[19] + ", " + arrayTeam2[20] + ", " + arrayTeam2[21] + ", " + arrayTeam2[22] + ", " + arrayTeam2[23] + ", " + arrayTeam2[24]);

        double team1MediumAge = (arrayTeam1[0] + arrayTeam1[1] + arrayTeam1[2] + arrayTeam1[3] + arrayTeam1[4] + arrayTeam1[5] + arrayTeam1[6] + arrayTeam1[7] + arrayTeam1[8] + arrayTeam1[9] + arrayTeam1[10] + arrayTeam1[11] + arrayTeam1[12] + arrayTeam1[13] + arrayTeam1[14] + arrayTeam1[15] + arrayTeam1[16] + arrayTeam1[17] + arrayTeam1[18] + arrayTeam1[19] + arrayTeam1[20] + arrayTeam1[21] + arrayTeam1[22] + arrayTeam1[23] + arrayTeam1[24]) / arrayTeam1.length;
        double team2MediumAge = (arrayTeam2[0] + arrayTeam2[1] + arrayTeam2[2] + arrayTeam2[3] + arrayTeam2[4] + arrayTeam2[5] + arrayTeam2[6] + arrayTeam2[7] + arrayTeam2[8] + arrayTeam2[9] + arrayTeam2[10] + arrayTeam2[11] + arrayTeam2[12] + arrayTeam2[13] + arrayTeam2[14] + arrayTeam2[15] + arrayTeam2[16] + arrayTeam2[17] + arrayTeam2[18] + arrayTeam2[19] + arrayTeam2[20] + arrayTeam2[21] + arrayTeam2[22] + arrayTeam2[23] + arrayTeam2[24]) / arrayTeam2.length;

        System.out.println("Medium age of Team 1 players, year: " + team1MediumAge);
        System.out.println("Medium age of Team 2 players, year: " + team2MediumAge);
    }
}