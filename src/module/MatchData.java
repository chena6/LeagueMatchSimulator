package module;
import java.util.*;


public class MatchData extends PlayerData {
	private ArrayList<PlayerData> Team1 = new ArrayList<PlayerData>();	
	private ArrayList<PlayerData> Team2 = new ArrayList<PlayerData>();
	private String MatchResult;
	
	
//	Create an arraylist of all the players in each team
	
	public void setTeam1 (ArrayList<PlayerData> Team1, PlayerData Player) {
		this.Team1 = Team1;
		Team1.add(Player);
	}
	
	public ArrayList<PlayerData> getTeam1() {
		return Team1;
	}
	
	public void setTeam2 (ArrayList<PlayerData> Team2, PlayerData Player) {
		this.Team2 = Team2;
		Team2.add(Player);
	}
	
	public ArrayList<PlayerData>getTeam2() {
		return Team2;
	}
	
	public void setMatchResult (String MatchResult) {
		this.MatchResult = MatchResult;
	}
	
	public String getMatchResult() {
		return MatchResult;
	}
	
	
	
}
