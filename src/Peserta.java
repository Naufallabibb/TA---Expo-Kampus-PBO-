public class Peserta extends Kamera implements QR, Register{
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
    @Override
    public String buatQR() {
        return ("Peserta ADEE membuat QR");
    }

    @Override
    public String TampilkanQR() {
        return ("Peserta ADEE menampilkan QR Code yang telah dibuat");
    }

    //abstract class Kamera
    @Override
    public String ScannQRDisini() {
        return ("Peserta ADEE mengarahkan Layar ke Kamera QR Untuk Scan QR Code");
    }

    //interface register
    @Override
    public String Login() {
        return ("Memasukkan E-mail Peserta");
    }

    @Override
    public String Password() {
        return ("Memasukkan Password Peserta");
    }

}
