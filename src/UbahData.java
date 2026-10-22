import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UbahData {

    public static void main(String[] args) throws SQLException {
        
        Koneksi koneksi = new Koneksi();

        String SQL = "UPDATE siswa SET nama_siswa = ?, jenis_kelamin = ? WHERE id_siswa = ?";

        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);

        stmt.setString(1, "Tasha Liudmila");
        stmt.setString(2, "Perempuan");
        stmt.setInt(3, 2); //int pertama = urutan ?, int kedua = value id
        
        stmt.execute();

        System.out.println("Data Berhasil diperaharui!");

    }
    
}
