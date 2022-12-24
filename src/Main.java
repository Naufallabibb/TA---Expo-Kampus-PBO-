import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //deklarasi object expo
        Expo expo = new Expo("Ahmad Dahlan Education Expo (ADEE)","Memamerkan dan Memperkenalkan Universitas Impian",
                "Search Your Chance And Choose The Next Step","20 - 21 Desember 2022","Lapangan Kampus 4 Universitas Ahmad Dahlan");

        //deklarasi object panitia
        Panitia panitia = new Panitia("Muhammad Naufal Labib Ramadhan","Universitas Ahmad Dahlan","68");

        //deklarasi object Universitas
        ArrayList<Universitas> UnivList = new ArrayList<>();
        UnivList.add(new Universitas("Universitas Ahmad Dahlan","Dr. Muchlas Arkanuddin, M.T.","Jl. Jend. Ahmad Yani, Banguntapan, Bantul, DIY"));
        UnivList.add(new Universitas("Universitas Muhammadiyah Surakarta","Prof. Dr. Sofyan Anif, M.Si.","Jl. A. Yani, Mendungan, Pabelan, Kartasura, Sukoharjo, Jawa Tengah"));
        UnivList.add(new Universitas("Universitas Muhammadiyah Malang","Dr. Fauzan, M.Pd.","Jl. Bandung No.1, Penanggungan, Klojen, Malang, Jawa Timur"));
        UnivList.add(new Universitas("Universitas Muhammadiyah Yogyakarta","Dr. Ir. Gunawan Budiyanto, MP., IPM.","Jl. Brawijaya, Geblagan, Tamantirto, Kasihan, Bantul, DIY"));
        UnivList.add(new Universitas("Universitas Gadjah Mada","Prof. Dr. Supriyadi, M.Sc.","Jl. Bulaksumur, Caturtunggal, Depok, Sleman, DIY"));
        UnivList.add(new Universitas("Universitas Indonesia","Prof. Ari Kuncoro, S.E., M.A., Ph.D","Jl. Margonda Raya, Pondok Cina, Kota Depok, Jawa Barat"));
        UnivList.add(new Universitas("Universitas Negeri Surakarta Sebelas Maret","Prof Dr rer nat Sajidan, MSi","Jl. Ir. Sutami No.36, Kentingan, Jebres, Surakarta, Jawa Tengah "));
        UnivList.add(new Universitas("Universitas Brawijaya","Prof. Widodo, S.Si., M.Si., Ph.D.Med.Sc.","Jl. Veteran, Ketawanggede, Lowokwaru, Malang, Jawa Timur"));
        UnivList.add(new Universitas("Universitas Negeri Malang","Prof. Dr. Hariyono, M.Pd.","Jl. Semarang No.5, Sumbersari, Lowokwaru, Malang, Jawa Timur"));
        UnivList.add(new Universitas("UIN Sunan Kalijaga","Prof. Phil Al Makin","Jl. Laksda Adisucipto, Papringan, Caturtunggal, Depok, Sleman, DIY"));
        UnivList.add(new Universitas("UPNV Yogyakarta","Prof. Dr. Mohamad Irhas Effendi, M.Si","Jl. SWK Jl. Ring Road Utara No.104, Ngropoh, Condongcatur, Depok, Sleman, DIY"));
        UnivList.add(new Universitas("Telkom University","Prof. Dr. Adiwijaya","Jl. Telekomunikasi. 1, Terusan Buahbatu - Bojongsoang, Telkom University, Sukapura, Dayeuhkolot, Bandung, Jawa Barat"));
        UnivList.add(new Universitas("Institut Teknologi Bandung","Prof. Reini Wirahadikusumah, Ph.D.","Jl. Ganesa No.10, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat"));
        UnivList.add(new Universitas("Institut Seni Indonesia Surakarta","Dr I Nyoman Sukerna, S.Kar., M.Hum.","Jl. Ki Hadjar Dewantara 19, Kentingan, Jebres, Surakarta, Jawa Tengah"));
        UnivList.add(new Universitas("Institut Seni Indonesia Yogyakarta","Prof. Dr. M. Agus Burhan, M.Hum","Jl. Parangtritis No.KM.6, RW.5, Glondong, Panggungharjo, Sewon, Bantul, DIY "));

        //deklarasi object Stand
        ArrayList<Stand> StandList = new ArrayList<>();
        StandList.add(new Stand("01","Gratis","Moral and Intellectual Integrity","Universitas Ahmad Dahlan","PMDK, PSB, CBT, Beasiswa","Universitas Ahmad Dahlan adalah universitas swasta terbaik nomor 1 berdasarkan QS Ranking"));
        StandList.add(new Stand("02","Rp50.000","Mencerahkan Unggul Mendunia","Universitas Muhammadiyah Surakarta","ok","ok"));
        StandList.add(new Stand("03","Rp50.000","Dari Muhammadiyah Untuk Bangsa","Universitas Muhammadiyah Malang","ok","ok"));
        StandList.add(new Stand("04","Rp50.000","Muda Mendunia","Universitas Muhammadiyah Yogyakarta","ok","ok"));
        StandList.add(new Stand("05","Rp50.000","Mengakar Kuat Menjulang Tinggi","Universitas Gadjah Mada","ok","ok"));
        StandList.add(new Stand("06","Rp50.000","Veritas, Probitas, Iustitia","Universitas Indonesia","ok","ok"));
        StandList.add(new Stand("07","Rp50.000","Mangesthi Luhur Ambangun Nagara","Universitas Negeri Surakarta Sebelas Maret","ok","ok"));
        StandList.add(new Stand("08","Rp50.000","Building Up Noble Future","Universitas Brawijaya","ok","ok"));
        StandList.add(new Stand("09","Rp50.000","When Learning is Enjoyment","Universitas Negeri Malang","ok","ok"));
        StandList.add(new Stand("10","Rp50.000","UIN Suka Untuk Bangsa, UIN Suka Mendunia","UIN Sunan Kalijaga","ok","ok"));
        StandList.add(new Stand("11","Rp50.000","Disiplin, kejuangan, dan kreativitas","UPNV Yogyakarta","ok","ok"));
        StandList.add(new Stand("12","Rp50.000","Partum in Futuro","Telkom University","ok","ok"));
        StandList.add(new Stand("13","Rp50.000","In Harmonia Progressio","Institut Teknologi Bandung","ok","ok"));
        StandList.add(new Stand("14","Rp50.000","Mulat sarira angrasa wani","Institut Seni Indonesia Surakarta","ok","ok"));
        StandList.add(new Stand("15","Rp50.000","Seni adalah kita","Institut Seni Indonesia Yogyakarta","ok","ok"));

        //deklarasi object sekolah
        ArrayList<Sekolah> SekolahList = new ArrayList<>();
        SekolahList.add(new Sekolah("ok","ok","ok"));

        //deklarasi object peserta
        ArrayList<Peserta> PesertaList = new ArrayList<>();
        PesertaList.add(new Peserta("ok","ok","ok"));

        //
        expo.AddBagianExpo(UnivList, StandList, SekolahList, PesertaList, panitia);
        expo.getDataExpo();
    }
}