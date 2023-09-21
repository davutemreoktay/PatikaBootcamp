import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        n= scan.nextInt();

        int max=0;
        int min=0;
        int a;

        for (int i=1; i<=n ;i++){
            System.out.print(i +". Sayıyı giriniz:");
            a= scan.nextInt();
            if (a>max){
                max=a;
            }
            if (a<min){
                min =a;
            }
        }
        System.out.println("Max Değer: "+ max);
        System.out.println("Min Değer: "+ min);
    }
}