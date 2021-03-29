import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JewelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JewelOne extends Actor
{
    int rotation = 0;
    /**
     * Act - do whatever the JewelOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
