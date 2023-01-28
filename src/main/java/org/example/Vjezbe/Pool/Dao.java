package org.example.Vjezbe.Pool;

import java.util.List;

public interface Dao <E>{
    String URL="jdbc:mysql://localhost:3306/sql_inventory";
    String USERNAME="root";
    String PASSWORD="deni00hena05";

    E create(E entry);

    List<E> getAll();

    E get (long primaryKey);

    E update(E entry);

    void delete(long primaryKey);
}
