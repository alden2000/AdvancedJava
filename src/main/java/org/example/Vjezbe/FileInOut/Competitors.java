package org.example.Vjezbe.FileInOut;

public class Competitors {
    private String name;
    private String surname;
    private String country;
    private int points;
    private Gender gender;

    @Override
    public String toString() {
        return "/ " + name + " " + surname +
                " / " + country +
                " / points= " + points + "/ " + gender ;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
