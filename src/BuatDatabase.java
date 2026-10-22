import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BuatDatabase {

    public static void main(String[] args) throws SQLException {

        String SQL = "CREATE DATABASE IF NOT EXISTS java_mydb";

        Koneksi koneksi = new Koneksi();
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);

        stmt.execute();

        System.out.println("Database Berhasil Dibuat");
        
    }
}
