import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i=1,k=1;
        int n1,n2;
        Scanner scan=new Scanner(System.in);
        System.out.print("n1 Değerini Giriniz..:");
        n1= scan.nextInt();
        System.out.print("n2 Değerini Giriniz..:");
        n2= scan.nextInt();
        int ebob=1;


        while (i <= n1 && i<=n2){
            i++;
            if ((n1%i)==0 && (n2%i)==0){
                ebob=i;
            }
        }
        int ekok=(n1*n2)/ebob;
        System.out.println("EBOB:"+ebob);
        System.out.println("EKOK:"+ ekok);
    }
}