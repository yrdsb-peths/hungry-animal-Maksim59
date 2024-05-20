import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound endSound = new GreenfootSound("death.mp3");
    int speed = 1;
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY()+2;
        setLocation(x,y);
        
        MyWorld world = (MyWorld) getWorld();
        
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
            endSound.play();
            Greenfoot.stop();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
