import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends Actor
{
    /**
     * Act - do whatever the Forest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //forest whitaker moves +3 on the Y axes
        MyWorld world = (MyWorld)getWorld();
        setLocation(getX(), getY()+3);
        
        //when forest is at the bottom of screen, he is removed
        if (getY() == 549) 
        {
            getWorld().removeObject(this);
        }
    }    
}
