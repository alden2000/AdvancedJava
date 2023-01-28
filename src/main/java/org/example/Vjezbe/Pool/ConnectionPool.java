package org.example.Vjezbe.Pool;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.example.Vjezbe.Pool.Dao.*;

public class ConnectionPool {
    private List<Connection> freeConnections = new ArrayList<>();
    private List<Connection> usedConnections = new ArrayList<>();

    private static final int POLL_SIZE = 10;


    private ConnectionPool() {
        for(int i=0; i<POLL_SIZE; i++){
            try {
                Connection connection = createConection(URL, USERNAME, PASSWORD);
                freeConnections.add(connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Connection createConection(String URL, String USERNAME, String PASSWORD) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }

    public Connection getConnection(){
        if(freeConnections.isEmpty()){
            throw new RuntimeException("Nema konekcija. E da si juce doso...");
        }else{
            Connection connection=freeConnections.remove(freeConnections.size()-1);
            usedConnections.add(connection);
            return connection;
        }
    }

    public void releseConnectin(Connection connection){
        freeConnections.add(connection);
        usedConnections.remove(connection);
    }
    private static ConnectionPool instance;

    public static ConnectionPool getInstance(){
        if(instance==null){
            instance = new ConnectionPool();
        }
        return instance;
    }
}
