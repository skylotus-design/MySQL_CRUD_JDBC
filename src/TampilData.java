import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TampilData {
    

    public void tampil() throws SQLException{

        String SQL = "SELECT * FROM siswa";

        Koneksi koneksi = new Koneksi();
        PreparedStatement stmt = koneksi.myKoneksi().prepareStatement(SQL);
        ResultSet hasil = stmt.executeQuery();

        while (hasil.next()) {
            System.out.println(hasil.getString("nama_siswa"));
            System.out.println(hasil.getString("jenis_kelamin"));
            System.out.println(hasil.getString("kelas"));
            System.out.println(hasil.getInt("nilai_ujian"));
        }
    }

    public static void main(String[] args) throws SQLException {
        TampilData t = new TampilData();
        t.tampil();
    }
}
