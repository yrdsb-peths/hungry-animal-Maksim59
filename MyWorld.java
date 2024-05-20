import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Maksim Isayenka) 
 * @version (2024-04-29)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300,300);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 50,50);
        
        createApple();
        createBanana();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
     public void createBanana()
    {
        Banana banana = new Banana();
        banana.setSpeed(level);
        
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x, y);
    }
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
        if(score < 0)
        {
            gameOver();
        }
    }
}
