import java.util.Random;

public class jawabanIntro {
    private final Random rand = new Random();

    // 0 - 2 untuk bagian 1 dan 3 - 5 untuk bagian 2
    private final String[] jawabJahat = { "Korupsi Dikit-Dikit kayanya aman deh, mayan tuh bisa balik modal",
            "Ambil dana APBN aja kali ya, dikit doang kok, siapa juga yang tau",
            "Comot uang BPJS dikit aja per orang Rp. 500, 500 X 250 juta, kaya gue!!",
            "Saya sendiri kurang mengerti ya, kok ada kebijakan begitu",
            "Hahaha, ya nanti saya liat lagi dan tinjau lagi ya, baru saya jawab" };

    private final String[] jawabJahat1 = {
            "Duh, kayanya mending gausah niat niat amat dah jadi DPR",
            "Gajiku kecil, ngapain aku baik baik sama rakyat, cari cari muka aja udah",
            "Bikin rakyat menderita aja, biar gajiku yang kecil ini keliatan gede HAHAHA",
            "Saya rasa itu kurang bagus ya, Gimana nanti saya kalau mau nabung?",
            "Kalau Masyarakat rekeningnya ga dipake ya wajar dibekukan, siapa tau kan dipakek buat Kriminal"
    };

    private final String[] jawabBaik = {
            "Astaga, Mikir apa Aku tadi",
            "Nggak nggak, aku gamau jadi orang Korup, tujuanku hanya menyejahterakan Rakyat",
            "Nggak, Amanah ini besar dan udah dipercayakan ke aku, jangan mengacau Bro",
            "Memang pada awalnya kebijakan ini akan menimbulkan Kekhawatiran yang masif bagi masyarakat, karena ini masih baru kami akan menijau sejauh mana kebijakan ini dilaksanakan",
            "Saya memahami kekhawatiran masyarakat. Kebijakan ini seharusnya bukan untuk menghukum rakyat, tapi untuk memastikan sistem keuangan kita tetap sehat"
    };
    // int arc digunakan untuk inisialisasi bagian mana yang diambil jawabannya, untuk n sebagai jawaban baik , jahat atau netral
    // method akan return invalid jika arc nya tidk sesuai, maupun n nya ga sesuai
    public String getJawaban(int arc, int n) {
        switch (arc) {
            case 1 -> {
                switch (n) {
                    case 1 -> {
                        return jawabJahat[rand.nextInt(3)];
                    }
                    case 2 -> {
                        return jawabJahat1[rand.nextInt(3)];
                    }
                    case 3 -> {
                        return jawabBaik[rand.nextInt(3)];
                    }
                    default -> {
                        return "Invalid Input";
                    }
                }
            }
            case 2 -> {
                switch (n) {
                    case 1 -> {
                        return jawabJahat[rand.nextInt(2) + 3];
                    }
                    case 2 -> {
                        return jawabJahat1[rand.nextInt(2) + 3];
                    }
                    case 3 -> {
                        return jawabBaik[rand.nextInt(2) + 3];
                    }
                    default -> {
                        return "Invalid Input";
                    }
                }
            }    
            default -> {
                return "Invalid";
            }
        }
    }
}