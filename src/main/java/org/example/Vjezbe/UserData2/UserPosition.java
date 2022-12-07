package org.example.Vjezbe.UserData2;

public class UserPosition extends UserPoint{
    public int userid;
    public UserPoint position;

    public void parse(String data, int brojIgraca){
        String[] igrac;
        String[] polja;
        String[] separatreData=data.split("/,/");
        for (int i=0; i<brojIgraca; i++){
            igrac=separatreData[i].split(",");
            for (int j=0; j<igrac.length;j++){
                polja=igrac[j].split(":");
                for (int k=1; k< polja.length;k=k+2){
                    userid= Integer.parseInt(polja[k]);
                    System.out.println("Korosnik "+j +" id: "+ userid);

                }

            }
        }
    }
}
