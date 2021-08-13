package conn;

import java.sql.Statement;

public class DBqueries extends Dbconnect {


    public void addUser (String dbname) {
        Connect();
        String sql = "CREATE DATABASE " + dbname;
        Statement stmt;

        try {
            stmt = conn.createStatement();
            stmt.executeLargeUpdate(sql);
            System.out.println("database " + dbname + " was created successfully !");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}