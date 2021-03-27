import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Malves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Malves extends Actor
{
    int timer = 0;
    /**
     * Act - do whatever the Malves wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Gerar numero aleatorio 0 ... 100 (0 ..99)
        movement();
        matar();
    }
    void matar(){
        removeTouching(Ant.class);
    }
    void movement(){
        move(3);
        if(Greenfoot.getRandomNumber(10000) < 80){
            turn(180);
        }
        if(Greenfoot.getRandomNumber(20000) < 80){
            turn(270); 
        }
        // if (hitGrasswall()==true){
            // move(-3);
        // }
        // if(isTouching(Block.class)){
        // move(-3);
        // }
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
        if(isTouching(Block.class)){
        turn(180);
        }
    }
    // public boolean hitGrasswall(){
     // if(isTouching(Grasswall.class)){
         // return true;
        // }else {return false;} 
    // } 
}
