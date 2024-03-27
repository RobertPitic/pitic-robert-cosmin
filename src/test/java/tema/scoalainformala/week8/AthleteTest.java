package tema.scoalainformala.week8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static tema.scoalainformala.week8.csvFileReader.parseCsvData;

class AthleteTest {
    @Test
    public void testParseCSV() {
        String testData = "AthleteNumber,AthleteName,CountryCode,SkiTimeResult,FirstShootingRange,SecondShooting,ThirdShooting\n" +
                "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        List<Athlete> athletes = parseCsvData(testData);
        assertEquals(3, athletes.size());
        assertEquals("Umar Jorgson", athletes.get(0).getAthleteName());
        assertEquals("Jimmy Smiles", athletes.get(1).getAthleteName());
        assertEquals("Piotr Smitzer", athletes.get(2).getAthleteName());
    }

    @Test
    public void testCalculateStandings() {
        String csvData = "AthleteNumber,AthleteName,CountryCode,SkiTimeResult,FirstShootingRange,SecondShooting,ThirdShooting\n" +
                "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";

        List<Athlete> athletes = parseCsvData(csvData);
        assertEquals("Piotr Smitzer 30:10 (30:10 + 0)", athletes.get(2).toString());
        assertEquals("Jimmy Smiles 30:15 (29:15 + 60)", athletes.get(1).toString());
        assertEquals("Umar Jorgson 30:57 (30:27 + 30)", athletes.get(0).toString());

    }
}