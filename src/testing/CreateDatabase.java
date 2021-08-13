package testing;
import conn.DBqueries;

public class CreateDatabase {
    public static void main (String[] args){
        DBqueries q = new DBqueries();
        q.addUser("Students");
    }
}
