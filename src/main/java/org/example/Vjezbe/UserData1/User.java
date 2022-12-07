package org.example.Vjezbe.UserData1;

public class User {
    public String id;
    public String name;
    public int score;

    public void Parse(String data){
        String[] separateData=data.split("-");
        id=separateData[0];
        name=separateData[1];
        score= Integer.parseInt(separateData[2]);
    }
}
