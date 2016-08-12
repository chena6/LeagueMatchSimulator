package demo;

import java.util.*;

import controller.Command;
import view.ListView;
import view.MatchView;
import module.MatchData;
import module.PlayerData;
import module.PlayerList;

public class MatchSimulator {
	
		
	
	
	public static void main(String[] args) {
		
//		Create players
		
		PlayerData Player = getPlayer("stickperson2", 9001, 1, 0, -10);     
		PlayerData Player2 = getPlayer("WoahPlatypus", 1, 400, 0, 5);
		
//		Create match team lists and player lists
		
		ArrayList<PlayerData> Team1 = new ArrayList<PlayerData>();
		ArrayList<PlayerData> PlayerList = new ArrayList<PlayerData>();
		
		PlayerList Players = getPlayers(PlayerList, Player);
		MatchData Match = getMatchData(Team1, Player, 10, 2, 10, 300);
		
//		Create view and model
		
		ListView List = new ListView();
		MatchView MatchView = new MatchView();
		
//		Create controller
		
		Command PlayerListView = new Command(Players, List);
		Command MatchResults = new Command(Match, MatchView);
		
		
//		add more players to list or match
		
		getPlayers(PlayerList, Player2);
		getMatchData(Team1, Player2, 3, 10, 1, 20);
		
//		update view
		
		PlayerListView.updateList();
		MatchResults.updateMatchView();
		
		
		
		
	}
	
	
//	Set match properties
	
	private static MatchData getMatchData(ArrayList<PlayerData> Team1, PlayerData Player, int MatchKills, int MatchDeaths, int MatchAssists, int MatchCS) {
		MatchData CurrentMatch = new MatchData();
		CurrentMatch.setTeam1(Team1, Player);
		CurrentMatch.setMatchResult("Team 1 Win");
		Player.setMatchKills(MatchKills);
		Player.setMatchDeaths(MatchDeaths);
		Player.setMatchAssists(MatchAssists);
		Player.setMatchCS(MatchCS);
		return CurrentMatch;
		
	}
	
//	 Add players to list
	
	
	private static PlayerList getPlayers(ArrayList<PlayerData> PlayerList, PlayerData Player) {
		PlayerList AllPlayers = new PlayerList();
		AllPlayers.setPlayerList(PlayerList, Player);
		return AllPlayers;
	}
	
//	Add player
	
	private static PlayerData getPlayer(String PlayerName, int Kills, int Deaths, int Assists, int CS) {
		PlayerData Player = new PlayerData();
		Player.setPlayerName(PlayerName);
		Player.setKills(Kills);
		Player.setDeaths(Deaths);
		Player.setAssists(Assists);
		Player.setCS(CS);
		return Player;
		
	}
	
	
	
}
