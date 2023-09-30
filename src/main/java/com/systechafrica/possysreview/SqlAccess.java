package com.systechafrica.possystemreviewed;

import java.sql.Connection;
import java.sql.ResultSet;

public interface SqlAccess {
    Connection connection();
    ResultSet  excutionQuery(String query);
    int executeUpdate(String query);
    void close();


    
}
