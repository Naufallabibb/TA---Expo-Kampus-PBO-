public class Peserta {
    private String NamaPeserta;
    private String AsalPeserta;
    private String Kelas;

    public Peserta(String namaPeserta, String asalPeserta, String kelas) {
        NamaPeserta = namaPeserta;
        AsalPeserta = asalPeserta;
        Kelas = kelas;
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
}
