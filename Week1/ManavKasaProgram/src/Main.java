import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5.00;
        double kg1,kg2,kg3,kg4,kg5;
        Scanner inp= new Scanner(System.in);
        System.out.print("Armut kg giriniz:");
        kg1= inp.nextDouble();
        System.out.print("Elma kg giriniz:");
        kg2= inp.nextDouble();
        System.out.print("Domates kg giriniz:");
        kg3= inp.nextDouble();
        System.out.print("Muz kg giriniz:");
        kg4 = inp.nextDouble();
        System.out.print("Patlıcan kg giriniz:");
        kg5= inp.nextDouble();

        double TlArmut=Armut*kg1;
        System.out.println("Armut Kaç Kilo ? :"+ TlArmut);
        double TlElma=Elma*kg2;
        System.out.println("Elma Kaç Kilo ? :"+ TlElma);
        double TlDomates=Domates*kg3;
        System.out.println("Domates Kaç Kilo ? :"+ TlDomates);
        double TlMuz=Muz*kg4;
        System.out.println("Muz Kaç Kilo ? :"+ TlMuz);
        double TlPatlican=Patlican*kg5;
        System.out.println("Patlıcan Kaç Kilo ? :"+ TlPatlican);
        double TlToplam=(TlArmut+TlDomates+TlElma+TlMuz+TlPatlican);
        System.out.println("Toplam Tutar:"+TlToplam+" TL");

    }
}