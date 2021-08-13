package conn;

import java.sql.SQLException;

interface Conf {
    String
            ipaddress = "localhost:3306",
            url = "jdbc:mysql://" + ipaddress,
            username = "root",
            password = "rootroot",
            driver = "com.mysql.cj.jdbc.Driver";

    void Connect ();
    void Disconnect() throws SQLException;
}
