import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Tutar,KdvLiFiyat,KdvTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz");
        Tutar= input.nextDouble();

        double KdvOran=Tutar<1000?0.18:0.8;

        KdvTutar=Tutar*KdvOran ;
        KdvLiFiyat=KdvTutar+Tutar;

        System.out.println("Tutar:"+ Tutar);
        System.out.println("Oran:"+ KdvOran);
        System.out.println("KDV:" + KdvTutar);
        System.out.println("KDVli Fiyat:"+ KdvLiFiyat);

    }
}

