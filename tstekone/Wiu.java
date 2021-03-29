import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wiu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wiu extends Actor
{
    int level = 0;
    int removesucena = 0;
    int life = 3;
    int timeForHit = 50;
    int timeShot = 0;
    int imageR = 0;
    int imageL = 0;
    int imageU = 0;
    int imageD = 0;
    /**
     * Act - do whatever the Wiu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        shooting();
        nextlevel();
        endgame();
    }

    void movement(){
        if(hitGrasswall()==true){
            move(-3);}
        if(isTouching(Block.class)){
        move(-3);
        }
        if(Greenfoot.isKeyDown("w")){
            setRotation(270);
            move(3);
            imageU ++;
            if(imageU == 1){
                setImage("wiuup1.png");
            } else if(imageU == 2){
                setImage("wiuup2.png");
            } else if(imageU == 3){
                setImage("wiuup3.png");
                imageU = 0;
            }
        }
        if(Greenfoot.isKeyDown("d")){
            setRotation(0);
            move(3);
            imageR ++;
            if(imageR == 1){
                setImage("wiuright11.png");
            } else if(imageR == 2){
                setImage("wiuright12.png");
            } else if(imageR == 3){
                setImage("wiuright13.png");
                imageR = 0;
            }
        }
        if(Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(3);
            imageD ++;
            if(imageD == 1){
                setImage("wiudown1.png");
            } else if(imageD == 2){
                setImage("wiudown2.png");
            } else if(imageD == 3){
                setImage("wiudown3.png");
                imageD = 0;
            }
        }  
        if(Greenfoot.isKeyDown("a")){
            setRotation(180);
            move(3);
            imageL ++;
            if(imageL == 1){
                setImage("wiuleft1.png");
            } else if(imageL == 2){
                setImage("wiuleft2.png");
            } else if(imageL == 3){
                setImage("wiuleft3.png");
                imageL = 0;
            }
        }
        if(getX() == 1099) {
            setLocation(1, getY());
        }
        if(getX() == 0) {
            setLocation(1098, getY());
        }
        if(getY() == 599) {
            setLocation(getX(), 1);
        }
        if(getY() == 0) {
            setLocation(getX(), 598);
        }
    }

    public boolean hitGrasswall(){
        if(isTouching(Grasswall.class)){
            return true;
        }else {return false;} 
    }

    void nextlevel(){
        if(isTouching(Jewel.class)){
            level ++;
            removeTouching(Jewel.class);
        }
        if(isTouching(JewelOne.class)){
            level ++;
            removeTouching(JewelOne.class);
        }
        if(level == 6){
            Wallone wallone = new Wallone();
            getWorld().addObject(wallone, 550, 320);
        }
        if(isTouching(Wallone.class)){
            Greenfoot.ask("Deseja salvar o jogo?");
            Greenfoot.setWorld(new Worldtwo());
        }
    }

    void shooting(){
        getWorld().showText("" + removesucena, 500, 300);
        if(timeShot -- < 0){
            if(Greenfoot.isKeyDown("space")){
                Sucena sucena = new Sucena();
                sucena.setRotation(getRotation());
                getWorld().addObject(sucena ,getX(), getY());
                timeShot = 50;
            }
        }
    }

    void endgame(){
        getWorld().showText("LIFE: " + life, 40, 20);
        if(timeForHit -- < 0){
            if(isTouching(Malves.class)){
                life = life - 1;
                timeForHit = 50;
            }
        }
        if(life == 0){
            getWorld().showText("LOSER!!!", 550, 300);
            Greenfoot.stop();
        }
    }
}    

