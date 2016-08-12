package view;


import module.PlayerList;

public class ListView {
	
	public void printPlayers(PlayerList PlayerList) {
		
		System.out.println("All Players: \n");
		
		for (int i = 0; i < PlayerList.getPlayerList().size(); i++) {
			
			System.out.println("Player: " + PlayerList.getPlayerList().get(i).getPlayerName() +
					" Kills: " + PlayerList.getPlayerList().get(i).getKills() + 
					" Deaths: " + PlayerList.getPlayerList().get(i).getDeaths() + 
					" Assists: " + PlayerList.getPlayerList().get(i).getAssists() + 
					" CS: " + PlayerList.getPlayerList().get(i).getCS());
	
		}
	}
	
	
	
}
