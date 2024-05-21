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
    public static int highestScore = 0;
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    GreenfootSound endSound = new GreenfootSound("death.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300,300);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 50,50);
        
        Label highestScoreLabel = new Label("HighScore:" + MyWorld.getHighestScore(),30);
        addObject(highestScoreLabel, 520, 40);
        
        createApple();
        createBanana();
    }
    
    public void gameOver()
    {
        
        if(score > highestScore)
        
        {
            highestScore = score;
        }
        
        Label gameOverLabel = new Label("Game Over", 100);
        //Label highScoreLabel = new Label("High Score: " + score, 60);
        //addObject(highScoreLabel, 300, 90);
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
        score-=5;
        scoreLabel.setValue(score);
        if(score < 0)
        {
            gameOver();
            endSound.play();
            Greenfoot.stop();
            
        }
    }
    
    public static int getHighestScore()
    {
        return highestScore;
    }
}
