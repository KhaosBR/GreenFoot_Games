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
    /**
     * Act - do whatever the Jewel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
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
}
