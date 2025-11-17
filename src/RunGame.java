import java.util.*;

public class RunGame {
    private final Scanner input = new Scanner(System.in);
    private final Identitas nama = new Identitas();
    
    private void run(){
        System.out.println("======Kursi Panas=====");
        System.out.println("Tekan Enter untuk Melanjutkan Permainan");
        input.nextLine();

        nama.setNama();
        System.out.println(nama.getNama());

        nama.setGender();

        System.out.println(nama.getNama());


        // Initialize Pt Intro dan Arc I
        Intro partIntro = new Intro();
        partIntro.runIntro(nama.getNama(), nama.getGender());
        // Initialize Arc II
        Arc2 partDua = new Arc2(nama.getNama());
        partDua.runArc2(nama.getNama());
    }

    public void getRun(){
        this.run();
    }
}