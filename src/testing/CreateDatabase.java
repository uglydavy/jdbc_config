package testing;
import conn.DBqueries;

import java.sql.SQLException;

public class CreateDatabase {
    public static void main (String[] args) throws SQLException {
        DBqueries q = new DBqueries();
        q.addUser("students");
    }
}
