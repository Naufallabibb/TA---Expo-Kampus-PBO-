import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        int pilih;
        Scanner input = new Scanner(System.in);

        //deklarasi object expo
        Expo expo = new Expo("Ahmad Dahlan Education Expo (ADEE)","Memamerkan dan Memperkenalkan Universitas Impian", "Search Your Chance And Choose The Next Step","20 - 21 Desember 2022","Lapangan Kampus 4 Universitas Ahmad Dahlan");

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
        StandList.add(new Stand("01","Gratis","Moral and Intellectual Integrity","Universitas Ahmad Dahlan","PMDK, PSB, CBT, Beasiswa, Nilai UTBK, IUP"));
        StandList.add(new Stand("02","Rp50.000","Mencerahkan Unggul Mendunia","Universitas Muhammadiyah Surakarta","CBT, E-Prestasi, Beasiswa, IUP"));
        StandList.add(new Stand("03","Rp50.000","Dari Muhammadiyah Untuk Bangsa","Universitas Muhammadiyah Malang","Beasiswa, Rapot & TPA, Vokasi, Nilai UTBK, IUP"));
        StandList.add(new Stand("04","Rp50.000","Muda Mendunia","Universitas Muhammadiyah Yogyakarta","Prestasi, CBT, SKL, UTBK, SBMPTMu, Jogjaversitas, International Admission"));
        StandList.add(new Stand("05","Rp50.000","Mengakar Kuat Menjulang Tinggi","Universitas Gadjah Mada","SNMPTN, SBMPTN, UTUL UGM, Prestasi, IUP"));
        StandList.add(new Stand("06","Rp50.000","Veritas, Probitas, Iustitia","Universitas Indonesia","SNMPTN, SBMPTN, SIMAK UI, PPKB, Prestasi, IUP"));
        StandList.add(new Stand("07","Rp50.000","Mangesthi Luhur Ambangun Nagara","Universitas Negeri Surakarta Sebelas Maret","SNMPTN, SBMPTN, UTUL UNS, Prestasi, Rapot, IUP"));
        StandList.add(new Stand("08","Rp50.000","Building Up Noble Future","Universitas Brawijaya","SNMPTN, SBMPTN, Prestasi, Rapot, Selma UB, IUP"));
        StandList.add(new Stand("09","Rp50.000","When Learning is Enjoyment","Universitas Negeri Malang","SNMPTN, SBMPTN, Mandiri, IUP"));
        StandList.add(new Stand("10","Rp50.000","UIN Suka Untuk Bangsa, UIN Suka Mendunia","UIN Sunan Kalijaga","SNMPTN, SBMPTN, IUP, SPAN-PTKIN, UM-PTKIN, Mandiri"));
        StandList.add(new Stand("11","Rp50.000","Disiplin, kejuangan, dan kreativitas","UPNV Yogyakarta","SNMPTN, SBMPTN, Prestasi, IUP, Nilai UTBK, Bela Negara"));
        StandList.add(new Stand("12","Rp50.000","Partum in Futuro","Telkom University","UTG, Rapot, Nilai UTBK, USM, IUP, PJJ, Vokasi, IUP, Beasiswa"));
        StandList.add(new Stand("13","Rp50.000","In Harmonia Progressio","Institut Teknologi Bandung","SNMPTN, SBMPTN, SM-ITB, IUP"));
        StandList.add(new Stand("14","Rp50.000","Mulat sarira angrasa wani","Institut Seni Indonesia Surakarta","SNMPTN, SBMPTN, IUP, Mandiri"));
        StandList.add(new Stand("15","Rp50.000","Seni adalah kita","Institut Seni Indonesia Yogyakarta","SNMPTN, SBMPTN, Mandiri, IUP"));

        //deklarasi object sekolah
        ArrayList<Sekolah> SekolahList = new ArrayList<>();
        SekolahList.add(new Sekolah("SMA Negeri 1 Teladan Yogyakarta","Jumadi","Jl. HOS Cokroaminoto No.10, Pakuncen, Wirobrajan, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 3 Yogyakarta","Kusworo, S.Pd., M.Hum","Jl. Yos Sudarso No.7, RT.05/RW.03, Kotabaru, Gondokusuman, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 5 Yogyakarta","Hj.Fadiyah Suryani, M.Pd.Si","Jl. Nyi Pembayun No.39, Prenggan, Kotagede, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 6 Yogyakarta","Siti Hajarwati, M.Pd.Si.","Jl. C. Simanjuntak No.2, Terban, Gondokusuman, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 7 Yogyakarta","Tutik Sunarti, S.Pd., M.Pd.","Jl. MT. Haryono No.47, Suryodiningratan, Mantrijeron, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 8 Yogyakarta", "Sri Suyatmi, S. Pd.","Jl. Sidobali No.1, Muja Muju, Umbulharjo, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("MAN 1 Yogyakarta","Drs. H. Wiranto Prasetyahadi, M.Pd","Jl. C. Simanjuntak No.60, Terban, Gondokusuman, Yogyakarta, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 1 Sleman","Fadmiyati, S.Pd. M.Pd.","Jl. Magelang Km.14 Medari, Jetis, Caturharjo, Sleman, Sleman, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 1 Wonosari","Muh Taufiq Salyono, S.Pd., M.Pd.Si.","Jl. Brigjen Katamso No.04, Trimulyo I, Kepek, Wonosari, Gunung Kidul, DIY"));
        SekolahList.add(new Sekolah("SMA Negeri 1 Depok","Usep Kasman","Jl.Babarsari, Kel. Caturtunggal, Kec. Depok, Kab. Sleman, Tambak Bayan, Caturtunggal, Sleman, Sleman, DIY"));
        SekolahList.add(new Sekolah("SMA Kolese De Britto Depok","FX. Catur Supatmono, S.Pd., M.Pd.","Demangan Baru, Jl. Laksda Adisucipto No.161, Demangan Baru, Caturtunggal, Depok, Sleman, DIY"));
        SekolahList.add(new Sekolah("SMAN 1 Surakarta","Yusmar Setyobudi","Jl. Monginsidi No.40, Gilingan, Banjarsari, Surakarta, Jawa Tengah"));//solo
        SekolahList.add(new Sekolah("SMAS Regina Pacis Surakarta","Rosalia Widiastuti, M.Pd","Jl. Adi Sucipto No.45, Kerten, Laweyan, Surakarta, Jawa Tengah"));
        SekolahList.add(new Sekolah("SMAS Pangudi Luhur Van Lith","Br. Agustinus Giwal Santoso, FIC, M.M","Jl. Kartini No.1, Balemulyo, Muntilan, Muntilan, Magelang, Jawa Tengah"));//magelang
        SekolahList.add(new Sekolah("SMAS Taruna Nusantara","Mayjen TNI Purn Tono Suratman, S.Ip.","Noyotitan, Banyurojo, Mertoyudan, Magelang, Jawa Tengah"));
        SekolahList.add(new Sekolah("SMAS IT Ibnu Abbas","Kelik Wardiyono","Jl. Klaten - Solo KM.4, Cantelan, Belang Wetan, Klaten Utara, Klaten, Jawa Tengah"));//klaten

        //deklarasi object peserta
        ArrayList<Peserta> PesertaList = new ArrayList<>();
        PesertaList.add(new Peserta("Lukman Shebubakar","SMA Negeri 1 Teladan Yogyakarta","12","Kedokteran"));
        PesertaList.add(new Peserta("Nur Halimah","SMA Negeri 1 Teladan Yogyakarta","11","Farmasi"));
        PesertaList.add(new Peserta("Arini Urbaningrum","SMA Negeri 3 Yogyakarta","12","Keperawatan"));
        PesertaList.add(new Peserta("Divya Jhiehan","SMA Negeri 3 Yogyakarta","12","Teknik Sipil"));
        PesertaList.add(new Peserta("Reymond Chin","SMA Negeri 5 Yogyakarta","10","Teknik Informatika"));
        PesertaList.add(new Peserta("Rayyana Aurora Nur Asysyifa","SMA Negeri 5 Yogyakarta","11","Gizi"));
        PesertaList.add(new Peserta("Hazza Adika Syahira","SMA Negeri 6 Yogyakarta","12","Kedokteran Gigi"));
        PesertaList.add(new Peserta("Alva ","SMA Negeri 6 Yogyakarta","12","Kedokteran Hewan"));
        PesertaList.add(new Peserta("Abdun Nafi","SMA Negeri 7 Yogyakarta","11","Teknik Mesin"));
        PesertaList.add(new Peserta("Regita Cahyaning Astuti","SMA Negeri 7 Yogyakarta","10","Arsitektur"));
        PesertaList.add(new Peserta("Timothy Ronald","SMA Negeri 8 Yogyakarta","10","Teknik Elektro"));
        PesertaList.add(new Peserta("Dennis","SMA Negeri 8 Yogyakarta","11","Teknologi Pangan"));
        PesertaList.add(new Peserta("Gabriella Gracia","MAN 1 Yogyakarta","12","Sastra Inggris"));
        PesertaList.add(new Peserta("Daralianty","MAN 1 Yogyakarta","11","Desain Komunikasi Visual"));
        PesertaList.add(new Peserta("Maulana Imanuel","SMA Negeri 1 Sleman","10","Fotografi"));
        PesertaList.add(new Peserta("Angeline","SMA Negeri 1 Sleman","12","Desain Interior"));
        PesertaList.add(new Peserta("Diniyah Nurmala","SMA Negeri 1 Wonosari","12","Desain Grafis"));
        PesertaList.add(new Peserta("Felicia Putri Tjiasaka","SMA Negeri 1 Wonosari","12","Manajemen"));
        PesertaList.add(new Peserta("Tania Dewi Nur Azmi","SMA Negeri 1 Depok","11","Ilmu Komunikasi"));
        PesertaList.add(new Peserta("Azizi Asadel","SMA Negeri 1 Depok","11","Ilmu Ekonomi"));
        PesertaList.add(new Peserta("Nurrotul Ilma","SMA Kolese De Britto Depo","10","Aktuaria"));
        PesertaList.add(new Peserta("Khofifah Yulia","SMA Kolese De Britto Depo","12","Teknik Industri"));
        PesertaList.add(new Peserta("Aqsarashi ","SMAN 1 Surakarta","12","Teknik Lingkungan"));
        PesertaList.add(new Peserta("Gilbert Franciscus","SMAN 1 Surakarta","11","Teknik Biomedis"));
        PesertaList.add(new Peserta("Gabriel","SMAS Regina Pacis Surakarta","11","Teknik Kimia"));
        PesertaList.add(new Peserta("Khanza Naila","SMAS Regina Pacis Surakarta","10","Kesehatan Masyarakat"));
        PesertaList.add(new Peserta("Shidiq","SMAS Pangudi Luhur Van Lith","11","Geologi"));
        PesertaList.add(new Peserta("Catherin","SMAS Pangudi Luhur Van Lith","12","Ilmu Politik"));
        PesertaList.add(new Peserta("Miracle Sitompul","SMAS Taruna Nusantara","12","Hukum"));
        PesertaList.add(new Peserta("Maria Clarin","SMAS Taruna Nusantara","12","Psikologi"));
        PesertaList.add(new Peserta("Nick Smithy","SMAS IT Ibnu Abbas","12","Hubungan Internasional"));
        PesertaList.add(new Peserta("Bonita Lahitani","SMAS IT Ibnu Abbas","11","Akuntansi"));

        expo.AddBagianExpo(UnivList, StandList, SekolahList, PesertaList, panitia);

        do {
            System.out.println("+=================================+");
            System.out.println("||      PROGRAM EXPO KAMPUS      ||");
            System.out.println("+=================================+");
            System.out.println("|| [1] EXPO                      ||");
            System.out.println("|| [2] PANITIA                   ||");
            System.out.println("|| [3] UNIVERSITAS               ||");
            System.out.println("|| [4] STAND                     ||");
            System.out.println("|| [5] PESERTA                   ||");
            System.out.println("|| [6] SEKOLAH                   ||");
            System.out.println("|| [7] SEMUA DATA                ||");
            System.out.println("|| [8] EXIT                      ||");
            System.out.println("+=================================+");
            System.out.print("Masukkan Pilihan Menu Anda : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                expo.getDataExpo();
            }
            else if (pilih == 2) {
                expo.getDataPanitia();
            }
            else if (pilih == 3) {
                expo.getDataUniversitas();
            }
            else if (pilih == 4) {
                expo.getDataStand();
            }
            else if (pilih == 5) {
                expo.getDataPeserta();
            }
            else if (pilih == 6) {
                expo.getDataSekolah();
            }
            else if (pilih == 7) {
                expo.getDataExpo();
                expo.getDataPanitia();
                expo.getDataUniversitas();
                expo.getDataStand();
                expo.getDataPeserta();
                expo.getDataSekolah();
            }
            else if (pilih == 8) {
                System.out.println("Sampai Jumpa!");
                exit(1);
            }
            else {
                System.out.println("Masukkan Pilihan Dengan Benar!");
                System.out.println();
            }
        }while (true);
    }
}