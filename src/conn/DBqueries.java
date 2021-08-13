package conn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBqueries extends Dbconnect {


    public void addUser (String dbname) throws SQLException {
        Connect();
        ResultSet res = null;
        String sql;
        Statement stmt = null;

        try {
            sql = "CREATE DATABASE " + dbname;
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (res != null) {
                res.close();
                stmt.close();
            }
            Disconnect();
        }
    }
}