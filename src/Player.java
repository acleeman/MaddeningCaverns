public class Player {
    private double health = 100;
    private double food = 100;
    private double sanity = 100;
    private double water = 100;
    private double luck = 100;
    private double temp = 50;
    private boolean life = true;
    private int xCoord = 7;
    private int yCoord = 7;
    private int roomXCoord = 0;
    private int roomYCoord = 0;

    public static void main(String[] args) {
        new Player();
    }

    public Player(){

    }

    public void checkStat(){
        checkDeath();
        checkCrit();
    }

    private void checkDeath(){
        if(health == 0||food == 0||water == 0){
            life = false;
        }
        else if(sanity == 0||luck == 0){
            respawn();
        }
        else if (temp == 0||temp >= 100){
            if((Math.random()*10)<=5.7){
                life = false;
            }
            else{
                respawn();
            }
        }
    }

    private void checkCrit(){
        if (health<20){sanity/=2; luck/=2;}
        if (food<20){health/=2; temp/=1.2;}
        if (sanity<20){food/=2;}
        if (water<20){temp*=1.2;}
        if (luck<20){sanity/=2;}
        if (temp<20){food/=2;}
        if (temp>80){water/=2;}
    }

    public void respawn(){
        health = health/2;
        if(health<20){health=20;}

        food = food/2;
        if(food<20){food=20;}

        sanity = sanity/2;
        if(sanity<20){sanity=20;}

        water = water/2;
        if(water<20){water=20;}

        luck = luck/2;
        if(luck<10){luck=10;}

        temp = 50;

        roomXCoord=(int)Math.floor(Math.random()*16);
        roomYCoord=(int)Math.floor(Math.random()*16);
        xCoord=(int)Math.floor(Math.random()*8)+4;
        yCoord=(int)Math.floor(Math.random()*8)+4;

    }

    public void move(int direction, int distance){
        if(direction == 0){
            if (yCoord==15&&roomYCoord!=15){
                yCoord=0;
                roomYCoord+=distance;
            } else if(yCoord!=15){
                yCoord+=distance;            }
        }

        else if(direction == 1){
            if (xCoord==15&&roomXCoord!=15){
                xCoord=0;
                roomYCoord+=distance;
            } else if(xCoord!=15){
                xCoord+=distance;
            }
        }

        else if(direction == 2){
            if (yCoord==0&&roomYCoord!=0){
                yCoord=15;
                roomYCoord-=distance;
            } else if(yCoord!=0){
                yCoord-=distance;
            }
        }

        else if(direction == 3){
            if (xCoord==0&&roomXCoord!=0){
                xCoord=15;
                roomYCoord-=distance;
            } else if(xCoord!=0){
                xCoord-=distance;
            }
        }
    }

    public int getCoords(){
        return (yCoord+100*xCoord+10000*roomYCoord+1000000*roomXCoord);
    }
}
