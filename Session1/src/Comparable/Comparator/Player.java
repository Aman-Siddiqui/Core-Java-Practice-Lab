package Comparable.Comparator;
import java.util.*;

public class Player implements Comparable<Player>{

	private int ranking;
	private String name;
	private int age;

	public Player(int ranking, String name, int age) {
		this.ranking = ranking;
		this.name = name;
		this.age = age;	
	}

	@Override
	public String toString() {
		return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
	}

	public int getRanking() {
		return ranking;
	}
	@Override
	public int compareTo(Player player4) {
		return Integer.compare( getRanking(), player4.getRanking() );
		//Integer.compare(x, y) with return type int as 0 for equal, -1 if x is less than y or 1 otherwise
		
		//       59             67  returned -1
		//       59             45  returned  1

		//		    Player player3 = new Player(45, "Steven", 24);		 
		//		    Player player1 = new Player(59, "John", 20);
		//		    Player player2 = new Player(67, "Roger", 22);

	}

	public static void main(String[] args) {
		List<Player> footballTeam = new ArrayList<>();
		
		Player player1 = new Player(59, "John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Steven", 24);
		
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		System.out.println("Before Sorting : " + footballTeam);
		Collections.sort(footballTeam);
		System.out.println("After Sorting : " + footballTeam);

	}






}
