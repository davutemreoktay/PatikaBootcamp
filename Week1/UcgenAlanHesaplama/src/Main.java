import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a,b;
       double c;
       int u;
       int alan;

       Scanner girdi =new Scanner(System.in);

        System.out.println("1.Kenarı Giriniz...");
        a = girdi.nextInt();
        System.out.println("2.Kenarı Giriniz...");
        b = girdi.nextInt();
        System.out.println("3.Kenarı Giriniz...");
        c= girdi.nextInt();

        u=(int)(a+b+c)/2;
        alan=(int)Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+ alan);


    }
}