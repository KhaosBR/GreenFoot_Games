import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worldtwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldtwo extends World
{

    /**
     * Constructor for objects of class Worldtwo.
     * 
     */
    public Worldtwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        summon();
    }
    
    void summon(){
    addObject(new WiuTwo(), 550, 50);
    addObject(new JewelOne(), 550, 400);
    addObject(new Ant(), 550, 550);
    }
}
