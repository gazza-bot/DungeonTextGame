import java.util.*;

public class RunGame {
    private final Scanner input = new Scanner(System.in);
    private final Identitas nama = new Identitas();
    
    private void run(){
        System.out.println("======Kursi Panas=====");
        System.out.println("Tekan Enter untuk Melanjutkan Permainan");
        input.nextLine();

        nama.setNama();

        nama.setGender();

        // Initialize Pt Intro dan Arc I
        Intro partIntro = new Intro();
        partIntro.runIntro(nama.getNama(), nama.getGender());
        System.out.println(partIntro.getTotalDosa());
        System.out.print(partIntro.getTotalMoral());
        // Initialize Arc II
        Arc2 partDua = new Arc2(nama.getNama());
        partDua.runArc2(nama.getNama());
        // Initialize Arc III dengan mengisi Nama dan total dosa dan total moral dar Arc Sebelumnya
        Arc3 partTiga = new Arc3(nama.getNama(),partIntro.getTotalDosa() + partDua.getDosa(),partIntro.getTotalMoral() + partDua.getMoral());
        partTiga.runArc3(nama.getNama());
    }

    public void getRun(){
        this.run();
    }
}