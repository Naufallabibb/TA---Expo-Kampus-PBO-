import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
                              ArrayList<Peserta> pesertaList, Panitia panitia) {
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

    public void getDataExpo() {
        //class expo
        System.out.println("Nama kegiatan Expo : " + getNamaExpo());
        System.out.println("Tujuan Expo        : " + getTujuan());
        System.out.println("Tema Expo          : " + getTema());
        System.out.println("Waktu Pelaksanaan  : " + getWaktu());
        System.out.println("Lokasi Pelaksanaan : " + getLokasi());
        System.out.println();

        // cetak ouput ke file txt
        try (PrintWriter writer = new PrintWriter(new File("expo.txt"))) {
            writer.println("Data expo : ");
            writer.println("Nama kegiatan Expo : " + getNamaExpo());
            writer.println("Tujuan Expo        : " + getTujuan());
            writer.println("Tema Expo          : " + getTema());
            writer.println("Waktu Pelaksanaan  : " + getWaktu());
            writer.println("Lokasi Pelaksanaan : " + getLokasi());
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void getDataPanitia() {
        //class panitia
        System.out.println("Ketua Panitia      : " + getPanitia().getKetua());
        System.out.println("Masukkan Email     : " + getPanitia().Login()); //interface
        System.out.println("Masukkan Password  : " + getPanitia().Password()); //interface
        System.out.println("Keterangan QR      : " + getPanitia().buatQR()); //interface
        System.out.println("Tampilkan QR       : " + getPanitia().TampilkanQR()); //interface
        System.out.println("Kamera Scan Siap   : " + getPanitia().ScannQRDisini()); //abstract
        System.out.println("Asal Universitas   : " + getPanitia().getAsal());
        System.out.println("Jumlah Panitia     : " + getPanitia().getJumlah());
        System.out.println("Panitia Haus       : " + getPanitia().haus()); //interface
        System.out.println("Minum menggunakan  : " + getPanitia().menggunakan()); //interface
        System.out.println();

        // cetak ouput ke file txt
        try (PrintWriter writer = new PrintWriter(new File("panitia.txt"))) {
            writer.println("Data panitia : ");
            writer.println("Ketua Panitia      : " + getPanitia().getKetua());
            writer.println("Masukkan Email     : " + getPanitia().Login()); //interface
            writer.println("Masukkan Password  : " + getPanitia().Password()); //interface
            writer.println("Keterangan QR      : " + getPanitia().buatQR()); //interface
            writer.println("Tampilkan QR       : " + getPanitia().TampilkanQR()); //interface
            writer.println("Kamera Scan Siap   : " + getPanitia().ScannQRDisini()); //abstract
            writer.println("Asal Universitas   : " + getPanitia().getAsal());
            writer.println("Jumlah Panitia     : " + getPanitia().getJumlah());
            writer.println("Panitia Haus       : " + getPanitia().haus()); //interface
            writer.println("Minum menggunakan  : " + getPanitia().menggunakan()); //interface
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void getDataUniversitas() {
        //class universitas
        System.out.println("Universitas        : ");
        for (Universitas univ : getUnivList()) {
            System.out.println("\t - Nama Universitas\t\t\t: " + univ.getNamaUniv());
            System.out.println("\t   Nama Rektor\t\t\t\t: " + univ.getNamaRektor());
            System.out.println("\t   Alamat Universitas\t\t: " + univ.getAlamatUniv());
            System.out.println();
        }
        // cetak ouput ke file txt
        try (PrintWriter writer = new PrintWriter(new File("universitas.txt"))) {
            writer.println("Data Universitas : ");
            for (Universitas univ : getUnivList()) {
                writer.println("\t - Nama Universitas\t\t\t: " + univ.getNamaUniv());
                writer.println("\t   Nama Rektor\t\t\t\t: " + univ.getNamaRektor());
                writer.println("\t   Alamat Universitas\t\t: " + univ.getAlamatUniv());
                writer.println();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void getDataStand() {
        //class stand
        System.out.println();
        System.out.println("Stand              : ");
        for (Stand stand : getStandList()) {
            System.out.println("\t - Masukkan Email    \t\t: " + stand.Login()); //interface
            System.out.println("\t   Masukkan Password \t\t: " + stand.Password()); //interface
            System.out.println("\t   Keterangan QR     \t\t: " + stand.buatQR()); //interface
            System.out.println("\t   Tampilkan QR      \t\t: " + stand.TampilkanQR()); //interface
            System.out.println("\t   Kamera Scan Siap  \t\t: " + stand.ScannQRDisini()); //abstract
            System.out.println("\t   Nomor Stand\t\t\t\t: " + stand.getNomorStand());
            System.out.println("\t   Biaya Stand\t\t\t\t: " + stand.getBiayaStand());
            System.out.println("\t   Nama Stand\t\t\t\t: " + stand.getNamaStand());
            System.out.println("\t   Mahasiswa Universitas\t: " + stand.getUnivStand());
            System.out.println("\t   Jalur yang ditawarkan\t: " + stand.getJalur());
            System.out.println();
        }
        // cetak ouput ke file txt
        try (PrintWriter writer = new PrintWriter(new File("stand.txt"))) {
            writer.println("Data Stand : ");
                for (Stand stand : getStandList()) {
                    writer.println("\t - Masukkan Email    \t\t: " + stand.Login()); //interface
                    writer.println("\t   Masukkan Password \t\t: " + stand.Password()); //interface
                    writer.println("\t   Keterangan QR     \t\t: " + stand.buatQR()); //interface
                    writer.println("\t   Tampilkan QR      \t\t: " + stand.TampilkanQR()); //interface
                    writer.println("\t   Kamera Scan Siap  \t\t: " + stand.ScannQRDisini()); //abstract
                    writer.println("\t   Nomor Stand\t\t\t\t: " + stand.getNomorStand());
                    writer.println("\t   Biaya Stand\t\t\t\t: " + stand.getBiayaStand());
                    writer.println("\t   Nama Stand\t\t\t\t: " + stand.getNamaStand());
                    writer.println("\t   Mahasiswa Universitas\t: " + stand.getUnivStand());
                    writer.println("\t   Jalur yang ditawarkan\t: " + stand.getJalur());
                    writer.println();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void getDataSekolah() {
        //class sekolah
        System.out.println();
        System.out.println("Sekolah             : ");
        for (Sekolah sekolah : getSekolahList()) {
            System.out.println("\t - Nama Sekolah\t\t\t\t: " + sekolah.getNamaSekolah());
            System.out.println("\t   Nama Kepala Sekolah\t\t: " + sekolah.getNamaKepalaSekolah());
            System.out.println("\t   Alamat Sekolah\t\t\t: " + sekolah.getAlamatSekolah());
            System.out.println();
        }
        // cetak ouput ke file txt
        try (PrintWriter writer = new PrintWriter(new File("sekolah.txt"))) {
            writer.println("Data Sekolah : ");
            for (Sekolah sekolah : getSekolahList()) {
                writer.println("\t - Nama Sekolah\t\t\t\t: " + sekolah.getNamaSekolah());
                writer.println("\t   Nama Kepala Sekolah\t\t: " + sekolah.getNamaKepalaSekolah());
                writer.println("\t   Alamat Sekolah\t\t\t: " + sekolah.getAlamatSekolah());
                writer.println();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void getDataPeserta() {
        //class peserta
        System.out.println();
        System.out.println("Peserta             : ");
        for (Peserta peserta : getPesertaList()) {
            System.out.println("\t - Masukkan Email    \t\t: " + peserta.Login()); //interface
            System.out.println("\t   Masukkan Password \t\t: " + peserta.Password()); //interface
            System.out.println("\t   Keterangan QR     \t\t: " + peserta.buatQR()); //interface
            System.out.println("\t   Tampilkan QR      \t\t: " + peserta.TampilkanQR()); //interface
            System.out.println("\t   Kamera Scan Siap  \t\t: " + peserta.ScannQRDisini()); //abstract
            System.out.println("\t   Nama Peserta\t\t\t\t: " + peserta.getNamaPeserta());
            System.out.println("\t   Asal Sekolah\t\t\t\t: " + peserta.getAsalPeserta());
            System.out.println("\t   Kelas\t\t\t\t\t: " + peserta.getKelas());
            System.out.println("\t   Jurusan Impian\t\t\t: " + peserta.getJurusanImpian());
            System.out.println();
        }
        // cetak ouput ke file txt
        try (PrintWriter writer = new PrintWriter(new File("peserta.txt"))) {
            writer.println("Data Peserta : ");
            for (Peserta peserta : getPesertaList()) {
                writer.println("\t - Masukkan Email    \t\t: " + peserta.Login()); //interface
                writer.println("\t   Masukkan Password \t\t: " + peserta.Password()); //interface
                writer.println("\t   Keterangan QR     \t\t: " + peserta.buatQR()); //interface
                writer.println("\t   Tampilkan QR      \t\t: " + peserta.TampilkanQR()); //interface
                writer.println("\t   Kamera Scan Siap  \t\t: " + peserta.ScannQRDisini()); //abstract
                writer.println("\t   Nama Peserta\t\t\t\t: " + peserta.getNamaPeserta());
                writer.println("\t   Asal Sekolah\t\t\t\t: " + peserta.getAsalPeserta());
                writer.println("\t   Kelas\t\t\t\t\t: " + peserta.getKelas());
                writer.println("\t   Jurusan Impian\t\t\t: " + peserta.getJurusanImpian());
                writer.println();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}