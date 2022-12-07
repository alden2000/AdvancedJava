package org.example.Vjezbe.UserData2;

public class UserPointDemo {
    public static void main(String[] args) {
        UserPosition userPosition=new UserPosition();
        String pozicija="id:10,x:10,y:20/,/id:5,x:30,y:40/,/id:2,x:2,y:7";
        userPosition.parse(pozicija,3);
    }
}
