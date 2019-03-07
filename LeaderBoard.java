import java.util.ArrayList;

public class LeaderBoard implements Comparable{
	private String name;
	private int score;
	private int rank;
	
	
	public LeaderBoard(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public int compareTo(Object o) {
		int comp=((LeaderBoard)o).getScore();
		return comp-this.score;
	}

	

	
	
	
	
	
}
