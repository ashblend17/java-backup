import java.util.*;
class lab8_3
{
    private static int guessCount=0;
    private static int secretNum;
    public static void main(String[] args)
    {
        System.out.print("\u000C");
        generateSecretNumber();
        playGame();
    }
    private static void generateSecretNumber()
    {
        secretNum=(int)((Math.random()*100)+1);
    }
    private static void playGame()
    {
        while(guessCount<6)
        {
            int guess=getNextGuess();
            guessCount++;
            if(guess==secretNum)
            {
                System.out.println("You win!");
                return;
            }
            else if(guess>secretNum)
            {
                System.out.println("Hi");
            }
            else if(guess<secretNum)
            {
                System.out.println("Lo");
            }
            
        }
        System.out.println("You Lose! Num was: "+secretNum);
        return;
    }
    private static int getNextGuess()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        return sc.nextInt();
    }
}