public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal(){
        if(level == 1){
            health += (health * 0.1);
        }else if(level == 2){
            health += (health * 0.3);
        }else if(level == 3){
            health += (health * 0.4);
        }
    }

    @Override
    public void destroyed(){
        health -= (health * 0.02);
    }

    @Override
    public String getZombieInfo(){
        System.out.println("Walking Zombie Data");
        return super.getZombieInfo();
    }
}
