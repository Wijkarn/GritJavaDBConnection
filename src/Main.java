import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("App started deez nutz");

        //initera objekt
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        while (true){
            System.out.println("Gör ditt menyval:");
            System.out.println("----------------");
            System.out.println("1. Mata in data till DB.");
            System.out.println("2. Hämta data till DB.");
            System.out.println("3. Avsluta.");
        }
    }
}