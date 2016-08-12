package view;

import module.MatchData;

import module.PlayerData;

public class MatchView {
	
	public void printMatchPlayers(PlayerData Player) {
		 System.out.println("Player: " + Player.getPlayerName() +
				" Kills: " + Player.getMatchKills() + 
				" Deaths: " + Player.getMatchDeaths() + 
				" Assists: " + Player.getMatchAssists() + 
				" CS: " + Player.getMatchCS());
	}
	
	
	
	public void PrintMatchData(MatchData Match) {
		
		System.out.println("\n" + Match.getMatchResult() + "\n");
		System.out.println("Team 1");
		
		for (int i = 0; i < Match.getTeam1().size(); i++) {
			printMatchPlayers(Match.getTeam1().get(i));
		}
		
		System.out.println("\n" + "Team 2 \n");
		
		for (int i = 0; i < Match.getTeam2().size(); i++) {
			printMatchPlayers(Match.getTeam2().get(i));
		}
		
		
		
	}
}
