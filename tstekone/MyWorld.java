import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1);
        
        Invocar();
    }
    public void act(){
    if(time == 250){
        addObject(new Ant(), Greenfoot.getRandomNumber(801),Greenfoot.getRandomNumber(601));
        time = 0;
        
        }
        time ++;
    }
    void Invocar(){
        //Player
        addObject(new Wiu(), 550, 300);
        //Enemy
        addObject(new Ant(), 50, 550);
        addObject(new Ant(), 1050, 550);
        addObject(new Ant(), 550, 50);
        //wall center
        addObject(new Block(), 620, 295);
        addObject(new Block(), 480, 295);
        addObject(new Block(), 575, 245);
        addObject(new Block(), 525, 245);
        addObject(new Grasswall(), 575, 500);
        addObject(new Grasswall(), 525, 500);
        //wall left side
        addObject(new Block(), 100, 500);
        addObject(new Block(), 100, 450);
        addObject(new Block(), 100, 400);
        addObject(new Block(), 100, 100);
        addObject(new Block(), 100, 150);
        addObject(new Block(), 100, 200);
        addObject(new Grasswall(), 300, 300);
        addObject(new Grasswall(), 300, 250);
        addObject(new Grasswall(), 300, 350);
        //wall right side
        addObject(new Block(), 999, 500);
        addObject(new Block(), 999, 450);
        addObject(new Block(), 999, 400);
        addObject(new Block(), 999, 100);
        addObject(new Block(), 999, 150);
        addObject(new Block(), 999, 200);
        addObject(new Grasswall(), 799, 300);
        addObject(new Grasswall(), 799, 250);
        addObject(new Grasswall(), 799, 350);
        
        addObject(new JewelOne(), 50, 50);
        addObject(new JewelOne(), 1050, 50);
        addObject(new JewelOne(), 550, 550);
        addObject(new Jewel(), Greenfoot.getRandomNumber(801),Greenfoot.getRandomNumber(601));
        addObject(new Jewel(), Greenfoot.getRandomNumber(801),Greenfoot.getRandomNumber(601));
        addObject(new Jewel(), Greenfoot.getRandomNumber(801),Greenfoot.getRandomNumber(601));
    }

}
