package conn;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Dbconnect implements Conf {
        Connection conn;

        @Override
        public void Connect() {
            try {
                System.out.println("driver loaded successfully...");
                Class.forName(driver);
            }
            catch (ClassNotFoundException e) {
                System.out.println("sorry, the driver could not be found...");
                e.printStackTrace();
            }

            try {
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("connection with the database engine established successfully...");
            }
            catch (SQLException e) {
                System.out.println("sorry, could not establish connection with the database engine...");
                e.printStackTrace();
            }
        }

        @Override
        public void Disconnect () throws SQLException {
            if (conn != null && !conn.isClosed())
                conn.close();
        }
}
