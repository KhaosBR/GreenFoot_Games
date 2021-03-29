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
        if(rotation == 5){
        setImage("jewel1.png");
        } else if(rotation ==10){
        setImage("jewel2.png");
        } else if(rotation == 15){
        setImage("jewel3.png");
        } else if(rotation == 20){
        setImage("jewel4.png");
        } else if(rotation == 25){
        setImage("jewel5.png");
        } else if(rotation == 30){
        setImage("jewel6.png");
        } else if(rotation == 35){
        setImage("jewel7.png");
        } else if(rotation == 40){
        setImage("jewel8.png");
        } else if(rotation == 45){
        setImage("jewel9.png");
        rotation = 0;
    }
    }    
}
