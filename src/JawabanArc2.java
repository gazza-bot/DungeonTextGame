
public class JawabanArc2 {
        private String nama;

        public JawabanArc2() {
                this.nama = "Player";
        }

        public JawabanArc2(String a) {
                this.nama = a;
        }

        // String narasi 1 - 10 adalah dialog dengan staff yang mana merupakan prolog cerita Arc II
        // String narasi 11 tawaran , 12 13 jawaban Pak Dito, 14 15 reaksi kita jika menyetujui tawaran pak dito
        // String 16 jika kita denial dengan pak dito
        // String 17 18 narasi selanjutnya (Tergantung reaksi) 17 untuk positif, 18 untuk negatif
        // 19 20 lanjut narasi dan 21 untuk positif dan 22 untuk negatif
        public String getNarasi(int n) {
                final String[] narasi = {
                                "===Arc II : Nikmatnya Kekuasaan===\nSuatu Ketika Staff kementrian keuangan sedang melakukan Pemeriksaan Laporan Keuangan Projek",
                                "Staff : Mohon maaf pak, ini Ada tamu, bapak Dito selaku pemimpin proyek ini",
                                nama + " : Loh, Memang sudah Ada Perjanjian dengan Saya?",
                                "Staff : Mohon maaf bapak, Beliau bilangnya sudah kontak dengan Pak Presiden \n jadi kami tidak enak menolaknya pak",
                                nama + " : Baiklah, Siapkan Ruangan saja",
                                "Staff : Beliau ingin bertemu disini pak, Tidak perlu repot - repot katanya",
                                nama + " : (Apasih mau dia)",
                                nama + " : Baiklah",
                                "Terjadi percakapan intens mengenai projek dengan pak dito, namun tiba tiba pak dito menawarkan sesuatu",
                                "...........",
                                "Pak Dito : Baik pak untuk melancarkan projek kita, Saya ada sedikit ini buat bapak,\ntapi saya mohon untuk laporannya diloloskan saja nanti keuntungannya buat kita 50% masing - masing pak",
                                "Pak Dito : Sudahlah pak, jangan munafik begitu sudah terima saja",
                                "Pak Dito : Halah, Yang Dulu-dulu juga melek dikasih ginian, udah terima aja",
                                "Pak Dito : (Tertawa tipis) Baik pak, senang bisa bekerja sama dengan bapak",
                                "Pak Dito : Nah, bagus kayanya bapak udah paham cara mainnya",
                                "Pak Dito : Bapak ini naif sekali, Baik kalau memang itu keputusan bapak, semoga lancar ya pak(Tersenyum Sinis)",
                                nama + " : Saya tidak peduli pak, Kejujuran akan selalu saya junjung",
                                nama + " : Hahaha, Bapak bisa saja.",
                                "Pak Dito kemudian Keluar dari ruangan Anda",
                                nama + " : (Membatin) Ada ada saja",
                                "Menerima Gratifikasi mulai menjadi normal bagi anda, anda mulai merasakan kenikmatan menjadi penguasa & mulai berpikiran untuk melakukan Korupsi",
                                "Ujian Demi Ujian kian menerpa, tawaran gelap dari para elit dan bahkan ancaman pembunuhan jika berpegang teguh pada keadilan \nmembuatmu Stres dalam mengemban amanah besar ini.."
                };
                return narasi[n - 1];
        }

        // String jawaban 1 - 2 untuk menolak (Positif)
        // String jawaban 3 - 4 untuk menerima tawaran (Negatif)
        public String getJawaban(int n) {
                n -= 1;
                final String[] jawaban = {
                                nama + " : Aduh mohon maaf pak, saya tidak menerima gratifikasi apapun",
                                nama + " : Saya tidak bisa terima, Apapun bentuknya berapapun jumlahnya",
                                nama + " : Baik pak ini saya terima sebagai bentuk penghormatan terhadap bapak",
                                nama + " : Baik pak Aman... , dijamin lolos pak valid A1"
                };

                return jawaban[n];
        }
}