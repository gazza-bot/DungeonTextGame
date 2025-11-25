import java.util.Random;

public class jawabanIntro {
    private final Random rand = new Random();

    // Array jawaban untuk setiap kategori (Jahat, Jahat1, Baik)
    private final String[] jawabJahat = { 
        "Korupsi Dikit-Dikit kayanya aman deh, mayan tuh bisa balik modal",
        "Ambil dana APBN aja kali ya, dikit doang kok, siapa juga yang tau",
        "Comot uang BPJS dikit aja per orang Rp. 500, 500 X 250 juta, kaya gue!!",
        "Saya sendiri kurang mengerti ya, kok ada kebijakan begitu",
        "Hahaha, ya nanti saya liat lagi dan tinjau lagi ya, baru saya jawab" 
    };

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

    /**
     * Mendapatkan jawaban berdasarkan arc dan kategori jawaban.
     * Menggantikan nested switch dengan map-based approach untuk readability lebih baik.
     * 
     * @param arc Arc number (1 atau 2). Arc 1 range 0-2, Arc 2 range 3-4
     * @param n Kategori jawaban (1=Jahat, 2=Jahat1, 3=Baik)
     * @return Jawaban random dari kategori yang sesuai
     */
    public String getJawaban(int arc, int n) {
        String[] selectedArray = selectJawabanArray(n);
        if (selectedArray == null) {
            return "Invalid Input";
        }
        
        int range = (arc == 1) ? 3 : 2;
        int offset = (arc == 2) ? 3 : 0;
        
        return selectedArray[rand.nextInt(range) + offset];
    }

    /**
     * Memilih array jawaban berdasarkan kategori.
     * Menggantikan switch statement untuk kejelasan.
     */
    private String[] selectJawabanArray(int n) {
        return switch (n) {
            case 1 -> jawabJahat;
            case 2 -> jawabJahat1;
            case 3 -> jawabBaik;
            default -> null;
        };
    }
}