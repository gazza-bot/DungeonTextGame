import java.util.Scanner;

public class Identitas {

    private final Scanner input = new Scanner(System.in);
    private String nama;
    private int dosa = 0;
    private int moral = 0;
    private boolean gender;
    // private int totalDosa = 0;
    // private int totalMoral = 0;

    public void setNama() {
        System.out.print("Masukkan Nama: ");
        this.nama = input.nextLine().trim();
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak Boleh Kosong !!");
            setNama();
        }
    }

    public void setGender() {
        System.out.print("Apa Gender Anda : (L/P)");
        String gend = input.nextLine();
        if (gend.equalsIgnoreCase("L") || gend.equalsIgnoreCase("P")) {
            this.gender = (gend.equalsIgnoreCase("L"));
        } else {
            System.out.println("Invalid Input");
            setGender();
        }
    }

    public String getNama() {
        return this.nama;
    }

    public boolean getGender() {
        return this.gender;
    }

    public int addDosa() {
        return this.dosa += 1;
    }

    public int addMoral() {
        return this.moral += 1;
    }

    public int getDosa() {
        return this.dosa;
    }

    public int getMoral() {
        return this.moral;
    }
}
