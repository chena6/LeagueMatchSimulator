package module;

import java.util.ArrayList;

public class PlayerList {
	
	private ArrayList<PlayerData> PlayerList;
	
	public void setPlayerList(ArrayList<PlayerData> PlayerList, PlayerData Player) {
		this.PlayerList = PlayerList;
		PlayerList.add(Player);
	}
	
	public ArrayList<PlayerData> getPlayerList() {
		return PlayerList;
	}
}
