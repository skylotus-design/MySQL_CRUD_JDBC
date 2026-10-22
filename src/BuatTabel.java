import java.sql.SQLException;
import java.sql.PreparedStatement;

public class BuatTabel {

    public static void main(String[] args) throws SQLException {

        Koneksi koneksi = new Koneksi();

        String SQL = "CREATE TABLE IF NOT EXISTS siswa(id_siswa INT PRIMARY KEY AUTO_INCREMENT, nama_siswa VARCHAR(100) NOT NULL, jenis_kelamin VARCHAR(150) NOT NULL, kelas VARCHAR(50) NOT NULL, nilai_ujian INT(10) NOT NULL)";

        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);
        stmt.execute();

        System.out.println("Tabel Berhasil Dibuat");
        
    }
}
