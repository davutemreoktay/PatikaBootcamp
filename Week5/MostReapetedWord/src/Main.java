import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Bir metin giriniz.");
        String text=sc.nextLine();

        String[] words=text.split("\\s+");

        HashMap<String,Integer>wordage=new HashMap<>();

        for (String word:words){
            word=word.toLowerCase().trim();
            Integer num=wordage.get(word);
            if (num==null){
                wordage.put(word,1);
            }else {
                wordage.put(word,num+1);
            }

        }
        String mostwords=null;
        int mostnum=0;

        for (Map.Entry<String, Integer> entry : mostnum.entryHashMap()) {
            if (entry.getValue() > mostnum) {
                mostwords = entry.getKey();
                mostnum = entry.getValue();
            } else if (entry.getValue() == mostnum && entry.getKey().compareTo(mostwords) < 0) {
                mostwords = entry.getKey();
            }
        }

    }
}