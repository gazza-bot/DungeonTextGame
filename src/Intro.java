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
            case 1 -> nama.addMoral();
            case 2 -> nama.addDosa();
            case 3 -> nama.addDosa();
        }
        System.out.println(name + " : " + arrJawab[answer - 1]);
        totalDosa = nama.getDosa();
        totalMoral = nama.getMoral();
    }

    private void arcPertama(int n, String nama, boolean gender) {

        switch (n) {
            case 1 -> {
                System.out.println("Hari ini merupakan hari pelantikanmu sebagai Anggota DPR");
                fx.enterButton();
                if (gender) {
                    System.out.println(
                            "Pelantik : Dengan menyebut nama Allah yang Maha Pengasih lagi Maha Penyayang Saudara "
                                    + nama + " resmi kami lantik sebagai anggota dpr");
                } else {
                    System.out.println(
                            "Pelantik : Dengan menyebut nama Allah yang Maha Pengasih lagi Maha Penyayang Saudari "
                                    + nama + " resmi kami lantik sebagai anggota dpr");

                }
                fx.enterButton();
            }
            case 2 -> {
                fx.delayText("===Arc I : Niat===");
                fx.enterButton();
                System.out.println(nama + " : "
                        + "Hmm.. Hari yang melelahkan sekali, Akhirnya Mimpiku menjadi wakil rakyat terealisasi ");
                System.out.println(
                        nama + " : Tapi Kayanya Modal sama gaji jadi wakil rakyat ga sebanding deh, gimana ya?..");
                this.baikBuruk(1, nama);
            }

            case 3 -> {
                fx.delayText("===Hari Berikutnya===");
                fx.enterButton();
                System.out.println(
                        "Hari ini anda ditanyai tentang kebijakan anda tentang Keuangan negara\nyang mana kebijakan tersebut adalah kebijakan yang ditetapkan oleh pejabat terdahulu dan dirasa merugikan Masyarakat");
                if (gender) {
                    System.out.println(
                            "Wartawan : Bagaimana pendapat Bapak tentang Kebijakan Pembekuan Rekening yang tidak digunakan selama 3 bulan ?");
                } else {
                    System.out.println(
                            "Wartawan : Bagaimana pendapat Ibu tentang Kebijakan Pembekuan Rekening yang tidak digunakan selama 3 bulan ?");
                }
                this.baikBuruk(2, nama);
            }
            default -> {
                System.out.println("Invalid");
            }

        }
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