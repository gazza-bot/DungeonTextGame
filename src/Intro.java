/**
 * Kelas Intro digunakan untuk mengatur alur cerita bagian intro dalam permainan DungeonTextGame.
 * Kelas ini menangani input dari pemain, menampilkan pilihan jawaban, serta mencatat nilai moral dan dosa.
 * 
 * Fitur utama:
 * - Menampilkan cerita dan pilihan jawaban pada Arc Intro.
 * - Mengelola penambahan nilai moral dan dosa berdasarkan pilihan pemain.
 * - Menggunakan beberapa kelas lain seperti Identitas, jawabanIntro, dan BtnAndFx untuk mendukung fungsionalitas.
 * 
 * Metode:
 * - runIntro(String nama, boolean gender): Menjalankan seluruh arc intro secara berurutan.
 * - arcPertama(int n, String nama, boolean gender): Menampilkan cerita dan pilihan pada arc tertentu.
 * - baikBuruk(int arc, String name): Menampilkan pilihan baik/buruk dan memproses jawaban pemain.
 * - getTotalMoral(): Mengambil total nilai moral yang didapat pemain selama intro.
 * - getTotalDosa(): Mengambil total nilai dosa yang didapat pemain selama intro.
 * 
 * Catatan:
 * - Kelas ini hanya menangani bagian intro, nilai moral dan dosa akan divalidasi pada arc ending.
 * - Pilihan jawaban dan efek tombol diambil dari kelas lain yang terpisah.
 */
import java.util.Scanner;

public class Intro {
    // Class u/ I/O program.
    private final Scanner input = new Scanner(System.in);
    // panggil Class Identitas untuk Ambil dosa, moral dan set nama.
    private final Identitas nama = new Identitas();
    // Panggil Class untuk Ambil String[] jawaban di Arc I
    private final jawabanIntro jwb = new jawabanIntro();
    // Panggil class BtnAndFx untuk efek dan tombol
    private final BtnAndFx fx = new BtnAndFx();
    private int totalDosa;
    private int totalMoral;

    // untuk Arc Intro Pilihan hanya contain 1 jawaban baik.
    private void baikBuruk(int arc, String name) {
        String[] arrJawab = {
                jwb.getJawaban(arc, 1),
                jwb.getJawaban(arc, 2),
                jwb.getJawaban(arc, 3)
        };

        // Tampilkan Jawaban
        System.out.println("1. " + arrJawab[0]);
        System.out.println("2. " + arrJawab[1]);
        System.out.println("3. " + arrJawab[2]); // Jawaban Baik
        System.out.println("Pilih 1/2/3");
        int answer = input.nextInt();
        input.nextLine();
        switch (answer) {
            case 1 -> nama.addDosa();
            case 2 -> nama.addDosa();
            case 3 -> nama.addMoral();
        }
        System.out.println(name + " : " + arrJawab[answer - 1]);
        totalDosa = nama.getDosa();
        totalMoral = nama.getMoral();
    }

    /**
     * Dispatcher untuk menampilkan scene berdasarkan nomor arc.
     * Menggantikan God Method dengan method-method terpisah untuk clarity.
     */
    private void arcPertama(int n, String nama, boolean gender) {
        switch (n) {
            case 1 -> showInaugurationScene(nama, gender);
            case 2 -> showIntentionScene(nama);
            case 3 -> showPolicyScene(nama, gender);
            default -> System.out.println("Invalid");
        }
    }

    /**
     * Menampilkan scene pelantikan sebagai anggota DPR.
     */
    private void showInaugurationScene(String nama, boolean gender) {
        System.out.println("Hari ini merupakan hari pelantikanmu sebagai Anggota DPR");
        fx.enterButton();
        
        String title = gender ? "Saudara" : "Saudari";
        System.out.println("Pelantik : Dengan menyebut nama Allah yang Maha Pengasih lagi Maha Penyayang " 
                + title + " " + nama + " resmi kami lantik sebagai anggota dpr");
        
        fx.enterButton();
    }

    /**
     * Menampilkan scene tentang niat/motivasi menjadi DPR dan pilihan moral pertama.
     */
    private void showIntentionScene(String nama) {
        fx.delayText("===Arc I : Niat===");
        fx.enterButton();
        System.out.println(nama + " : Hmm.. Hari yang melelahkan sekali, Akhirnya Mimpiku menjadi wakil rakyat terealisasi");
        System.out.println(nama + " : Tapi Kayanya Modal sama gaji jadi wakil rakyat ga sebanding deh, gimana ya?..");
        this.baikBuruk(1, nama);
    }

    /**
     * Menampilkan scene tentang kebijakan keuangan negara dan pilihan moral kedua.
     */
    private void showPolicyScene(String nama, boolean gender) {
        fx.delayText("===Hari Berikutnya===");
        fx.enterButton();
        System.out.println("Hari ini anda ditanyai tentang kebijakan anda tentang Keuangan negara\n"
                + "yang mana kebijakan tersebut adalah kebijakan yang ditetapkan oleh pejabat terdahulu dan dirasa merugikan Masyarakat");
        
        String pronoun = gender ? "Bapak" : "Ibu";
        System.out.println("Wartawan : Bagaimana pendapat " + pronoun 
                + " tentang Kebijakan Pembekuan Rekening yang tidak digunakan selama 3 bulan ?");
        
        this.baikBuruk(2, nama);
    }

    public void runIntro(String nama, boolean gender) {
        this.arcPertama(1, nama, gender);
        this.arcPertama(2, nama, gender);
        this.arcPertama(3, nama, gender);
    }

    /* Getter nilai total moral dan dosa untuk divalidasi di Arc Ending */
    public int getTotalMoral() {
        return this.totalMoral;
    }

    public int getTotalDosa() {
        return this.totalDosa;
    }
}