import java.util.Scanner;

public class  Game {
    private Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz !");
        System.out.print("Lütfen bir isim giriniz :");
        String playerName=input.nextLine();
        Player player=new Player(playerName);
        System.out.println("Sayın "+player.getName()+" Hoşgeldiniz!");
        System.out.println("Lütfen bir karakter seçiniz!");
        player.selectChar();
        Location location=null;
        boolean isWin=false;
        while (true) {
            player.printInfo();
            System.out.println("#############Bölgeler##############");
            System.out.println("1- Güvenli Ev-->Burası sizin için güvenli bir ev,düşman yoktur !");
            System.out.println("2- Eşya Dükkanı-->Silah veya Zırh satın alabilirsiniz !");
            System.out.println("3- Mağara-->Ödül<Yemek>,dikkatli ol Zombi çıkabilir !");
            System.out.println("4- Orman-->Ödül<Odun>,dikkatli ol Vampir çıkabilir !");
            System.out.println("5- Nehir-->Ödül <Su>,dikkatli ol Ayı çıkabilir !");
            System.out.println("6- Maden-->Ödül <Bilinmiyor>,dikkatli ol Yılan çıkabilir !");
            System.out.println("0- Çıkış Yap, Oyunu Sonlandır");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz :");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    if (location.getPlayer().getInventory().getWater().equals("water")&&location.getPlayer().getInventory().getFirewood().equals("firewood")&&location.getPlayer().getInventory().getFood().equals("food")){
                        isWin=true;
                    }
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;
                case 6:
                    location=new Mineral(player);
                    break;
                default:
                    System.out.println("Geçerli bir değer giriniz.");
                    break;
            }
            if (isWin){
                System.out.println("Oyunu Kazandın.");
                break;
            }
            if (location==null){
                System.out.println("Oyun bitti!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
