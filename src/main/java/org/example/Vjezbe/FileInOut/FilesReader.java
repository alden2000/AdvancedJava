package org.example.Vjezbe.FileInOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilesReader{
    public String fileName;

    public FilesReader(String fileName){
        this.fileName=fileName;
    }

    public List<Competitors> readCometitorsList(){
        ArrayList<Competitors> competitorsList=new ArrayList<>();
        try(Scanner scanner=new Scanner(new File(fileName))){
            while (scanner.hasNext()){
                String line= scanner.nextLine();
                String[] lineFileds=line.split(",");
                Competitors competitors=new Competitors();
                competitors.setSurname(lineFileds[0]);
                competitors.setName(lineFileds[1]);
                competitors.setCountry(lineFileds[2]);
                int points=Integer.parseInt(lineFileds[3]);
                competitors.setPoints(points);
                Gender spol=lineFileds[4].equals("Male")? Gender.M : Gender.F;
                competitors.setGender(spol);
                competitorsList.add(competitors);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return competitorsList;
    }

}
