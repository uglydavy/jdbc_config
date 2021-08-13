package conn;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Dbconnect implements Conf {
        Connection conn;

        @Override
        public void Connect() {
            try {
                Class.forName(driver);
                System.out.println("driver loaded..");
            }
            catch (ClassNotFoundException e) {
                System.out.println("sorry, the driver could not be found..");
                e.printStackTrace();
            }

            try {
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("you're connected to the database engine..");
            }
            catch (SQLException e) {
                System.out.println("sorry, connection to database engine could not be established.");
                e.printStackTrace();
            }
        }

        @Override
        public void Disconnect () throws SQLException {
            if (conn != null && !conn.isClosed())
                conn.close();
        }
}
