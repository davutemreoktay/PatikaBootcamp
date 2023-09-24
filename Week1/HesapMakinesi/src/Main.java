import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d1,d2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        d1= input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz");
        d2=input.nextInt();

        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (d1+d2));break;
            case 2:
                System.out.println("Fark: "+ (d1-d2));break;
            case 3:
                System.out.println("Çarpım: "+ (d1*d2));break;
            case 4:
                if(d2==0){
                System.out.println("Hiçbir Sayı 0'a Bölünemez");}
                else;{
                System.out.println("Bölüm: "+ (d1/d2));break;}
            default:
                System.out.println("Hatalı Seçim Yaptınız");

        }
    }
}