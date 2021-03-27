import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sucena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sucena extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Sucena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(isTouching(Malves.class)){
            score = score + 10;
        }
        
        getWorld().showText("Score: " + score, 40, 40);
        removeTouching(Malves.class);
        if(isAtEdge()) {
        getWorld().removeObject(this);
        }
    }
    
}
