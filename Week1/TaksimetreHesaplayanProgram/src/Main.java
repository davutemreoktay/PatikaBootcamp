import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,startPrice=10;
        double perKm=2.20,total;
        Scanner input =new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz...");
        km = input.nextInt();
        total=km*perKm;
        System.out.println(total);
        total+=startPrice;

        total=(total<20)?20:total;
        System.out.println("Toplam Tutar:"+ total);

    }
}
