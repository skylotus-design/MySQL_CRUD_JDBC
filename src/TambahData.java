import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TambahData {

    public static void main(String[] args) throws SQLException {

        String nama = "Ananda Daniswara";
        String gender ="Laki-laki";
        String kelas = "12A";
        int nilai = 80;
        
        String SQL = "INSERT INTO siswa(nama_siswa, jenis_kelamin, kelas, nilai_ujian) VALUES(?, ?, ?, ?)";

        Koneksi koneksi = new Koneksi();
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);

        stmt.setString(1, nama);
        stmt.setString(2, gender);
        stmt.setString(3, kelas);
        stmt.setInt(4, nilai);

        stmt.execute();

        System.out.println("Data Baru Berhasil ditambahkan!");
    }
    
}
