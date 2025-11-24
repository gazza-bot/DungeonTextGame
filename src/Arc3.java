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
                    this.totalDosa = recapDosa;
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
                    this.totalDosa = recapDosa; 
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
        System.out.println(recapDosa);
        System.out.println(recapMoral);
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
