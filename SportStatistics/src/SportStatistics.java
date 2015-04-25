import java.util.Random;
import java.util.Scanner;
public class SportStatistics
{ 
	private String teamName; 
	private int amountOfWins; 
	private int amountOfLosses; 
	private int amountOfPlayers; 
	Scanner keyboard = new Scanner(System.in); 

	public SportStatistics() 
	{ 
		teamName = ""; 
		amountOfWins = 0; 
		amountOfLosses = 0; 
		amountOfPlayers = 0;
	}	
	
	public String getTeamName() 
	{return teamName;	}
	public void setTeamName(String teamName) 
	{this.teamName = teamName;	}
	public int getAmountOfWins() 
	{return amountOfWins;	}
	public void setAmountOfWins(int amountOfWins)
	{this.amountOfWins = amountOfWins;	}
	public int getAmountOfLosses()
	{return amountOfLosses;	}
	public void setAmountOfLosses(int amountOfLosses) 
	{this.amountOfLosses = amountOfLosses;	}
	public int getAmountOfPlayers()
	{return amountOfPlayers;	}
	public void setAmountOfPlayers(int amountOfPlayers)
	{this.amountOfPlayers = amountOfPlayers;	}
	
	public String toString() 
	{
		return "\nSport Statistics: "
				+ "\n Team Name: " + teamName 
				+ "\n Number Of Wins: " + amountOfWins + " wins." 
				+ "\n Number Of Losses: " + amountOfLosses + " losses."
				+ "\n Number Of Players: " + amountOfPlayers + " players.";
	}
	public void randomTeamStats()
	{
		Random randomNumber = new Random();
		int random  = randomNumber.nextInt(20) + 1;
		int random2 = randomNumber.nextInt(20) + 1;
		int random3 = randomNumber.nextInt(9999) + 1;
		int random4 = randomNumber.nextInt(20)+20;
		System.out.println("\nRandom values will be used for team stats."); 
		teamName = "Team "+random3;
		amountOfWins = random;
		amountOfLosses = random2;
		amountOfPlayers = random4;
	}	
	public void customTeamStats() 
	{	System.out.println("The team name?"); 
		teamName = keyboard.nextLine(); 		
		System.out.println("How many wins?"); 
		amountOfWins = keyboard.nextInt();
		System.out.println("How many losses?"); 
		amountOfLosses = keyboard.nextInt(); 
		System.out.println("How many players?");
		amountOfPlayers = keyboard.nextInt();
	} 
}

class Football extends SportStatistics
{
	private int totalTouchdowns;
	private int totalYardsGained;
	
	public Football()
	{
		totalTouchdowns=0;
		totalYardsGained=0;		
	}
	
	public int getTotalTouchdowns() 
	{return totalTouchdowns;	}
	public void setTotalTouchdowns(int totalTouchdowns) 
	{this.totalTouchdowns = totalTouchdowns;	}
	public int getTotalYardsGained() 
	{return totalYardsGained;	}
	public void setTotalYardsGained(int totalYardsGained) 
	{this.totalYardsGained = totalYardsGained;	}
	
	public void randomFootBallStats()
	{
		Random randomNumber = new Random();
		int random = randomNumber.nextInt(100) + 1;
		int random2= randomNumber.nextInt(100) + 1;
		System.out.println("Random values will be used for football stats."); 
		totalTouchdowns = random;
		totalYardsGained = random2;
	}
	public void customFootBallStats() 
	{	
		System.out.println("How many touchdowns?"); 
		totalTouchdowns = keyboard.nextInt();
		System.out.println("How many yards gained?");		
		totalYardsGained = keyboard.nextInt();		
	}	
	public String toString() 
	{
		return super.toString() 
				+ "\nFootball Statistics: "
				+ "\n Total Touchdowns: " + totalTouchdowns + " touchdowns."
				+ "\n Total Yards Gained: " + totalYardsGained + " yards.";
	}
}
		
class Baseball extends SportStatistics
{
	private int totalHomeRuns;
	private int totalbasesGained;
	public Baseball()
	{
		totalHomeRuns=0;
		totalbasesGained=0;		
	}
	public int getTotalHomeRuns() 
	{return totalHomeRuns;	}
	public void setTotalHomeRuns(int totalHomeRuns) 
	{this.totalHomeRuns = totalHomeRuns;	}
	public int gettotalBasesGained() 
	{return totalbasesGained;	}
	public void settotalBasesGained(int totalbasesGained) 
	{this.totalbasesGained = totalbasesGained;	}
	
	public void randomBaseBallStats()
	{
		Random randomNumber = new Random();
		int random = randomNumber.nextInt(100) + 1;
		int random2= randomNumber.nextInt(100) + 1;
		System.out.println("Random values will be used for football stats."); 
		totalbasesGained = random;
		totalHomeRuns = random2;
	}
	public void customBaseBallStats() 
	{	
		System.out.println("How many homeruns?");		
		totalHomeRuns = keyboard.nextInt();
		System.out.println("How many bases?"); 
		totalbasesGained = keyboard.nextInt();	
	}	
	public String toString() 
	{
		return super.toString() 
				+ "\nBaseball Statistics: "				
				+ "\n Total Homeruns: " + totalHomeRuns + " homeruns."
				+ "\n Total bases Gained: " + totalbasesGained + " bases.";
	}
}