import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Malves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Malves extends Actor
{
    int timer = 0;
    int imageD = 1;
    int imageR = 1;
    int imageL = 1;
    int imageU = 1;
    /**
     * Act - do whatever the Malves wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Gerar numero aleatorio 0 ... 100 (0 ..99)
        movement();
        matar();
    }

    void matar(){
        removeTouching(Ant.class);
        removeTouching(Sucena.class);
    }

    void movement(){

        move(3);

        int possibilidadeDeVirar = Greenfoot.getRandomNumber(10000);
        // 2
        if(possibilidadeDeVirar < 80){
            setRotation(90);
        } else if(possibilidadeDeVirar > 79 && possibilidadeDeVirar < 160){
            setRotation(270); 
        } else if(possibilidadeDeVirar > 159 && possibilidadeDeVirar < 240){
            setRotation(180);
        } else if(possibilidadeDeVirar > 239 && possibilidadeDeVirar < 320){
            setRotation(0);
        }

        if(getRotation() == 0){
            if(imageR == 5){
                imageR = 1;
            }
            setImage("golemright" + imageR + ".png");
            imageR++;
        } else if(getRotation() == 90){
            if(imageD == 5){
                imageD = 1;
            }
            setImage("golemdown" + imageD + ".png");
            imageD++;
        } else if(getRotation() == 180){
            if(imageL == 5){
                imageL = 1;
            }
            setImage("golemleft" + imageL + ".png");
            imageL++;
        } else if(getRotation() == 270){
            if(imageU == 5){
                imageU = 1;
            }
            setImage("golemup" + imageU + ".png");
            imageU++;
        }
        
        // if(Greenfoot.getRandomNumber(10000) < 80){
        // turn(180);
        // }
        // if(Greenfoot.getRandomNumber(20000) < 80){
        // turn(270); 
        // }
        if(getX() == 1099) {
            setLocation(1, getY());
        }
        if(getX() == 0) {
            setLocation(1098, getY());
        }
        if(getY() == 599) {
            setLocation(getX(), 1);
        }
        if(getY() == 0) {
            setLocation(getX(), 598);
        }
        if(isTouching(Block.class)){
            turn(180);
        }
        if(isTouching(Grasswall.class)){
            turn(180);
        }
    } 
}
