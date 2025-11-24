import java.util.Scanner;

public class Identitas {

    private final Scanner input = new Scanner(System.in);
    private String nama;
    private int dosa = 0;
    private int moral = 0;
    private boolean gender;
    // private int totalDosa = 0;
    // private int totalMoral = 0;

    /**
     * Meminta pengguna memasukkan nama melalui input standar, lalu menyimpan
     * hasilnya ke field this.nama setelah di-trim.
     *
     * Jika input null atau hanya berisi whitespace/empty, akan menampilkan pesan
     * kesalahan dan meminta input ulang dengan memanggil kembali metode ini.
     *
     * Perilaku dan efek samping:
     * - Melakukan I/O interaktif (System.out.print / System.out.println dan
     *   membaca dari scanner field "input"), sehingga akan memblokir eksekusi
     *   sampai pengguna memberikan input.
     * - Mengubah nilai field this.nama.
     *
     * Catatan implementasi:
     * - Pengulangan dilakukan secara rekursif; untuk jumlah percobaan sangat
     *   besar, rekursi ini berisiko menyebabkan StackOverflowError. Pendekatan
     *   iteratif direkomendasikan jika diperlukan batas percobaan besar.
     * - Jika scanner "input" belum diinisialisasi (null), pemanggilan ini dapat
     *   menyebabkan NullPointerException.
     *
     * @return void
     */
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
