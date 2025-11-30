/**
 * Kelas Arc3 merepresentasikan bagian ketiga dari alur permainan DungeonTextGame.
 * Kelas ini menangani logika pemilihan antara tindakan baik dan buruk berdasarkan recap dosa dan moral.
 * Pemain akan diberikan pilihan yang mempengaruhi nilai dosa dan moral mereka.
 *
 * Properti:
 * - nama: Nama pemain.
 * - totalDosa: Total dosa yang didapatkan pemain pada arc ini.
 * - recapDosa: Rekap dosa dari arc sebelumnya.
 * - totalMoral: Total moral yang didapatkan pemain pada arc ini.
 * - recapMoral: Rekap moral dari arc sebelumnya.
 * - input: Scanner untuk menerima input dari pemain.
 * - fx: Objek BtnAndFx untuk efek dan delay teks.
 * - jwb: Objek JawabanArc3 untuk narasi dan jawaban khusus pada arc ini.
 *
 * Konstruktor:
 * Arc3(String nama, int recapDosa, int recapMoral)
 *   Membuat objek Arc3 dengan nama pemain, rekap dosa, dan rekap moral dari arc sebelumnya.
 *
 * Metode:
 * - baikBuruk(int n): Menampilkan pilihan kepada pemain dan mengubah nilai dosa/moral berdasarkan pilihan.
 * - runArc3(String nama): Menjalankan arc ketiga berdasarkan perbandingan recap dosa dan moral.
 * - getDosa(): Mengembalikan total dosa yang didapatkan pada arc ini.
 * - getMoral(): Mengembalikan total moral yang didapatkan pada arc ini.
 */
import java.util.Scanner;

public class Arc3 {
    private String nama;
    private int totalDosa;
    private int recapDosa;
    private int totalMoral;
    private int recapMoral;
    private final Scanner input = new Scanner(System.in);
    private final BtnAndFx fx = new BtnAndFx();
    JawabanArc3 jwb;

    public Arc3(String nama,int recapDosa, int recapMoral){
        this.nama = nama; 
        this.recapDosa = recapDosa;
        this.recapMoral = recapMoral;
        jwb = new JawabanArc3(nama);
    }

    private void baikBuruk(int n){
        switch(n){
            case 1 ->{
                System.out.println("Apakah Anda Akan menerima Tawaran Pak Dito");
                System.out.print("YA / TIDAK ");
                String pilihan = input.nextLine();
                if(pilihan.equalsIgnoreCase("YA")){
                    this.totalDosa = recapMoral + 1;
                     fx.delayText(jwb.getNarasiKhusus(1));
                    }else if(pilihan.equalsIgnoreCase("TIDAK")){
                        this.totalMoral = recapDosa + 1;
                        fx.delayText(jwb.getNarasiKhusus(2));
                }else{
                    System.out.println("Invalid");
                }
            }
            
            case 2 ->{
                System.out.println("Lanjutkan investigasi atau Korupsi saja\n(YA / TIDAK) ");
                String pilihan = input.nextLine();
                if(pilihan.equalsIgnoreCase("YA")){
                    this.totalDosa = recapMoral + 1; 
                    fx.delayText(jwb.getNarasi(11));
                    fx.delayText(jwb.getNarasi(14));
                }else if(pilihan.equalsIgnoreCase("TIDAK")){
                    this.totalMoral = recapDosa + 1;
                    fx.delayText(jwb.getNarasi(11));
                    fx.delayText(jwb.getNarasi(12));
                    fx.delayText(jwb.getNarasi(13));
                }else{
                    System.out.println("Invalid");
                }
            }

            default -> {
                System.out.println("invalid");
            }
        }
    }

    public void runArc3(String nama){
        if(recapDosa >= recapMoral){
            fx.delayText(jwb.getNarasi(1));
            fx.delayText(jwb.getNarasi(2));
            this.baikBuruk(1);
        }else{
            fx.delayText(jwb.getNarasi(3));
            fx.delayText(jwb.getNarasi(4));
            fx.delayText(jwb.getNarasi(7));
            fx.delayText(jwb.getNarasi(8));
            fx.delayText(jwb.getNarasi(9));
            fx.delayText(jwb.getNarasi(10));
            this.baikBuruk(2);
        }
    }

    public int getDosa(){
        return this.totalDosa;
    }

    public int getMoral(){
        return this.totalMoral;
    }
}
