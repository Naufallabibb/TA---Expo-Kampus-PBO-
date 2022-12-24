public class Sekolah {
    private String NamaSekolah;
    private String NamaKepalaSekolah;
    private String AlamatSekolah;

    public Sekolah(String namaSekolah, String namaKepalaSekolah, String alamatSekolah) {
        NamaSekolah = namaSekolah;
        NamaKepalaSekolah = namaKepalaSekolah;
        AlamatSekolah = alamatSekolah;
    }

    public String getNamaSekolah() {
        return NamaSekolah;
    }

    public String getNamaKepalaSekolah() {
        return NamaKepalaSekolah;
    }

    public String getAlamatSekolah() {
        return AlamatSekolah;
    }
}
