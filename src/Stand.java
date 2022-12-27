public class Stand extends Kamera implements QR{
    private String NomorStand;
    private String BiayaStand;
    private String NamaStand;
    private String UnivStand;
    private String Jalur;
//    private String Profil; delete fitur

    public Stand(String nomorStand, String biayaStand, String namaStand, String univStand, String jalur) {
        NomorStand = nomorStand;
        BiayaStand = biayaStand;
        NamaStand = namaStand;
        UnivStand = univStand;
        Jalur = jalur;
    }

    public String getNomorStand() {
        return NomorStand;
    }

    public String getBiayaStand() {
        return BiayaStand;
    }

    public String getNamaStand() {
        return NamaStand;
    }

    public String getUnivStand() {
        return UnivStand;
    }

    public String getJalur() {
        return Jalur;
    }

    //interface class QR
    @Override
    public void buatQR() {
        System.out.println("Peserta Stand ADEE Universitas membuat QR");
    }

    @Override
    public void TampilkanQR() {
        System.out.println("Peserta Stand ADEE menampilkan QR yang telah dibuat");
    }

    //abstract class Kamera
    @Override
    public void ScannQRDisini() {
        System.out.println("Peserta Stand ADEE mengarahkan Layar ke Kamera Untuk Scan QR Code");
    }
}
