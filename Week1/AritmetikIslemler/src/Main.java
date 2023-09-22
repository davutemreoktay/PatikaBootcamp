import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;

        Scanner scan=new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz: ");
        a=scan.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        b=scan.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        c=scan.nextInt();

        int total=a+(b*c)-b;
        System.out.println("Total:"+total);
    }
}