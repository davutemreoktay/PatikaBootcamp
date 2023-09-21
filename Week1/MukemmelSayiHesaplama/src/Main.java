import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz..:");
        n= input.nextInt();
        int sum=0;

        for (int i = 1; i<n; i = i +1) {
            if (n%i==0){
                sum+=i;
            }
        }if (sum==n){
            System.out.println(n+" Mükemmmel Sayıdır.");
        }else{
            System.out.println(n+" Mükemmel Sayı Değildir.");
        }
    }
}