import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grasswall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grasswall extends Actor
{
    /**
     * Act - do whatever the Grasswall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeTouching(Sucena.class);
    }    
}
