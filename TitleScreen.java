import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Maksim Isayenka 
 * @version May 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <-- or --> to move", 40);
        addObject(label,79,195);
        label.setLocation(326,200);
        Label label2 = new Label("Press <space> to start", 40);
        addObject(label2,149,146);
        label2.setLocation(249,159);
        label.setLocation(167,281);
        label2.setLocation(152,199);
        label.setLocation(128,268);
        label2.setLocation(135,225);
    }
}
