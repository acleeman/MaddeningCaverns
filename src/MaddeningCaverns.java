public class MaddeningCaverns {
     private Player player = new Player;
    public static void main(String[] args) {
        new MaddeningCaverns();
    }

    public MaddeningCaverns(){
        move();
        act();
        run();
    }

    private void move(){}
    private void act(){}
    private void run(){
        player.checkStats();
    }
}
