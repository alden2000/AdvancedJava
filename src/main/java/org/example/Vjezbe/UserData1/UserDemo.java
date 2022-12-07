package org.example.Vjezbe.UserData1;

public class UserDemo {
    public static void main(String[] args) {
        User user=new User();
        String korisnik="177-Peter-5000";
        user.Parse(korisnik);
        System.out.println("ID: "+ user.id);
        System.out.println("Ime: "+ user.name);
        System.out.println("Score: "+ user.score);
    }
}
