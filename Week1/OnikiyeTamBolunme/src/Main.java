import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int toplam=0;
        int bolensayisi=0;
        int i=0;

        Scanner inp= new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz..:");
        a=inp.nextInt();

        while(i<a){
            if (i%12==0){
                toplam +=i;
                bolensayisi++;
            }
            i++;
        }

        if (bolensayisi>0){
            double ortalama=toplam/bolensayisi;
            
            System.out.println("3 ve 4'e Tam Bölünen Sayıların ortalaması:"+ ortalama);
        } else{
            System.out.println("3 ve 4'e Tam Bölünen Sayı Bulunamadı.");
        }



    }

}

