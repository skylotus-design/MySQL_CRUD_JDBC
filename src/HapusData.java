import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HapusData {

    public static void main(String[] args) throws SQLException {

        Koneksi koneksi = new Koneksi();

        String SQL = "DELETE FROM siswa WHERE id_siswa = ?";

        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);
        stmt.setInt(1, 1); //int kedua adalah id
        stmt.execute();

        System.out.println("Berhasil Dihapus!");
    }
}
