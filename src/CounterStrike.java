public class CounterStrike {
    public static void main(String[] args) {
        String teamName1 = "Police";
        double johnPoliceman = 15;
        double frankPoliceman = 17;
        double jackPoliceman = 9;
        double alexPoliceman = 11;
        double walterPoliceman = 10;
        double policeResult = (johnPoliceman + frankPoliceman + jackPoliceman + alexPoliceman + walterPoliceman) / 5;
        String teamName2 = "Terrorists";
        double ivanTerrorist = 5;
        double vladimirTerrorist = 18;
        double ramzanTerrorist = 11;
        double alexandrTerrorist = 7;
        double iosifTerrorist = 15;
        double terroristsResult = (ivanTerrorist + vladimirTerrorist + ramzanTerrorist + alexandrTerrorist + iosifTerrorist) / 5;
        if (policeResult > terroristsResult) {
            System.out.println("Победила команда " + teamName1 + ", набравшая " + policeResult + " очков");
        } else if (policeResult < terroristsResult) {
            System.out.println("Победила команда " + teamName2 + ", набравшая " + terroristsResult + " очков");
        } else {
            System.out.println("Матч между командами " + teamName1 + " и " + teamName2 + " закончился вничью со счётом " + policeResult + " : " + terroristsResult);
        }
    }

}
