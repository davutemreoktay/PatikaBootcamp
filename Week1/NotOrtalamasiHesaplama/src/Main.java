import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat,fizik,bio,geo,kimya;

        //Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunu yazınız");
        mat = inp.nextInt();

        System.out.print("Fizik notunu yazınız");
        fizik = inp.nextInt();

        System.out.print("Geometri notunu yazınız");
        geo = inp.nextInt();

        System.out.print("Kimya notunu yazınız");
        kimya = inp.nextInt();

        System.out.print("Biyoloji notunu yazınız");
        bio = inp.nextInt();

        //Hepsini topla
        int toplam = (mat+fizik+geo+kimya+bio);
        double sonuc= toplam/5;
        System.out.println("Ortalamanız:" +  sonuc);


        boolean kosul1 = sonuc>=60;
        //boolean kosul2 = sonuc<60;

        String str =kosul1 ? "Geçti":"Kaldı";
        System.out.println(str);

        //String result=sonuc>60?"Geçti":"Kaldın";
        //System.out.println(result);

    }
}