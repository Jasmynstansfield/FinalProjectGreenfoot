import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leo extends Actor
{
    /**
     * Act - do whatever the Leo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //calling methods
        checkKeyPress();
        checkCollision();
    }    
    /**
     * checkKeyPress will move Leo according to the
     * key the user presses 
     * 
     * @param there are no parameters
     * @return nothing will be returned
     */
    public void checkKeyPress()
    {
        //allowing the user to control leonardo dicaprio
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-4, getY());
        }
        
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+4, getY());
        }
    }
     /**
     * checkCollision will check whether we collect any Oscars or
     * our competition
     * 
     * @param no parameters
     * @raturn nothing will be returned
     */ 
    private void checkCollision(){
        //gets an object from MyWorld
        MyWorld world = (MyWorld)getWorld();
        
        //calculating points
        if(isTouching(Oscar.class)){
            world.addScore(10);
            removeTouching(Oscar.class);
			world.counter ++;
        }
        if(isTouching(Jamie.class)){
            world.addScore(-25);
            removeTouching(Jamie.class);
        }
        if(isTouching(Forest.class)){
            world.addScore(-25);
            removeTouching(Forest.class);
        }
        if(isTouching(Tommy.class)){
            world.addScore(-25);
            removeTouching(Tommy.class);
        }
        if(isTouching(Matthew.class)){
            world.addScore(-25);
            removeTouching(Matthew.class);
        }
    }
}
