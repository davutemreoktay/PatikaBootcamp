import java.util.Random;

public class Mineral extends BattleLoc{
    public Mineral(Player player) {
        super(player,"Maden", new Snake(), "random", 5,6);
    }
    @Override
    public boolean onLocation(){
        int obsNumber=this.randomObstacleNumber();
        System.out.println("Şu an buradasınız :"+ this.getName());
        System.out.println("Dikkatli ol! Burada "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor!");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase=input.nextLine();
        selectCase=selectCase.toUpperCase();
        if (selectCase.equals("S")){
            if (combat(obsNumber)){
                System.out.println(this.getName()+" tüm düşmanları yendiniz !");
                return true;
            }
        }
        if (this.getPlayer().getHealth()<=0){
            System.out.println("Öldünüz !");
            return false;
        }else {
            return true;}
    }
    public int ranSnakeDmg(){
        Random randomDmg=new Random();
        int a =randomDmg.nextInt(4)+3;
        return a;
    }
    @Override
    public void obstacleStats(int i){
        System.out.println(i+"."+this.getObstacle().getName()+"değerleri");
        System.out.println("Sağlık"+this.getObstacle().getHealth());
        System.out.println("Hasar:3-6");
        System.out.println("Ödül: Bilinmiyor");
        System.out.println();
    }
    @Override
    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrijinalHealth());
            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<V>ur veya <K>aç: ");
                int snakeDmg=this.getObstacle().getDamage()+ranSnakeDmg();
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    // Oyuncu vurdu
                    if (chance()) {
                        System.out.println("Siz vurdunuz !");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println("Canavar vurdu !");
                            int obstacleDamage = snakeDmg - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }

                    } // Engel vurdu
                    else  {
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Canavar size vurdu !");
                        int obstacleDamage =snakeDmg-this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        if (this.getPlayer().getHealth()>0) {
                            System.out.println("Siz vurdunuz !");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }
                }


            }

            if (this.getPlayer().getHealth() > 0) {
                // Düşmanı yendiniz
                System.out.println("Düşmanı yendiniz !");
                System.out.println(this.getObstacle().getAward() + " para kazandınız !");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel Paranız: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }

        return true;
    }
    return true;



}
public void randomPrize() {
    int randomF = (int) ((Math.random()) * 100);
    int randomS = (int) ((Math.random()) * 100);

    if (randomF > 0 && randomF < 16) {
        if (randomS > 0 && randomS < 21) {
            System.out.println("Tüfek kazandınız");
            getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
        } else if (randomS > 20 && randomS < 51) {
            if (getPlayer().getInventory().getWeapon().getId() > 2) {
                System.out.println("Kılıç kazandınız fakat sizde daha iyisi var.");
            } else {
                System.out.println("Kılıç kazandınız !");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
            }
        } else {
            if (getPlayer().getInventory().getWeapon().getId() > 1) {
                System.out.println("Tabanca kazandınız fakat daha iyisi mevcut.");
            } else {
                System.out.println("Tabanca kazandınız");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
            }
        }
    } else if (randomF > 15 && randomF < 31) {
        if (randomS > 0 && randomS < 21) {
            System.out.println("Ağır zırh kazandınız");
            getPlayer().getInventory().setArmor(Armor.getArmorObjById(3));
        } else if (randomS > 20 && randomS < 51) {
            if (getPlayer().getInventory().getArmor().getId() > 2) {
                System.out.println("Orta zırh kazandınız fakat sizde daha iyisi var");
            } else {
                System.out.println("Orta zırh kazandınız");
                getPlayer().getInventory().setArmor(Armor.getArmorObjById(1));
            }
        }
    } else if (randomF > 30 && randomF < 56) {  //para
        if (randomS > 0 && randomS < 21) {
            System.out.println("10 altın kazandınız");  //10g
            getPlayer().setMoney(getPlayer().getMoney() + 10);
            System.out.println("Toplam altın : " + this.getPlayer().getMoney());
        } else if (randomS > 20 && randomS < 51) {
            System.out.println("5 altın kazandınız"); //5g
            getPlayer().setMoney(getPlayer().getMoney() + 5);
            System.out.println("Toplam altın : " + this.getPlayer().getMoney());
        } else {
            System.out.println("1 altın kazandınız"); //1g
            getPlayer().setMoney(getPlayer().getMoney() + 1);
            System.out.println("Toplam altın : " + this.getPlayer().getMoney());
        }
    } else {
        System.out.println("Bu yılanın içinde bir şey yok !");
    }
    }
}
