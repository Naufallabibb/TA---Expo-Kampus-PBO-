public class Stand{
    private String NomorStand;
    private String BiayaStand;
    private String NamaStand;
    private String UnivStand;
    private String Jalur;
    private String Profil;

    public Stand(String nomorStand, String biayaStand, String namaStand, String univStand, String jalur, String profil) {
        NomorStand = nomorStand;
        BiayaStand = biayaStand;
        NamaStand = namaStand;
        UnivStand = univStand;
        Jalur = jalur;
        Profil = profil;
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

    public String getProfil() {
        return Profil;
    }
}
