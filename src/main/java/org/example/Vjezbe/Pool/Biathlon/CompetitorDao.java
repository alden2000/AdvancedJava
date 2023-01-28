package org.example.Vjezbe.Pool.Biathlon;

import org.example.Vjezbe.Pool.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompetitorDao implements Dao<Competitor> {

    @Override
    public Competitor create(Competitor entry) {
        return null;
    }

    @Override
    public List<Competitor> getAll() {
        List<Competitor> competitors = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM biathlon.competitors;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Competitor competitor = new Competitor();
                competitor.setCompetitorId(resultSet.getLong(1));
                competitor.setName(resultSet.getString(2));
                competitor.setNacionality(resultSet.getString("nacionality"));
                competitor.setPoints(resultSet.getInt("points"));
                competitor.setGender(resultSet.getString("gender"));
                competitors.add(competitor);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return competitors;
    }

    @Override
    public Competitor get(long primaryKey) {
        return null;
    }

    @Override
    public Competitor update(Competitor entry) {
        return null;
    }

    @Override
    public void delete(long primaryKey) {

    }
}
