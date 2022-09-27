package Modals;

public class ClientApp {
	public static void runapp() {
		
//		Create 2 teams
		Team team1 = new Team();
		Player playr[] = new Player[2];
		playr[0] = new Player("udesh",19,"addr",9);
		team1.players = playr;
		team1.name = "FCB";
		team1.country = "Argentina";
		
		Team team2 = new Team();
		playr[1] = new Player("udesh",19,"addr",9);
		team2.players = playr;
		team2.name = "FCB";
		team2.country = "Argentina";
		
		Match match = new Match();
		match.team1 = team1;
		match.team2 = team2;
		
		System.out.println(match.team1.name);
		System.out.println(match.team1.players[0].name);
	}
}
