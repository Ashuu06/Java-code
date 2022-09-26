package corejava_initial.programs;

public class MainPlayer {

	public static void main(String[] args) {
		Player p = new Player();
		
		p.fees();
		p.stadium();
		
		p = new Cricketer();
		p.stadium();
		
		p = new Footballer();
		p.stadium();
		

	}

}
