import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oscar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oscar extends Actor
{
    /**
     * Act - do whatever the Oscar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //the oscar moves +3 on the Y axes
        MyWorld world = (MyWorld)getWorld();
        setLocation(getX(), getY()+3);
        
        //when the oscar is at the bottom of screen, it is removed
        if (getY() == 549) 
        {
            getWorld().removeObject(this);
            world.addScore(-1);
        }
    }    
}
