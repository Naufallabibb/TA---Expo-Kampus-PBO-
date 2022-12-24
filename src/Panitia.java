public class Panitia implements Pakai{
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

    //getinterface
    @Override
    public void menggunakan() {
        System.out.println("Gelas dan tangan kanan");
    }

    @Override
    public void haus() {
        System.out.println("Minum air putih");
    }
}
