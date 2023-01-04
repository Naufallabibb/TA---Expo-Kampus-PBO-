public class Panitia extends Kamera implements Pakai, QR, Register {
    private String ketua;
    private String asal;
    private String jumlah;

    public Panitia(String ketua, String asal, String jumlah) {
        this.ketua = ketua;
        this.asal = asal;
        this.jumlah = jumlah;
    }

    public String getKetua() {
        return ketua;
    }

    public String getAsal() {
        return asal;
    }

    public String getJumlah() {
        return jumlah;
    }


    //interface class Pakai
    @Override
    public String menggunakan() {
        return ("Gelas dan tangan kanan");
    }

    @Override
    public String haus() {
        return ("Minum air putih");
    }

    //interface class QR
    @Override
    public String buatQR() {
        return ("Panitia ADEE membuat QR");
    }

    @Override
    public String TampilkanQR() {
        return ("Menampilkan QR yang telah dibuat Panitia");
    }

    //abstract class Kamera
    @Override
    public String ScannQRDisini() {
        return ("Panitia ADEE mengarahkan Layar ke Kamera Untuk Scan QR Code");
    }

    //interface register
    @Override
    public String Login() {
        return ("Memasukkan E-mail Panitia");
    }

    @Override
    public String Password() {
        return ("Memasukkan Password Panitia");
    }
}
