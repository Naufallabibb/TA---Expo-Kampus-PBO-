public class Universitas {
    private String NamaUniv;
    private String NamaRektor;
    private String AlamatUniv;

    public Universitas(String namaUniv, String namaRektor, String alamatUniv) {
        NamaUniv = namaUniv;
        NamaRektor = namaRektor;
        AlamatUniv = alamatUniv;
    }

    public String getNamaUniv() {
        return NamaUniv;
    }

    public String getNamaRektor() {
        return NamaRektor;
    }

    public String getAlamatUniv() {
        return AlamatUniv;
    }
}
