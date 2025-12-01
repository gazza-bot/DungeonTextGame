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
    private String nama;
    private final Random rand = new Random();
    public Arc2(String name){
        this.nama = name;
    }
    private final Scanner input = new Scanner(System.in);
    private final Identitas id = new Identitas();
    private JawabanArc2 jwb ;
    private final BtnAndFx fx = new BtnAndFx();
    private int totalDosa;
    private int totalMoral;


    private void baikBuruk(){
        fx.delayText(jwb.getNarasi(11));
        System.out.print("Tolak / Terima :");
        String acc = input.nextLine(); 
        if(acc.equalsIgnoreCase("Terima")){
            totalDosa = 5;
            // ambil jawaban dari getJawaban dengan random 0 dan 1 ditambah 2
            fx.delayText(jwb.getJawaban(rand.nextInt(2) + 3));
            // ambil narasi di getNarasi dengan random bound 2 ditambah 14
            fx.delayText(jwb.getNarasi(rand.nextInt(2) + 14));
            // ambil narasi di getNarasi 18
            fx.delayText(jwb.getNarasi(18)); 
            fx.delayText(jwb.getNarasi(19));
            fx.delayText(jwb.getNarasi(20));
            fx.delayText(jwb.getNarasi(21));
        }else if(acc.equalsIgnoreCase("Tolak")){
            totalMoral = 3;
            fx.delayText(jwb.getJawaban(rand.nextInt(2) + 1));
            fx.delayText(jwb.getNarasi(rand.nextInt(2) + 12));
            fx.delayText(jwb.getNarasi(17));
            fx.delayText(jwb.getNarasi(19));
            fx.delayText(jwb.getNarasi(20));
            fx.delayText(jwb.getNarasi(22));
        }else{
            System.out.println("Invalid input");
            baikBuruk();
        }  
    }

    public void runArc2(String nama){
        this.jwb = new JawabanArc2(nama);
        for(int i = 1; i <= 10;i++){
            fx.delayText(jwb.getNarasi(i));
        }
        this.baikBuruk();
    }

    public int getDosa(){
        return this.totalDosa;
    }

    public int getMoral(){
        return this.totalMoral;
    }
    
}