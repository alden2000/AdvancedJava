package org.example.Vjezbe.Pool.Biathlon;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class BiathlonDemo {
    public static void main(String[] args) {
        CompetitorDao competitorDao=new CompetitorDao();
        List<Competitor> competitors=competitorDao.getAll();
        for(Competitor competitor:competitors){
            System.out.println(competitor);
        }
        try {
            FileWriter fileWriter = new FileWriter("Biathlon.txt");
            competitors.stream()
                    .sorted(Comparator.comparing(Competitor::getCompetitorId))
                    .map(c -> c.getName() + ", " + c.getNacionality() + ", " + c.getPoints())
                    .forEach(c -> {
                        try {
                            fileWriter.write(c + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            fileWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
