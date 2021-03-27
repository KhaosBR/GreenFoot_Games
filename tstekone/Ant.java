    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Ant here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Ant extends Actor
{
    int time = 0;
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(time == 80){
        getWorld().addObject(new Malves(), getX(), getY());
        }
        time ++;
        if(isTouching(Block.class)){
        setLocation(Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(600));
        }
    }    
}
