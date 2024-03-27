package tema.scoalainformala.week8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvFileReader {
    Standings athletesStandings = new Standings();


    public void parseAthletes() {
        readAthletesFromFile();
        athletesStandings.sort();
        athletesStandings.printStandings();
    }

    public void readAthletesFromFile() {
        String csvFile = "src/main/java/tema/scoalainformala/week8/athlete.csv";
        String line;
        int numberOfColumns = 7;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] tokens = line.split(",");
                if (tokens.length == numberOfColumns) {
                    Athlete a = new Athlete(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
                    athletesStandings.add(a);
                } else {
                    System.out.println("Line '" + line + "' is not formatted correctly");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Athlete> parseCsvData(String csvData) { // this class is to make tests easier
        String[] lines = csvData.split("\n");
        List<Athlete> athletes = new ArrayList<>();
        for (int i = 1; i < lines.length; i++) {
            String[] data = lines[i].split(",");
            int athleteNumber = Integer.parseInt(data[0]);
            String athleteName = data[1];
            String countryCode = data[2];
            String skiTimeResult = data[3];
            String firstShootingRange = data[4];
            String secondShootingRange = data[5];
            String thirdShootingRange = data[6];
            List<String> shootingRanges = new ArrayList<>();
            for (int j = 4; j < 7; j++) {
                shootingRanges.add(data[j]);
            }
            athletes.add(new Athlete(athleteNumber, athleteName, countryCode, skiTimeResult, firstShootingRange, secondShootingRange, thirdShootingRange));
        }
        return athletes;
    }
}
