import java.util.ArrayList;

public class Expo {

    private String NamaExpo;
    private String Tujuan;
    private String Tema;
    private String Waktu;
    private String Lokasi;

    private ArrayList<Universitas> univList = new ArrayList<Universitas>();
    private ArrayList<Stand> standList = new ArrayList<Stand>();
    private ArrayList<Sekolah> sekolahList = new ArrayList<Sekolah>();
    private ArrayList<Peserta> pesertaList = new ArrayList<Peserta>();
    private Panitia panitia;

    public Expo(String namaExpo, String tujuan, String tema,
                String waktu, String lokasi) {
        this.NamaExpo = namaExpo;
        this.Tujuan = tujuan;
        this.Tema = tema;
        this.Waktu = waktu;
        this.Lokasi = lokasi;
    }

    public void AddBagianExpo(ArrayList<Universitas> univList, ArrayList<Stand> standList, ArrayList<Sekolah> sekolahList,
                              ArrayList<Peserta> pesertaList, Panitia panitia){
        this.univList = univList;
        this.standList = standList;
        this.sekolahList = sekolahList;
        this.pesertaList = pesertaList;
        this.panitia = panitia;
    }

    public String getNamaExpo() {
        return NamaExpo;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public String getTema() {
        return Tema;
    }

    public String getWaktu() {
        return Waktu;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public ArrayList<Universitas> getUnivList() {
        return univList;
    }

    public ArrayList<Stand> getStandList() {
        return standList;
    }

    public ArrayList<Sekolah> getSekolahList() {
        return sekolahList;
    }

    public Panitia getPanitia() {
        return panitia;
    }

    public ArrayList<Peserta> getPesertaList() {
        return pesertaList;
    }


    public void getDataExpo(){
        System.out.println("Nama kegiatan Expo : " +getNamaExpo());
        System.out.println("Tujuan Expo        : " +getTujuan());
        System.out.println("Tema Expo          : " +getTema());
        System.out.println("Waktu Pelaksanaan  : "+getWaktu());
        System.out.println("Lokasi Pelaksanaan : " +getLokasi());
        System.out.println();

        //panitia
        System.out.println("Ketua Panitia      : " +getPanitia().getKetua());
        System.out.print("Keterangan QR      : ");
        panitia.buatQR();
        System.out.print("Tampilkan QR       : ");
        panitia.TampilkanQR();
        System.out.println("Asal Universitas   : "+getPanitia().getAsal());
        System.out.println("Jumlah Panitia     : " +getPanitia().getJumlah());
        System.out.print("Panitia Haus       : ");
        panitia.haus();
        System.out.print("Minum menggunakan  : ");
        panitia.menggunakan();
        System.out.print("Kamera Scan Siap   : ");
        panitia.ScannQRDisini();
        System.out.println();

        //clas univ
        System.out.println("Universitas        : ");
        for(Universitas univ : getUnivList()){
            System.out.println("\t - Nama Universitas\t\t\t: "+univ.getNamaUniv());
            System.out.println("\t   Nama Rektor\t\t\t\t: " +univ.getNamaRektor());
            System.out.println("\t   Alamat Universitas\t\t: " +univ.getAlamatUniv());
            System.out.println();
        }

        System.out.println();
        System.out.println("Stand              : ");
        for(Stand stand : getStandList()){
            System.out.println("\t - Nomor Stand\t\t\t\t: "+stand.getNomorStand());
            System.out.println("\t   Biaya Stand\t\t\t\t: "+stand.getBiayaStand());
            System.out.print("\t   Keterangan QR     \t\t: ");
            stand.buatQR();
            System.out.print("\t   Tampilkan QR      \t\t: ");
            stand.TampilkanQR();
            System.out.print("\t   Kamera Scan Siap  \t\t: ");
            stand.ScannQRDisini();
            System.out.println("\t   Nama Stand\t\t\t\t: " +stand.getNamaStand());
            System.out.println("\t   Mahasiswa Universitas\t: " +stand.getUnivStand());
            System.out.println("\t   Jalur yang ditawarkan\t: " +stand.getJalur());
            System.out.println();
        }

        System.out.println();
        System.out.println("Sekolah             : ");
        for(Sekolah sekolah : getSekolahList()){
            System.out.println("\t - Nama Sekolah\t\t\t\t: "+sekolah.getNamaSekolah());
            System.out.println("\t   Nama Kepala Sekolah\t\t: " +sekolah.getNamaKepalaSekolah());
            System.out.println("\t   Alamat Sekolah\t\t\t: " +sekolah.getAlamatSekolah());
            System.out.println();
        }

        System.out.println();
        System.out.println("Peserta             : ");
        for(Peserta peserta : getPesertaList()){
            System.out.print("\t - Keterangan QR     \t\t: ");
            peserta.buatQR();
            System.out.print("\t   Tampilkan QR      \t\t: ");
            peserta.TampilkanQR();
            System.out.print("\t   Kamera Scan Siap  \t\t: ");
            peserta.ScannQRDisini();
            System.out.println("\t   Nama Peserta\t\t\t\t: "+peserta.getNamaPeserta());
            System.out.println("\t   Asal Sekolah\t\t\t\t: " +peserta.getAsalPeserta());
            System.out.println("\t   Kelas\t\t\t\t\t: " +peserta.getKelas());
            System.out.println("\t   Jurusan Impian\t\t\t: " +peserta.getJurusanImpian());
            System.out.println();
        }
    }
}
