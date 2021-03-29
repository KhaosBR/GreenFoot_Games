import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jewel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jewel extends Actor
{
    int locationTime = 0;
    int rotation = 0;
    /**
     * Act - do whatever the Jewel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        rotati();
        if(isTouching(Malves.class)){
        setLocation(Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(600));
        }
        if(isTouching(Block.class)){
        setLocation(Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(600));
        }
        
        locationTime ++;
        if(locationTime == 150){
        setLocation(Greenfoot.getRandomNumber(1099), Greenfoot.getRandomNumber(599));
        locationTime = 0;
        }
    }
    
    void rotati(){
        rotation ++;
        if(rotation == 1){
        setImage("jewel1.png");
        } else if(rotation == 2){
        setImage("jewel2.png");
        } else if(rotation == 3){
        setImage("jewel3.png");
        } else if(rotation == 4){
        setImage("jewel4.png");
        } else if(rotation == 5){
        setImage("jewel5.png");
        } else if(rotation == 6){
        setImage("jewel6.png");
        rotation = 0;
        }
    }
}
