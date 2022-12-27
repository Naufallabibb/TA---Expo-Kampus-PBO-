public class Peserta extends Kamera implements QR{
    private String NamaPeserta;
    private String AsalPeserta;
    private String Kelas;
    private String JurusanImpian; //tambah fitur

    public Peserta(String namaPeserta, String asalPeserta, String kelas, String jurusanImpian) {
        NamaPeserta = namaPeserta;
        AsalPeserta = asalPeserta;
        Kelas = kelas;
        JurusanImpian = jurusanImpian;
    }

    public String getNamaPeserta() {
        return NamaPeserta;
    }

    public String getAsalPeserta() {
        return AsalPeserta;
    }

    public String getKelas() {
        return Kelas;
    }

    public String getJurusanImpian() {
        return JurusanImpian;
    }

    //interface class QR
    public void buatQR() {
        System.out.println("Peserta ADEE membuat QR");
    }

    @Override
    public void TampilkanQR() {
        System.out.println("Peserta ADEE menampilkan QR Code yang telah dibuat");
    }

    //abstract class Kamera
    @Override
    public void ScannQRDisini() {
        System.out.println("Peserta ADEE mengarahkan Layar ke Kamera QR Untuk Scan QR Code");
    }
}
