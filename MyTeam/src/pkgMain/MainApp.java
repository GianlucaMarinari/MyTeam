package pkgMain;

import pkgData.Player;
https://github.com/GianlucaMarinari/MyTeam/blob/master/MyTeam/src/pkgMain/MainApp.java
public class MainApp {

	public static void main(String[] args) {
		
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("==" + player);
		
		Player player2 = new Player(4, "Hinteregger", "Defense");
		System.out.println("==" + player2);
		

	}

}
