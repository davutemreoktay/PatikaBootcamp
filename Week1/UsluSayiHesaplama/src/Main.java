import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,n;

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz..:");
        a= scan.nextInt();

        System.out.print("Bir Üs Değeri Giriniz..:");
        n= scan.nextInt();

        int total=1;

        for(int i=1; i<=n ; i++ ){
            total =total*a;
        }
        System.out.println("Sonuç:"+ total );
    }
}