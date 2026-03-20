import java.util.Random;

public class RPS_Player {
    //  map paper to 0, scissors to 1, rock to 2
    private static final int  PAPER = 0;
    private static final int SCISSORS = 1;
    private static final int ROCK = 2;

    private int numberOfGamesWon;
    private int numberOfGamesPlayed;
    private int choice;
    private String name;

    public RPS_Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /**
     * Returns the number of games played since a clear() was issued.
     * @return returns the number of games played.
     */
    public int getNumberOfGamesPlayed(){
        return numberOfGamesPlayed;
    }

    /**
     * Returns the number of games won since a clear() was issued.
     * @return returns the number of games won.
     */
    public int getNumberOfGamesWon(){

        return numberOfGamesWon;
    }

    /**
     * Returns the win percentage as number between 0 and 1.
     * @return win percentage as a double.
     */
    public double getWinPercentage(){
        return ((double) numberOfGamesWon / numberOfGamesPlayed);
    }

    /**
     * Starts a new game.
     */
    public void clear(){
        numberOfGamesWon = 0;
        numberOfGamesPlayed = 0;
    }

    /**
     * This player challenges anotherPlayer whereby both players make a
     * random choice of rock, paper, scissors.  A reference to the winning
     * player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player challenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        int randomNum1 = (int)(Math.random() * 3); // 0 to 2
        int randomNum2 = (int)(Math.random() * 3);// 0 to 2

        this.numberOfGamesPlayed++;
        anotherPlayer.numberOfGamesPlayed++;

        if ((randomNum1 == PAPER && randomNum2 == ROCK)||
        (randomNum1 == SCISSORS && randomNum2 == PAPER)||
        (randomNum1 == ROCK && randomNum2 == SCISSORS)){
            numberOfGamesWon += 1;
            return this;
        }
        else if ((randomNum2 == PAPER && randomNum1 == ROCK)||
                (randomNum2 == SCISSORS && randomNum1 == PAPER)||
                (randomNum2 == ROCK && randomNum1 == SCISSORS)){
            anotherPlayer.numberOfGamesWon += 1;
            return anotherPlayer;
        }else{
            return null;
        }




    }

    /**
     * This player challenges anotherPlayer whereby this player uses the previous
     * choice made and anotherPlayer makes a random choice of rock, paper, scissors.
     * A reference to the winning player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player keepAndChallenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        return null;
    }

}
