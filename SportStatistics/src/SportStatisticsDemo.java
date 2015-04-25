public class SportStatisticsDemo 
{
	public static void main(String[] args) 
	{		
		Football newtwo = new Football();
		newtwo.randomTeamStats();
		newtwo.randomFootBallStats();
		System.out.println(newtwo);
		
		Baseball newthree = new Baseball();
		newthree.randomTeamStats();
		newthree.randomBaseBallStats();
		System.out.println(newthree);
	}
}