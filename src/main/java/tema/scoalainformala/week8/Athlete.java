package tema.scoalainformala.week8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Athlete {

    int athleteNumber;
    String athleteName;
    String countryCode;
    String skiTimeResult;
    String firstShootingRange;
    String secondShootingRange;
    String thirdShootingRange;
    String finalTimeResult;

    Athlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
        this.finalTimeResult = addPenalties(skiTimeResult, calculatePenalty());
    }

    String addPenalties(String time, int penalty) {
        SimpleDateFormat df = new SimpleDateFormat("mm:ss");
        try {
            Date date = df.parse(time);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.SECOND, penalty);
            return df.format(cal.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "0";
    }

    int calculatePenalty() {
        List<String> shootingResults = new ArrayList<>();
        int missedShots = 0;

        shootingResults.add(firstShootingRange);
        shootingResults.add(secondShootingRange);
        shootingResults.add(thirdShootingRange);

        for (String result : shootingResults) {
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == 'o')
                    missedShots++;
            }
        }
        return missedShots * 10;
    }

    String getFinalTimeResult() {
        return finalTimeResult;
    }

    @Override
    public String toString() {
        return athleteName + " " + finalTimeResult + " (" +
                skiTimeResult + " + " + calculatePenalty() + ")";
    }

    public String getAthleteName() {
        return athleteName;
    }
}
