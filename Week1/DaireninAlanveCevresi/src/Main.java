import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi=2.14,alan,cevre;

        Scanner input=new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz...:");
        r= input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Alan:"+ alan);
        System.out.print("Çevre:"+ cevre);

    }
}