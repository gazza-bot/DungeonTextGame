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
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }
}