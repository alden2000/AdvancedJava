package org.example.Vjezbe.Pool.Biathlon;

public enum CompGender {
    M("Male"), F("Female");

    private String compGender;

    CompGender(String compGender) {
        this.compGender = compGender;
    }

    public String getCompGender() {
        return compGender;
    }

    public void setCompGender(String compGender) {
        this.compGender = compGender;
    }
}
