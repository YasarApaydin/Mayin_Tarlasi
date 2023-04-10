import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlasına Hoş Geldiniz:)");
        System.out.println("Lütfen Oynamak İstediğiniz Boyutları Girirniz.");
        System.out.print("Satır Sayısı: ");
      row= scan.nextInt();
        System.out.print("Sutun Sayısı: ");
        column=scan.nextInt();
        MayinTarlasi mayin=new MayinTarlasi(row,column);
        mayin.run();
    }
}



