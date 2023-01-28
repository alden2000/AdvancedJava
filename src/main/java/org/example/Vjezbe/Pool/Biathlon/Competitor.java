package org.example.Vjezbe.Pool.Biathlon;

public class Competitor {
    private long competitorId;
    private String name;
    private String nacionality;
    private int points;

    private CompGender Gender;

    @Override
    public String toString() {
        return "Competitor{" +
                "competitorId=" + competitorId +
                ", name='" + name + '\'' +
                ", nacionality='" + nacionality + '\'' +
                ", points=" + points +
                ", Gender=" + Gender +
                '}';
    }

    public long getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(long competitor_id) {
        this.competitorId = competitor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGender(String gender) {
        this.Gender = CompGender.valueOf(gender);
    }

    public CompGender getGender() {
        return Gender;
    }
}
