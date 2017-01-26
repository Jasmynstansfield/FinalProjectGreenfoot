import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jamie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jamie extends Actor
{
    /**
     * Act - do whatever the Jamie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //jamie foxx moves +3 on the Y axes
        MyWorld world = (MyWorld)getWorld();
        setLocation(getX(), getY()+3);
        
        //when jamie is at the bottom of screen, he is removed
        if (getY() == 549) 
        {
            getWorld().removeObject(this);
        }
    }    
}
