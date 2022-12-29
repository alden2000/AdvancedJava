package org.example.Vjezbe.FileInOut;

import java.io.FileWriter;
import java.util.List;

public class CompetitorsDemo {
    public static void main(String[] args) {
        FilesReader filesReader = new FilesReader("src/main/resources/listeIn.txt");
        List<Competitors> competitorsList = filesReader.readCometitorsList();
        for (Competitors competitors : competitorsList) {
            System.out.println(competitors);
        }
        System.out.println();
        for (Competitors i : competitorsList) {
            System.out.println(i);
        }
        try {
            FileWriter fileWriter = new FileWriter("Output.txt");
            for (Competitors competitors : competitorsList) {
                fileWriter.write(competitors + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
