public class JawabanArc3 {
    private String nama;

    public JawabanArc3(){
        this.nama = "Player";
    }

    public JawabanArc3(String nama){
        this.nama = nama;
    }

    public String getNarasi(int n){
        
        // NARASI 1 untuk dosa melebihi moral Atau moral tidak lebih dari sama dengan dua kali jumlah dosa
        final String[] NARASI = {
            "Suatu Hari Pak Dito datang kembali ke kantor anda dengan membawa Projek Besar yang akan melibatkan banyak Dana\nBeliau pun memintamu untuk bertemu dengannya membahas sebuah 'Penawaran'",
            "Pak Dito menawarkan jika anda meloloskan projek nya maka anda akan dapat persenan yang besar bahkan (Triliunan) katanya",
            "......\nTiba tiba anda mendapatkan suatu ancaman dari seseorang yang menyatakan akan menyusahkan hidupmu\njika tidak melancarkan Projek Bedah Rumah yang sedang diusut proposalnya di Kementrian Keuangan",
            "Setelah Anda menelusuri siapa yang ada dibalik projek ini\nAnda menemukan suatu fakta yang mengejutkan bahwa\nPak Dito adalah orang dibalik projek tersebut",
            nama + " : Tawaran dari pak Dito benar benar menggiurkan, Siapa tak tergiur dengan Uang segitu banyaknya",
            nama + " : Bener - Bener brengsek pak Dito ini, berapa kali aku disuruh korup sama dia hahah, tapi gapapa yang penting aku kaya",
            nama + " : Ini gabisa dibiarkan, aku harus cari bukti",
            "Kemudian Anda menghampiri pak Dito sesuai dengan Ancaman yang telah ia berikan padamu\nPak Dito senang karena anda akhirnya mengikuti jalan permainan dia",
            "Padahal sebenarnya anda melakukan semua diskusi dengan merekam suara, bahkan menggunakan kamera tersembunyi untuk mengumpulkan bukti",
            "Pak Dito : Baik, Saya rasa sudah cukup kita membincangkan ini, saya sungguh senang anda akhirnya mengikuti jejak yang sudah sudah",
            nama + " : Iya pak, saya pikir juga kenapa saya jujur sama Masyarakat, toh mereka juga nggak tau",
            "Anda Berhenti mencari kebenaran dan membenarkan praktik korupsi\nTak lama, penyidik KPK menemukan kejanggalan dalam projek Bedah Rumah ini\nmengetahui hal ini rencana Pak Dito berjalan sangat mulus",
            "Sebenarnya semua pertemuan yang direncanakan merupakan siasat Pak Dito untuk merebut kekuasaan sebagai menteri Keuangan\nPak Dito diam-diam menusukmu dari belakang dan menjebloskan mu ke Penjara",
            "Semua Bukti sudah terkumpul rapi, kemudian anda melaporkan seluruh tabiat busuknya didepan publik\nDan akhirnya Tikus paling rakus di negeri ini dapat ditumpaskan\n=== The End ==="

        };
        if(n > NARASI.length) return "Invalid";
        
        return NARASI[n - 1];
    }
}
