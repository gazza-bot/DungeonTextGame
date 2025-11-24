/**
 * Kelas BtnAndFx menyediakan fungsi untuk efek tampilan teks dan tombol enter pada UI.
 *
 * <p>
 * Fungsi-fungsi utama:
 * <ul>
 *   <li>{@link #delayText(String)} - Menampilkan teks dengan jeda per karakter selama 0.01 detik.</li>
 *   <li>{@link #enterButton()} - Menampilkan instruksi untuk menekan tombol Enter dan menunggu input pengguna.</li>
 * </ul>
 * </p>
 *
 * @author (Nama Anda)
 */
/* delayText(String untuk menampilkan Kalimat dengan jeda perhurufnya 0.1 s)
 * enterButtom() untuk Tombol enter UI
 */


import java.util.Scanner;

public class BtnAndFx {
    private final Scanner input = new Scanner(System.in);

    public void enterButton() {
        System.out.println("\n(Tekan Enter)");
        input.nextLine();
    }

    public void delayText(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }
}