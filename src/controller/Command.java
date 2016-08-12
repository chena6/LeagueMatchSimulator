package controller;

import java.util.ArrayList;

import view.ListView;
import view.MatchView;
import module.MatchData;
import module.PlayerData;
import module.PlayerList;


public class Command {
	private PlayerData Player;
	private ListView List;
	private MatchData Match;
	private MatchView MatchView;
	private PlayerList PlayerList;
	
	public Command(PlayerList PlayerList, ListView List) {
		this.PlayerList = PlayerList;
		this.List = List;
	}
	
	public Command(MatchData Match, MatchView MatchView) {
		this.Match = Match;
		this.MatchView = MatchView;
	}
	
	// Player List Controller
	
	public void setPlayerName(String name) {
		Player.setPlayerName(name);
	}
	
	public String getPlayerName() {
		return Player.getPlayerName();
	}
	
	public void setPlayerKills(int kills) {
		Player.setMatchKills(kills);
	}

	public int getPlayerKills() {
		return Player.getMatchKills();
	}
	
	public void setPlayerDeaths(int deaths) {
		Player.setMatchDeaths(deaths);
	}
	
	public int getPlayerDeaths() {
		return Player.getMatchDeaths();
	}
	
	public void setPlayerAssists(int assists) {
		Player.setMatchAssists(assists);
	}
	
	public int getPlayerAssists() {
		return Player.getMatchAssists();
	}
	
	public void setPlayerCS(int CS) {
		Player.setMatchCS(CS);
	}
	
	public int getPlayerCS() {
		return Player.getMatchCS();
	}
	
	
	// MatchView Controller 
	
	public void setTeam1(ArrayList<PlayerData> team1, PlayerData Player) {
		Match.setTeam1(team1, Player);
	}
	
	public ArrayList<PlayerData> getTeam1() {
		return Match.getTeam1();
	}
	
	public void setTeam2(ArrayList<PlayerData> team2, PlayerData Player2) {
		Match.setTeam2(team2, Player);
	}
	
	public ArrayList<PlayerData> getTeam2() {
		return Match.getTeam2();
	}
	
	public void setMatchResult(String MatchResult) {
		Match.setMatchResult(MatchResult);
	}
	
	public String getMatchResult() {
		return Match.getMatchResult();
	}
	
	public void updateList() {
		List.printPlayers(PlayerList);
		
	}
	
	public void updateMatchView() {
		MatchView.PrintMatchData(Match);
	}
	
}
