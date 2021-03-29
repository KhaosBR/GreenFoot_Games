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
    int evoTime = 0;
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if(time == 80){
        // getWorld().addObject(new Malves(), getX(), getY());
        // }
        time ++;
        if(isTouching(Block.class)){
        setLocation(Greenfoot.getRandomNumber(1100), Greenfoot.getRandomNumber(600));
        }
        if(evoTime++ == 5){
        setImage("golem2.png");
        } else if(evoTime == 10){
        setImage("golem3.png");
        } else if(evoTime == 15){
        setImage("golem4.png");
        } else if(evoTime == 20){
        setImage("golem5.png");
        } else if(evoTime == 25){
        setImage("golem6.png");
        } else if(evoTime == 30){
        setImage("golem7.png");
        getWorld().addObject(new Malves(), getX(), getY());
        } 
    }    
}
