/**
 * Kelas Arc2 merepresentasikan sebuah bagian dari permainan dungeon berbasis teks,
 * di mana pemain akan menjalani sebuah arc cerita kedua dengan pilihan moral.
 * Kelas ini mengelola interaksi pemain, narasi, dan konsekuensi dari pilihan yang diambil.
 *
 * Fitur utama:
 * - Menampilkan narasi cerita secara bertahap.
 * - Memberikan pilihan kepada pemain untuk menerima atau menolak suatu tindakan.
 * - Menghitung total dosa atau moral berdasarkan keputusan pemain.
 *
 * Konstruktor:
 * Arc2(String name)
 *   Membuat objek Arc2 dengan nama pemain yang diberikan.
 *
 * Metode:
 * - runArc2(String nama): Menjalankan arc kedua dengan narasi dan pilihan moral.
 * - getDosa(): Mengambil nilai total dosa yang didapat pemain.
 * - getMoral(): Mengambil nilai total moral yang didapat pemain.
 *
 * Penggunaan:
 * Kelas ini digunakan sebagai bagian dari alur cerita utama, di mana pemain akan
 * dihadapkan pada pilihan yang mempengaruhi skor moral dan dosa mereka.
 *
 * Catatan:
 * Kelas ini bergantung pada kelas lain seperti Identitas, JawabanArc2, dan BtnAndFx
 * untuk menjalankan fungsionalitas penuh.
 */
import java.util.Random;
import java.util.Scanner;

public class Arc2 {
    // Constants untuk magic numbers
    private static final int TERIMA_DOSA = 5;
    private static final int TOLAK_MORAL = 3;
    private static final int BASE_NARASI = 11;
    private static final int TERIMA_JAWABAN_OFFSET = 3;
    private static final int TOLAK_JAWABAN_OFFSET = 1;
    private static final int RANDOM_RANGE = 2;
    private static final int[] TERIMA_NARASI_INDICES = {18, 19, 20, 21};
    private static final int[] TOLAK_NARASI_INDICES = {17, 19, 20, 22};
    private static final int TERIMA_RANDOM_NARASI_OFFSET = 14;
    private static final int TOLAK_RANDOM_NARASI_OFFSET = 12;

    private final Random rand = new Random();
    private final Scanner input = new Scanner(System.in);
    private JawabanArc2 jwb;
    private final BtnAndFx fx = new BtnAndFx();
    private int totalDosa;
    private int totalMoral;

    public Arc2(String name) {
        // Constructor menerima nama namun tidak disimpan karena sudah ada di JawabanArc2
    }

    /**
     * Menampilkan tawaran dan memproses pilihan pemain (Terima/Tolak).
     */
    private void baikBuruk() {
        fx.delayText(jwb.getNarasi(BASE_NARASI));
        System.out.print("Tolak / Terima :");
        String acc = input.nextLine().trim();

        if (acc.equalsIgnoreCase("Terima")) {
            handleTerima();
        } else if (acc.equalsIgnoreCase("Tolak")) {
            handleTolak();
        } else {
            System.out.println("Invalid input");
        }
    }

    /**
     * Menangani pilihan "Terima" dengan narasi dan nilai dosa sesuai.
     */
    private void handleTerima() {
        totalDosa = TERIMA_DOSA;
        fx.delayText(jwb.getJawaban(rand.nextInt(RANDOM_RANGE) + TERIMA_JAWABAN_OFFSET));
        fx.delayText(jwb.getNarasi(rand.nextInt(RANDOM_RANGE) + TERIMA_RANDOM_NARASI_OFFSET));
        playNarasiSequence(TERIMA_NARASI_INDICES);
    }

    /**
     * Menangani pilihan "Tolak" dengan narasi dan nilai moral sesuai.
     */
    private void handleTolak() {
        totalMoral = TOLAK_MORAL;
        fx.delayText(jwb.getJawaban(rand.nextInt(RANDOM_RANGE) + TOLAK_JAWABAN_OFFSET));
        fx.delayText(jwb.getNarasi(rand.nextInt(RANDOM_RANGE) + TOLAK_RANDOM_NARASI_OFFSET));
        playNarasiSequence(TOLAK_NARASI_INDICES);
    }

    /**
     * Menampilkan sequence narasi dari array indeks yang diberikan.
     * Helper method untuk menghindari duplikasi code.
     */
    private void playNarasiSequence(int[] narasiIndices) {
        for (int index : narasiIndices) {
            fx.delayText(jwb.getNarasi(index));
        }
    }

    public void runArc2(String nama) {
        this.jwb = new JawabanArc2(nama);
        for (int i = 1; i <= 10; i++) {
            fx.delayText(jwb.getNarasi(i));
        }
        this.baikBuruk();
    }

    public int getDosa() {
        return this.totalDosa;
    }

    public int getMoral() {
        return this.totalMoral;
    }
}