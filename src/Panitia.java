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
    public void menggunakan() {
        System.out.println("Gelas dan tangan kanan");
    }

    @Override
    public void haus() {
        System.out.println("Minum air putih");
    }

    //interface class QR
    @Override
    public void buatQR() {
        System.out.println("Panitia ADEE membuat QR");
    }

    @Override
    public void TampilkanQR() {
        System.out.println("Menampilkan QR yang telah dibuat Panitia");
    }

    //abstract class Kamera
    @Override
    public void ScannQRDisini() {
        System.out.println("Panitia ADEE mengarahkan Layar ke Kamera Untuk Scan QR Code");
    }

    //interface register
    @Override
    public void Login() {
        System.out.println("Memasukkan E-mail Panitia");
    }

    @Override
    public void Password() {
        System.out.println("Memasukkan Password Panitia");
    }
}
