import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public Connection myKoneksi() throws SQLException{

        String url = "jdbc:mysql://localhost:3306/java_mydb"; //hapus java_mydb jika database belum dibuat
        String user = "root";
        String pass = "";

        Connection kon = DriverManager.getConnection(url, user, pass);

        
        System.out.println("Koneksi berhasil");
        return kon;
    }

    public static void main(String[] args) throws SQLException {
        Koneksi koneksi = new Koneksi();
        koneksi.myKoneksi();
    }

}

