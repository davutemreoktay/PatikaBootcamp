import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz..:");
        int number= input.nextInt();
        int digitValue=0;

        while(number != 0){
            digitValue += number %10;
            number/=10;

        }

        System.out.println("Rakamların Toplamı:"+ digitValue);












    }

}