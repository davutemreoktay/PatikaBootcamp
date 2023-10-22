public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev",77);
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz");
        System.out.println("Canınız yenilendi");
        System.out.println(getPlayer().getInventory().getFirewood());
        System.out.println(getPlayer().getInventory().getFood());
        System.out.println(getPlayer().getInventory().getWater());
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
