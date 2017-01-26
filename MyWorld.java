import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Jasmyn Stansfield
 * Mr. Hardman
 * Final Project
 * January 26th, 2017
 * Check 'Senario Information'
 */
public class MyWorld extends World
{
    //initializing variables
    private int score;
    private int time;
	public int counter;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 550, 1); 
        //giving values to the variables
        score = 0;
        time = 3000;
		counter = 0;
		
		//calling methods
        showScore();
        showTime();
        prepare();
    }
    
    public void act()
    {
        //randomly adding new characters at the top of the screen
        if (Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Matthew(), Greenfoot.getRandomNumber(800), 1);
        }
        
        if (Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Jamie(), Greenfoot.getRandomNumber(800), 1);
        }
        
        if (Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Forest(), Greenfoot.getRandomNumber(800), 1);
        }
        
        if (Greenfoot.getRandomNumber(200) < 1)
        {
            addObject(new Tommy(), Greenfoot.getRandomNumber(800), 1);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Oscar(), Greenfoot.getRandomNumber(800), 1);
        }
        
        //calling method
        countTime();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //adding a leo character at the start of the game
        Leo leo = new Leo();
        addObject(leo,400,485);
    }
    /**
     * showScore will show the score to the user
     * 
     * @param there are no parameters
     * @return nothing will be returned
     */
    public void showScore(){  
        //displaying the current score to the user
		showText( String.format("%10s: " + score, "Score"), 40, 15);
    }
    
    /**
     * showTime will show the timer to the user
     * 
     * @param there are no parameters
     * @return nothing will be returned
     */
    private void showTime(){ 
        //displaying the current time to the user  
		showText( String.format("%10s: " + time, "Time"), 730, 15);
    }
    
    /**
     * addScore add points to the current score
     * 
     * @param points is what we will add to the score
     * @return nothing will be returned
     */
    public void addScore(int points) {
        score += points;
        showScore();
    }
    
    /**
     * countTime will count down the time
     * 
     * @param there are no parameters
     * @return nothing will be returned
     */
    private void countTime(){
        //counting down the time
        time--;
        
        //method call
        showTime();
        
        
        if(time <=0){
            showEndMessage();
            Greenfoot.stop();
        }
    }
    
    /**
     * showEndMessage will display the final score to the user
     * 
     * @param there are no parameters
     * @return nothing will be returned
     */
    private void showEndMessage(){
        showText("Time is up - Score: " + score, 400, 245);
        
        if(counter == 0){
            showText("Better luck next time :(", 400, 225);
        } else if (counter == 1){
            showText("You and Leonardo Dicaprio have one the same amount of Oscars ;)", 400, 225);
        } else{ 
			showText("YOU HAVE WON " + (counter - 1) + " MORE OCSCARS THAN LEONARDO DICAPRIO", 400, 225);
        }
    }
}
